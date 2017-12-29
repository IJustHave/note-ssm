package com.junce.ssm.dao;

import com.junce.ssm.model.ActiveBean;
import com.junce.ssm.model.NoticeBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/12/29 0029.
 */
@Repository
public interface ActiveDao {
    List<ActiveBean> queryActive();
    List<NoticeBean> queryNotice();
}
