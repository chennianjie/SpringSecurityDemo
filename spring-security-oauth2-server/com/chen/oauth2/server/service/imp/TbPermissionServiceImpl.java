package com.chen.oauth2.server.service.imp;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.chen.oauth2.server.mapper.TbPermissionMapper;
import com.chen.oauth2.server.service.TbPermissionService;
@Service
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;

}
