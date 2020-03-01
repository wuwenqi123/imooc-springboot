package com.imooc.controller;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @autor 武大帅
 * @date 2019/10/13 12:57
 */
//@Controller
@RestController//@RestController=@Controller+@ResponseBody
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/getUser")
    public IMoocJSONResult getUser() {
        User user = new User();
        user.setAge(18);
        user.setBirthday(new Date());
        user.setName("武文琦");
        user.setDesc("1");
        return IMoocJSONResult.ok(user);
    }

    @RequestMapping("/getUserJson")
    public IMoocJSONResult getUserJson() {
        User user = new User();
        user.setAge(211);
        user.setBirthday(new Date());
        user.setName("武文琦121");
        return IMoocJSONResult.ok(user);
    }
}
