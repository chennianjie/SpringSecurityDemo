package com.chen.oauth2.server.service;

import com.chen.oauth2.server.domain.TbPermission;

import java.util.List;

public interface TbPermissionService{

    List<TbPermission> selectByUserId(Long userId);
}
