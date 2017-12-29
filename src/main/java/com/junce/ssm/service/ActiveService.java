package com.junce.ssm.service;


import com.junce.ssm.model.ActiveBean;
import com.junce.ssm.model.NoticeBean;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/29 0029.
 */
public interface ActiveService {

    List<ActiveBean> getActives();

    List<NoticeBean> getNotice();
}
