package com.ytd.pojo;

public class UserEduInfo {
    private Integer usereduinfoid;

    private Integer userid;

    private Short startyear;

    private String schoolname;

    private String department;

    private Short schoolelevel;

    public Integer getUsereduinfoid() {
        return usereduinfoid;
    }

    public void setUsereduinfoid(Integer usereduinfoid) {
        this.usereduinfoid = usereduinfoid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Short getStartyear() {
        return startyear;
    }

    public void setStartyear(Short startyear) {
        this.startyear = startyear;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname == null ? null : schoolname.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Short getSchoolelevel() {
        return schoolelevel;
    }

    public void setSchoolelevel(Short schoolelevel) {
        this.schoolelevel = schoolelevel;
    }
}