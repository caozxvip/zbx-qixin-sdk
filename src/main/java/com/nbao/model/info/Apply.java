package com.nbao.model.info;

/**
 * @Description 投保人信息
 * @Author caozhuoxiang
 * @Date 2019/8/1 14:38
 **/
public class Apply {

    private String name;
    private String cert;
    private String certtype;
    private String sex;
    private String birth;
    private String mail;
    private String mobile;
    private String relationWithInsurant;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    public String getCerttype() {
        return certtype;
    }

    public void setCerttype(String certtype) {
        this.certtype = certtype;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRelationWithInsurant() {
        return relationWithInsurant;
    }

    public void setRelationWithInsurant(String relationWithInsurant) {
        this.relationWithInsurant = relationWithInsurant;
    }
}
