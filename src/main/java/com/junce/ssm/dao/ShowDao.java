package com.junce.ssm.dao;

import com.junce.ssm.model.ShowListBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/1/2 0002.
 */
@Repository
public interface ShowDao {
    List<ShowListBean> getShowList();
}
