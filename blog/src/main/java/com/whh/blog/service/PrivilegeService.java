package com.whh.blog.service;


import com.whh.blog.model.UserPrivilege;
import org.springframework.stereotype.Service;

/**
 * author bebetter159
 * date  未详
 */
public interface PrivilegeService {
     void addPrivilege(UserPrivilege userPrivilege);
     boolean updatePrivilege(UserPrivilege userPrivilege);
}
