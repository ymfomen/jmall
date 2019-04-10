package com.ymfomen.jmall.mallusermanage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ymfomen.jmall.bean.UserInfo;
import com.ymfomen.jmall.mallusermanage.mapper.UserInfoMapper;
import com.ymfomen.jmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> getUserInfoList() {
        return userInfoMapper.selectAll();
    }
}
