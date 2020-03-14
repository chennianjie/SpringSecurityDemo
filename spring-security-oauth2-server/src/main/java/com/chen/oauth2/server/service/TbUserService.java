package com.chen.oauth2.server.service;

import com.chen.oauth2.server.domain.TbUser;

public interface TbUserService{

    TbUser getByUsername(String username);
}
