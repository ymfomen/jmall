package com.ymfomen.jmall.mallorderweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ymfomen.jmall.bean.UserAddress;
import com.ymfomen.jmall.service.UserAddressService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class OrderController {
    @Reference
    private UserAddressService userAddressService;

    @RequestMapping("trade")
    public List<UserAddress> trade(HttpServletRequest request){
        String userId = request.getParameter("userId");
        List<UserAddress> userAddressList = userAddressService.getUserAddressList(userId);
        return  userAddressList;
    }
}
