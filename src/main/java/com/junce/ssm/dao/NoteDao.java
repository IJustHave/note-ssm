package com.junce.ssm.dao;

import com.junce.ssm.model.Note;
import com.junce.ssm.model.NoteQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
@Repository
public interface NoteDao {

    int addNote(Note note);

    List<Note> getNotes(NoteQuery query);

    Integer getNoteCount(@Param("userId") String userId);
}
