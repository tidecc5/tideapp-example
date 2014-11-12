package com.tidecc.shiro.chapter06.service;

import com.tidecc.shiro.chapter06.dao.PermissionDao;
import com.tidecc.shiro.chapter06.dao.PermissionDaoImpl;
import com.tidecc.shiro.chapter06.entity.Permission;


/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public class PermissionServiceImpl implements PermissionService {

    private PermissionDao permissionDao = new PermissionDaoImpl();

    public Permission createPermission(Permission permission) {
        return permissionDao.createPermission(permission);
    }

    public void deletePermission(Long permissionId) {
        permissionDao.deletePermission(permissionId);
    }
}
