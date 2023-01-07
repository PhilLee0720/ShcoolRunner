package com.lee.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.lee.reggie.common.R;
import com.lee.reggie.pojo.User;
import com.lee.reggie.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;
    //@PostMapping("/sendMsg")
   /* public R<String> sendMsg(@RequestBody User user, HttpSession session){
        String phone = user.getPhone();
        if(!StringUtils.isEmpty(phone)){
            String code = ValidateCodeUtils.generateValidateCode(4).toString();
            log.info("code={}",code);
            session.setAttribute(phone,code);
            return R.success("Send succeed");
        }
        return R.error("Send failed");
    }*/
    @PostMapping("/login")
    public R<User> login(@RequestBody User user, HttpSession session){
        /*String code = map.get("code").toString();*/
        /*log.info("code=>{}",code);*/
        //Object codeInSession = session.getAttribute(phone);
        //if(codeInSession != null && codeInSession.equals(code))
        String phone = user.getPhone();
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getPhone,phone);
        User one = userService.getOne(queryWrapper);
        if(one == null){
            one = new User();
            one.setPhone(phone);
            one.setStatus(1);
            userService.save(one);
        }
        session.setAttribute("user",one.getId());
        return R.success(one);

    }
}
