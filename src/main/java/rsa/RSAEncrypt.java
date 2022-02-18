package rsa;


import javax.crypto.Cipher;
import java.security.*;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author xiaodi.gou
 * @create 2022/2/17 2:37 下午
 */
public class RSAEncrypt {

    public static final int KEY_SIZE = 1024;
    public static final String ALGORITHM = "RSA";
    public static final String CHARSET = "UTF-8";
    private static Map<Integer, String> keyMap = new HashMap<>();

    public static void main(String[] args) throws Exception {
        //生成密钥对
        genKeyPair();
        String publicKey = keyMap.get(0);
        String privateKey = keyMap.get(1);
        System.out.println("公钥:" + publicKey);
        System.out.println("私钥:" + privateKey + "\n");
        System.out.println("-------------------------");
        String message = "wuya 好爽";

        //用公钥加密得到密文
        String cipher = encrypt(message, publicKey);
        System.out.println("RSA加密后密文:" + cipher);

        //用私钥解密得到明文
        String messageDe = decrypt(cipher, privateKey);
        System.out.println("RSA解密后明文:" + messageDe);


    }

    //随机生成密钥对
    public static void genKeyPair() throws NoSuchAlgorithmException {

        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance(ALGORITHM);
        //初始化密钥对生成器
        keyPairGen.initialize(KEY_SIZE, new SecureRandom());
        //生成一个密钥对保存在keyPair中
        KeyPair keyPair = keyPairGen.generateKeyPair();
        //得到私钥
        RSAPrivateCrtKey privateCrtKey = (RSAPrivateCrtKey) keyPair.getPrivate();
        //得到公钥
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        String publicKeyString = Base64.getEncoder().encodeToString(publicKey.getEncoded());

        //得到私钥字符串
        String privateKeyString = Base64.getEncoder().encodeToString(privateCrtKey.getEncoded());
        //将公钥和私钥保存到Map
        keyMap.put(0, publicKeyString);
        keyMap.put(1, privateKeyString);
    }

    public static String encrypt(String str, String publicKey) throws Exception {
        //base64编码的公钥
        byte[] decoded = Base64.getDecoder().decode(publicKey);
        RSAPublicKey pubKey = (RSAPublicKey) KeyFactory.getInstance(ALGORITHM).generatePublic(new X509EncodedKeySpec(decoded));
        //RSA加密
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, pubKey);
        String outStr = Base64.getEncoder().encodeToString(cipher.doFinal(str.getBytes(CHARSET)));
        return outStr;
    }

    public static String decrypt(String str, String privateKey) throws Exception {
        //64位解码加密后的字符串
        byte[] inputByte = Base64.getDecoder().decode(str);
        //base64编码的私钥
        byte[] decoded = Base64.getDecoder().decode(privateKey);
        RSAPrivateCrtKey priKey = (RSAPrivateCrtKey) KeyFactory.getInstance(ALGORITHM).generatePrivate(new PKCS8EncodedKeySpec(decoded));
        //RSA解密
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, priKey);
        String outStr = new String(cipher.doFinal(inputByte));
        return outStr;
    }


}
