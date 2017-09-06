package com.junce.ssm.controller;

import com.junce.ssm.constant.CommConstant;
import com.junce.ssm.dto.Result;
import com.junce.ssm.model.Note;
import com.junce.ssm.model.NoteQuery;
import com.junce.ssm.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
@Controller
@RequestMapping("/note")
public class NoteController {

    @Autowired
    NoteService noteService;

    @ResponseBody
    @RequestMapping("/addNote")
    public Result addNote(Note note) {
        if (StringUtils.isEmpty(note.getUserId())) {
            return new Result(CommConstant.USERNAME_IS_EMPTY, "用户ID为空", null);
        }

        if (StringUtils.isEmpty(note.getNoteTitle())) {
            return new Result(CommConstant.NOTE_TITLE_IS_EMPTY, "日志标题为空", null);
        }

        if (StringUtils.isEmpty(note.getNoteContent())) {
            return new Result(CommConstant.NOTE_TITLE_IS_EMPTY, "日志内容为空", null);
        }
        note.setNoteCreateDate(new Date());
        note.setNoteId(UUID.randomUUID().toString());
        note.setNoteStatus(0);
        return noteService.addNote(note);
    }

    @ResponseBody
    @RequestMapping("/getNoteList")
    public Result<Map<String, Object>> getNoteList(NoteQuery query) {
        if (StringUtils.isEmpty(query.getUserId())) {
            return new Result(CommConstant.USERNAME_IS_EMPTY, "用户ID为空", null);
        }
        Map<String, Object> noteMap = noteService.getNote(query);
        return new Result<>(CommConstant.SUCCESS, "查询成功", noteMap);
    }
}
