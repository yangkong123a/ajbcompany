package com.ajb.study.domain;

import java.util.Date;

/**
 * @author HeYi
 * @Description:
 * @date 2019/7/24 15:35
 */
public class Student {
    private Long sno;
    private String name;
    private int age;
    private String sex;
    private Date entryDate;
    private Date graduationDate;
    private String address;
    private int classID;
    private String createBy;
    private Date createDate;
    private String modifyBy;
    private Date modifyDate;

    public Long getSno() {
        return sno;
    }
    public void setSno(Long sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getEntryDate() {
        return entryDate;
    }
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }
    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getClassID() {
        return classID;
    }
    public void setClassID(int classID) {
        this.classID = classID;
    }

    public String getCreateBy() {
        return createBy;
    }
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getModifyBy() {
        return modifyBy;
    }
    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", entryDate=" + entryDate +
                ", graduationDate=" + graduationDate +
                ", address='" + address + '\'' +
                ", classID=" + classID +
                ", createBy='" + createBy + '\'' +
                ", createDate=" + createDate +
                ", modifyBy='" + modifyBy + '\'' +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
