package com.dk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ProjectName: springboot_user_demo
 * @Package: com.dk
 * @ClassName: SpringbootUserDemoApplication
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/3/4 9:18
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/3/4 9:18
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@SpringBootApplication
@MapperScan("com.dk.mapper")
public class SpringbootUserDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootUserDemoApplication.class, args);
    }
}
