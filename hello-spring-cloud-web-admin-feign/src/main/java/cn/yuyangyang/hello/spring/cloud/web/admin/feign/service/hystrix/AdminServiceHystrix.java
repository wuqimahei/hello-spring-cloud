package cn.yuyangyang.hello.spring.cloud.web.admin.feign.service.hystrix;

import cn.yuyangyang.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String msg) {
        return String.format("Feign 熔断器, msg：%s", msg);
    }
}
