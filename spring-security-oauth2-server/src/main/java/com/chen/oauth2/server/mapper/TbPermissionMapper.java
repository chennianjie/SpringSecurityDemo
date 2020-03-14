package com.chen.oauth2.server.mapper;

import com.chen.oauth2.server.domain.TbPermission;
import com.tk.mybatis.mapper.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPermissionMapper extends MyMapper<TbPermission> {


    List<TbPermission> selectByUserId(@Param("userId") Long userId);
}