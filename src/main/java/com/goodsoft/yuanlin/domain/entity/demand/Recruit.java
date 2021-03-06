package com.goodsoft.yuanlin.domain.entity.demand;

import java.beans.Transient;
import java.util.Objects;

/**
 * Blueprint domain. 人员招聘表实体
 * <p>
 * author 严彬荣
 * version v1.0
 */
public class Recruit implements java.io.Serializable {

    // 表ID
    private String rid;
    // 职位
    private String positions;
    // 企业名称
    private String companyName;
    //企业简介
    private String companyIntro;
    // 企业地址
    private String companyAdress;
    // 工作地点
    private String workAdress;
    //工作内容
    private String content;
    // 联系人
    private String contact;
    //email邮箱
    private String email;
    //月薪
    private String money;
    //工作经历
    private String experience;
    // 联系电话
    private String tel;
    //自我评价
    private String evaluate;
    //发布日期
    private String date;
    // 发布时间
    private String time;
    //招聘类型（招聘 1/求职 2）
    private int tp;
    //工作性质(全职 1/兼职 2)
    private int characters;
    //企业
    private String comp;
    // 用户编号
    private String uid;

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getPositions() {
        return positions;
    }

    public void setPositions(String positions) {
        this.positions = positions;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyIntro() {
        return companyIntro;
    }

    public void setCompanyIntro(String companyIntro) {
        this.companyIntro = companyIntro;
    }

    public String getCompanyAdress() {
        return companyAdress;
    }

    public void setCompanyAdress(String companyAdress) {
        this.companyAdress = companyAdress;
    }

    public String getWorkAdress() {
        return workAdress;
    }

    public void setWorkAdress(String workAdress) {
        this.workAdress = workAdress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getTp() {
        return tp;
    }

    public void setTp(int tp) {
        this.tp = tp;
    }

    public int getCharacters() {
        return characters;
    }

    public void setCharacters(int characters) {
        this.characters = characters;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    @Transient
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recruit)) return false;
        Recruit recruit = (Recruit) o;
        return tp == recruit.tp &&
                characters == recruit.characters &&
                Objects.equals(rid, recruit.rid) &&
                Objects.equals(positions, recruit.positions) &&
                Objects.equals(companyName, recruit.companyName) &&
                Objects.equals(companyIntro, recruit.companyIntro) &&
                Objects.equals(companyAdress, recruit.companyAdress) &&
                Objects.equals(workAdress, recruit.workAdress) &&
                Objects.equals(content, recruit.content) &&
                Objects.equals(contact, recruit.contact) &&
                Objects.equals(email, recruit.email) &&
                Objects.equals(money, recruit.money) &&
                Objects.equals(experience, recruit.experience) &&
                Objects.equals(tel, recruit.tel) &&
                Objects.equals(evaluate, recruit.evaluate) &&
                Objects.equals(date, recruit.date) &&
                Objects.equals(time, recruit.time) &&
                Objects.equals(comp, recruit.comp) &&
                Objects.equals(uid, recruit.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rid, positions, companyName, companyIntro, companyAdress, workAdress, content, contact, email, money, experience, tel, evaluate, date, time, tp, characters, comp, uid);
    }
}
