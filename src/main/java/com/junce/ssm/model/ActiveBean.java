package com.junce.ssm.model;

/**
 * Created by Administrator on 2017/12/29 0029.
 */
public class ActiveBean {
    private int activeId;
    private String activeName;
    private String activeImgUrl;
    private String activeUrl;

    public int getActiveId() {
        return activeId;
    }

    public void setActiveId(int activeId) {
        this.activeId = activeId;
    }

    public String getActiveName() {
        return activeName;
    }

    public void setActiveName(String activeName) {
        this.activeName = activeName;
    }

    public String getActiveImgUrl() {
        return activeImgUrl;
    }

    public void setActiveImgUrl(String activeImgUrl) {
        this.activeImgUrl = activeImgUrl;
    }

    public String getActiveUrl() {
        return activeUrl;
    }

    public void setActiveUrl(String activeUrl) {
        this.activeUrl = activeUrl;
    }

    @Override
    public String toString() {
        return "ActiveBean{" +
                "activeId=" + activeId +
                ", activeName='" + activeName + '\'' +
                ", activeImgUrl='" + activeImgUrl + '\'' +
                ", activeUrl='" + activeUrl + '\'' +
                '}';
    }
}
