package com.junce.ssm.service;

import com.junce.ssm.dto.Result;
import com.junce.ssm.model.Note;
import com.junce.ssm.model.NoteQuery;

import java.util.Map;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
public interface NoteService {

    Result addNote(Note note);

    Map<String, Object> getNote(NoteQuery query);
}
