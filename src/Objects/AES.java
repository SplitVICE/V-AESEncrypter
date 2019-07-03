package Objects;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AES {

    private static SecretKeySpec secretKey;
    private static byte[] key;

    //Este metodo genera la key para desencriptar una cadena de texto AES
    public void setKey(String myKey) {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, "AES");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    //Metodo que encripta la cadena de texto
    //Requiere la key en el espacio "secret"
    public String encrypt(String strToEncrypt, String secret) {
        try {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }

    //Metodo que desencripta la cadena de texto
    //Requiere la key en el espacio "secret"
    public String decrypt(String strToDecrypt, String secret) {
        try {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        } catch (Exception e) {
//            System.out.println("Error while decrypting: " + e.toString());
            return e.toString();
        }
    }

    //It true, the key password is incorrect.
    public boolean is_key_password_correct(String output_string_gave) {
        if (output_string_gave.contains("BadPadding")) {
            return false;
        } else {
            return true;
        }
    }

    //If the text is not AES syntax.
    public boolean is_the_text_AES(String output_string_gave) {
        if (output_string_gave.contains("Illegal")) {
            return false;
        } else {
            return true;
        }
    }

}
