package com.boot.test;

import com.boot.cache.CacheApplication;
import com.boot.cache.entity.User;
import com.boot.cache.service.UserService;
import com.boot.cache.utils.RedisUtils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CacheApplication.class)
public class CacheTest {
    @Resource
    private UserService userService ;
    // 分别测试：增、改、查、删,四个方法
    @Test
    public void testAdd (){
        User user = new User() ;
        user.setId(1);
        user.setName("cicada");
        userService.addUser(user) ;
    }
    @Test
    public void testUpdate (){
        userService.updateUser(2) ;
    }
    @Test
    public void testSelect (){
        userService.selectUser(3) ;
    }
    @Test
    public void testDelete (){
        userService.deleteUser(3) ;
    }
    
    @Autowired
    public RedisUtils redisUtils;
    
    @Test
    public void testAdd1() {
    	redisUtils.add("1243", "123456");
    }
    
    @Test
    public void testDel() {
    	redisUtils.remove("1243");
    }

}
