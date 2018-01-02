package com.junce.ssm.service.impl;

import com.junce.ssm.dao.ShowDao;
import com.junce.ssm.model.ShowListBean;
import com.junce.ssm.service.ShowService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/1/2 0002.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ShowServiceImpl implements ShowService {

    @Resource
    ShowDao showDao;

    @Override
    public List<ShowListBean> getShowList() {
        return showDao.getShowList();
    }
}
