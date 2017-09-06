package com.junce.ssm.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
public class Note {
    private String noteId;
    private String noteTitle;
    private Date noteCreateDate;
    private String noteContent;
    private int noteStatus;
    private String userId;

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public Date getNoteCreateDate() {
        return noteCreateDate;
    }

    public void setNoteCreateDate(Date noteCreateDate) {
        this.noteCreateDate = noteCreateDate;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public int getNoteStatus() {
        return noteStatus;
    }

    public void setNoteStatus(int noteStatus) {
        this.noteStatus = noteStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Note{" +
                "noteId='" + noteId + '\'' +
                ", noteTitle='" + noteTitle + '\'' +
                ", noteCreateDate='" + noteCreateDate + '\'' +
                ", noteContent='" + noteContent + '\'' +
                ", noteStatus='" + noteStatus + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
