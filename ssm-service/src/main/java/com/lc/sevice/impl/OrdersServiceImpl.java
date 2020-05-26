package com.lc.sevice.impl;

import com.github.pagehelper.PageHelper;
import com.lc.dao.IOrdersDao;
import com.lc.domain.Orders;
import com.lc.sevice.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;


    public List<Orders> findAll(int page, int size) throws Exception {

        //参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        PageHelper.startPage(page, size);
        return ordersDao.findAll();
    }


    public Orders findById(String ordersId) throws Exception{
        return ordersDao.findById(ordersId);
    }
}
