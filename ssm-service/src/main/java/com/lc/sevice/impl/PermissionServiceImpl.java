package com.lc.sevice.impl;


import com.lc.dao.IPermissionDao;
import com.lc.domain.Permission;
import com.lc.sevice.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private IPermissionDao permissionDao;


    public void deleteById(String id) throws Exception {
        permissionDao.deleteFromRole_Permission(id);
        permissionDao.deleteById(id);
    }


    public Permission findById(String id) throws Exception {
        return permissionDao.findById(id);
    }


    public void save(Permission permission) throws Exception{
        permissionDao.save(permission);
    }


    public List<Permission> findAll() throws Exception{
        return permissionDao.findAll();
    }
}
