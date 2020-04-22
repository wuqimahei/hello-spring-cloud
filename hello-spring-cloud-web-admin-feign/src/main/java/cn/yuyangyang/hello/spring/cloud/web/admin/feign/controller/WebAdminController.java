package cn.yuyangyang.hello.spring.cloud.web.admin.feign.controller;

import cn.yuyangyang.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAdminController {

    @Autowired
    private AdminService adminService;


    /**
     * http://localhost:8765/hi?msg=123
     * @param msg
     * @return
     */
    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(String msg){
        return adminService.sayHi(msg);
    }
}
