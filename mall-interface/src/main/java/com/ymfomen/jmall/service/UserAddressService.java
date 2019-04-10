package com.ymfomen.jmall.service;

import com.ymfomen.jmall.bean.UserAddress;

import java.util.List;

public interface UserAddressService {
    public List<UserAddress> getUserAddressList(String userId);
}
