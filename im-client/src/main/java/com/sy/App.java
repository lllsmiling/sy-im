package com.sy;

import com.sy.app.AppContext;
import com.sy.view.LoginView;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;

/**
 * 启动主类
 *
 * @author lllsmiling
 * @create 2017-12-13 16:15
 **/
@Component
public class App extends Application{
    private LoginView loginView;
    public App() {
        super();
        this.loginView = AppContext.context.getBean(LoginView.class);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        AppContext.stage = primaryStage;
        loginView.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
