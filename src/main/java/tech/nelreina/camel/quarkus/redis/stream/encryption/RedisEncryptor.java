package tech.nelreina.camel.quarkus.redis.stream.encryption;

public class RedisEncryptor {

    private final String key;
    private final String iv;
    private final boolean enabled;

    public RedisEncryptor(String key, String iv, boolean enabled) {
        this.key = key;
        this.iv = iv;
        this.enabled = enabled;
    }

    public String encrypt(String toEncrypt) {
        String result = toEncrypt;

        if(enabled) {
            //TODO do decryption
        }

        return result;
    }

    public String decrypt(String toDecrypt) {
        String result = toDecrypt;

        if(enabled) {
            //TODO do decryption
        }

        return result;
    }
}
