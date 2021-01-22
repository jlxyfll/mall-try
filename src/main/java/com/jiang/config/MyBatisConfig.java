package com.jiang.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @title: MyBatis配置类
 * @Author Tang Xiaojiang
 * @Date: 2021/1/22 8:23
 * @Version 1.0
 */
@Configuration
@MapperScan(value = "com.jiang.mbg.mapper")
public class MyBatisConfig {
}
