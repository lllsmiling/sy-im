package com.sy.config;

import com.sy.aop.ViewInstance;
import com.sy.view.LoginView;
import com.sy.view.MainView;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author lllsmiling
 * @create 2017-12-13 17:48
 **/
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public ViewInstance viewInstance () {
        return new ViewInstance();
    }
    /**
     * 初始化登陆界面
     * @return
     */
    @Bean
    public LoginView loginView() {
        return new LoginView();
    }

    @Bean
    public MainView mainView() {
        return new MainView();
    }

}
