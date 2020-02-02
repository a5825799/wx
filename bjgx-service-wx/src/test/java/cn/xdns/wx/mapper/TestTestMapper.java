package cn.xdns.wx.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TestTestMapper {

    @Autowired
    TestMapper testMapper;

    @Test
    public void test(){
        List<cn.xdns.wx.pojo.Test> tests = testMapper.selectByExample(null);
        System.out.println(tests.size());
    }


}
