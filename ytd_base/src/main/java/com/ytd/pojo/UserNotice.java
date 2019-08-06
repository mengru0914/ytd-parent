package com.ytd.pojo;

import java.util.Date;

public class UserNotice {
    private Integer id;

    private String title;

    private String content;

    private Boolean isdisplay;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Boolean getIsdisplay() {
        return isdisplay;
    }

    public void setIsdisplay(Boolean isdisplay) {
        this.isdisplay = isdisplay;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}