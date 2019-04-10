package com.ymfomen.jmall.mallusermanage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ymfomen.jmall.bean.UserAddress;
import com.ymfomen.jmall.mallusermanage.mapper.UserAddressMapper;
import com.ymfomen.jmall.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserAddressServiceImpl implements UserAddressService {
    @Autowired
    private UserAddressMapper userAddressMapper;
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        List<UserAddress> addressList = null;
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        addressList = userAddressMapper.select(userAddress);
        return addressList;
    }
}
