package cn.xdns.wx.service.impl;

import cn.xdns.wx.mapper.TestMapper;
import cn.xdns.wx.pojo.Test;
import cn.xdns.wx.pojo.page.TestVo;
import cn.xdns.wx.service.TestServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("testService")
@Transactional
public class TestServiceImpl implements TestServiceI {

    @Autowired
    TestMapper testMapper;

    @Override
    public List<Test> findTest(Test test) {
        TestVo testVo = new TestVo();
        return testMapper.selectByExample(testVo);
    }
}
