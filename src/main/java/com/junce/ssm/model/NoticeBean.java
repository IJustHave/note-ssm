package com.junce.ssm.model;

/**
 * Created by Administrator on 2017/12/29 0029.
 */
public class NoticeBean {
    private int noticeId;
    private String noticeName;
    private String noticeUrl;

    public int getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(int noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeName() {
        return noticeName;
    }

    public void setNoticeName(String noticeName) {
        this.noticeName = noticeName;
    }

    public String getNoticeUrl() {
        return noticeUrl;
    }

    public void setNoticeUrl(String noticeUrl) {
        this.noticeUrl = noticeUrl;
    }

    @Override
    public String toString() {
        return "NoticeBean{" +
                "noticeId=" + noticeId +
                ", noticeName='" + noticeName + '\'' +
                ", noticeUrl='" + noticeUrl + '\'' +
                '}';
    }
}
