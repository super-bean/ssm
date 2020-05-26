package com.lc.sevice.impl;


import com.lc.dao.IRoleDao;
import com.lc.domain.Permission;
import com.lc.domain.Role;
import com.lc.sevice.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private IRoleDao roleDao;


    public void deleteRoleById(String roleId) {
        //从user_role表中删除
        roleDao.deleteFromUser_RoleByRoleId(roleId);
        //从role_permission表中删除
        roleDao.deleteFromRole_PermissionByRoleId(roleId);
        //从role表中删除
        roleDao.deleteRoleById(roleId);
    }


    public void addPermissionToRole(String roleId, String[] permissionIds) {
        for(String permissionId:permissionIds){
            roleDao.addPermissionToRole(roleId,permissionId);
        }
    }


    public Role findById(String roleId) {
        return roleDao.findById(roleId);
    }


    public List<Permission> findOtherPermissions(String roleId) {
        return roleDao.findOtherPermissions(roleId);
    }


    public void save(Role role) {
        roleDao.save(role);
    }


    public List<Role> findAll() throws Exception{
        return roleDao.findAll();
    }
}
