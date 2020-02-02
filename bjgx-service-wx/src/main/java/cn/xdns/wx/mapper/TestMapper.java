package cn.xdns.wx.mapper;

import cn.xdns.wx.pojo.Test;
import cn.xdns.wx.pojo.page.TestVo;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface TestMapper {
    long countByExample(TestVo example);

    int deleteByExample(TestVo example);

    int deleteByPrimaryKey(String id);

    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectByExample(TestVo example);

    Test selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestVo example);

    int updateByExample(@Param("record") Test record, @Param("example") TestVo example);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}