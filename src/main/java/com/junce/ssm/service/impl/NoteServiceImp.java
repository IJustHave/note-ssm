package com.junce.ssm.service.impl;

import com.junce.ssm.constant.CommConstant;
import com.junce.ssm.dao.NoteDao;
import com.junce.ssm.dto.Result;
import com.junce.ssm.model.Note;
import com.junce.ssm.model.NoteQuery;
import com.junce.ssm.service.NoteService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class NoteServiceImp implements NoteService {

    @Resource
    NoteDao dao;

    @Override
    public Result addNote(Note note) {
        int result = dao.addNote(note);
        if (result > 0) {
            return new Result(CommConstant.SUCCESS, "保存成功", null);
        } else {
            return new Result(CommConstant.FAILD, "保存失败", null);
        }
    }

    @Override
    public Map<String, Object> getNote(NoteQuery query) {
        Map<String, Object> resultMap = new HashMap<>();

        int count = dao.getNoteCount(query.getUserId());
        int page = count / query.getLimit();
        int last = count % query.getLimit();
        if (last > 0) {
            ++page;
        }

        if (query.getPageNum() == 0) {
            query.setStart(0);
        } else {
            query.setStart((query.getPageNum() - 1) * query.getLimit());
        }

        List<Note> noteList = dao.getNotes(query);
        resultMap.put("datas", noteList);
        if (query.getPageNum() < page) {
            resultMap.put("hasNextPage", true);
        } else {
            resultMap.put("hasNextPage", false);
        }
        return resultMap;
    }
}
