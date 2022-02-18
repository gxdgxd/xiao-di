package com.xiaodi.qa.des;

import com.sun.org.apache.xml.internal.security.utils.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

/**
 * @Author xiaodi.gou
 * @create 2022/2/17 11:27 上午
 */
public class DESEncrypt {

    public static final String Alggeritnm = "DES";

    public static void main(String[] args) throws Exception {
        //定义密钥
        String key = "12345678";

        //明文
        String text = "wuya 好爽";
        //加密
        String cipher = encryDesCipher(text, key);
        System.out.println("DES加密后密文:" + cipher);

        //解密
        text = decryptDesCipher(cipher, key);
        System.out.println("DES解密后明文:" + text);


    }

    //加密
    private static String encryDesCipher(String text, String origKey) throws Exception {
        Key key = new SecretKeySpec(origKey.getBytes(), Alggeritnm);
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return Base64.encode(cipher.doFinal(text.getBytes()));

    }

    //解密
    private static String decryptDesCipher(String text, String origKey) throws Exception {
        Key key = new SecretKeySpec(origKey.getBytes(), Alggeritnm);
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        return new String(cipher.doFinal(Base64.decode(text)));
    }

}
