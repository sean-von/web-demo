package com.smikevon.service;

import com.smikevon.dao.DemoMapper;
import com.smikevon.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;

/**
 * Created by fengxiao on 15-3-31.
 */
@Service
public class DemoService {
    
    @Resource
    private DemoMapper demoDao;
    
    public List<User> getUsers(){
        System.out.println("调用了service层");
        List<User> list = demoDao.getUsers();
        System.out.println("真正的数据库调用:"+list.size());
        return list;
    }
}
