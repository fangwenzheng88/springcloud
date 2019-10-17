package com.example.service;

import com.example.entity.Role;
import com.example.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

//    @Autowired
//    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByUsername(String username) {
        UserInfo usr = new UserInfo();
        usr.setId(1);
        usr.setUsername("username001");
        usr.setPassword("$2a$10$15XaGaeE61y9yCzm/Velp.JXMDP7vJCte4dJ1yDyQrE45mOjdjAVm");
        List<Role> roles = new ArrayList<Role>();
        roles.add(new Role(1,"admin001"));
        roles.add(new Role(2,"admin002"));
        usr.setRoles(roles);
        return usr;
    }
}
