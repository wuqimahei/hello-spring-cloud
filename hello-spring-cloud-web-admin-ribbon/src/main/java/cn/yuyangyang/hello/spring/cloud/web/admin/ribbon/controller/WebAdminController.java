package cn.yuyangyang.hello.spring.cloud.web.admin.ribbon.controller;

import cn.yuyangyang.hello.spring.cloud.web.admin.ribbon.service.AdminService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAdminController {

    @Autowired
    private AdminService adminService;

    /**
     * http://localhost:8764/hi?msg=123
     * @param msg
     * @return
     */

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(String msg){
        return adminService.sayHi(msg);
    }
}
