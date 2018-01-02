package com.junce.ssm.service.impl;

import com.junce.ssm.dao.ActiveDao;
import com.junce.ssm.model.ActiveBean;
import com.junce.ssm.model.NoticeBean;
import com.junce.ssm.service.ActiveService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/12/29 0029.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ActiveServiceImpl implements ActiveService {

    @Resource
    ActiveDao activeDao;

    @Override
    public List<ActiveBean> getActives() {
//        Map<String, Object> resultMap = new HashMap<>();
        List<ActiveBean> activeBeans = activeDao.queryActive();
//        resultMap.put("data", activeBeans);
        return activeBeans;
    }

    @Override
    public List<NoticeBean> getNotice() {
//        Map<String ,Object> resultMap = new HashMap<>();
        List<NoticeBean> noticeBeans = activeDao.queryNotice();
//        resultMap.put("data",noticeBeans);
        return noticeBeans;
    }
}
