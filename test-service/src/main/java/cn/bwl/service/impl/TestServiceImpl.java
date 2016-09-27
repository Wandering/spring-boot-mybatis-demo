package cn.bwl.service.impl;

import cn.bwl.dao.ITestDAO;
import cn.bwl.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yangyongping on 16/9/22.
 */
@Service("TestServiceImpl")
public class TestServiceImpl implements ITestService{
    @Autowired
    private ITestDAO testDAO;
    @Override
    public Integer test() {
        return testDAO.test();
    }
}
