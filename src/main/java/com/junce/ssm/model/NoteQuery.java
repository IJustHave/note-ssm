package com.junce.ssm.model;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
public class NoteQuery {
    private String userId;
    private int pageNum = 1;
    private int limit = 10;

    private int start=0;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "NoteQuery{" +
                "userId='" + userId + '\'' +
                ", pageNum=" + pageNum +
                ", limit=" + limit +
                '}';
    }
}
