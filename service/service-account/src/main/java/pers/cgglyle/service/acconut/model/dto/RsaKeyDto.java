package pers.cgglyle.service.acconut.model.dto;

/**
 * RSA256 key 实体类
 *
 * @author cgglyle
 * @date 2021-12-24 14:38
 */
public class RsaKeyDto {
    private String publicKey;
    private String privateKey;

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
}
