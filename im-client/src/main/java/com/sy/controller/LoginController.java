package com.sy.controller;

import com.sy.app.AppContext;
import com.sy.view.MainView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author lllsmiling
 * @create 2017-12-13 16:25
 **/
public class LoginController implements Initializable {
    @FXML
    private Button login;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private CheckBox rememberPsw;
    @FXML
    private CheckBox autoLogin;
    @FXML
    private ImageView close;
    @FXML
    private ImageView min;

    @FXML
    private Pane loginError;

    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    private void login() throws IOException {
        MainView mainView = AppContext.context.getBean(MainView.class);
        mainView.show();
    }
    @FXML
    private void close() {
        AppContext.exit();
    }

    @FXML
    private void min() {
    }

    @FXML
    private void closeEntered() {
    }

    @FXML
    private void closeExited() {
    }

    @FXML
    private void minEntered() {
    }

    @FXML
    private void minExited() {
    }


    @FXML
    private void callBackLogin() {
    }

    @FXML
    private void login_en() {
        login.setStyle("-fx-background-radius:4;-fx-background-color: #097299");
    }

    @FXML
    private void login_ex() {
        login.setStyle("-fx-background-radius:4;-fx-background-color: #09A3DC");
    }
}
