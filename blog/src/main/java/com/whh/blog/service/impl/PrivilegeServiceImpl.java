package com.whh.blog.service.impl;

import com.whh.blog.model.UserPrivilege;
import com.whh.blog.service.PrivilegeService;
import com.whh.blog.Mapper.PrivilegeMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrivilegeServiceImpl implements PrivilegeService {
    /**
     * 注入privilegeMapper接口
     */
    @Autowired
    PrivilegeMapper privilegeMapper;
    @Override
    public void addPrivilege(UserPrivilege userPrivilege) {
        privilegeMapper.addPrivilege(userPrivilege);
    }

    @Override
    public boolean updatePrivilege(UserPrivilege userPrivilege) {
        return privilegeMapper.updatePrivilege(userPrivilege);
    }
}
