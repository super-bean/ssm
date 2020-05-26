package com.lc.sevice.impl;

import com.lc.dao.ISysLogDao;
import com.lc.domain.SysLog;
import com.lc.sevice.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SysLogServiceImpl implements ISysLogService {

    @Autowired
    private ISysLogDao sysLogDao;


    public List<SysLog> findAll() throws Exception {
        return sysLogDao.findAll();
    }


    public void save(SysLog sysLog) throws Exception {
        sysLogDao.save(sysLog);
    }
}
