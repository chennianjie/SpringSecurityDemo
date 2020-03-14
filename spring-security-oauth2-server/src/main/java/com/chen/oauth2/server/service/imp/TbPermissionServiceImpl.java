package com.chen.oauth2.server.service.imp;

import com.chen.oauth2.server.domain.TbPermission;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.chen.oauth2.server.mapper.TbPermissionMapper;
import com.chen.oauth2.server.service.TbPermissionService;

import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {

        return tbPermissionMapper.selectByUserId(userId);
    }
}
