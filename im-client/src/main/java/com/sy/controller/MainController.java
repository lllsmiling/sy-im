package com.sy.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;

/**
 * @author lllsmiling
 * @create 2017-12-14 17:20
 **/
public class MainController {
    @FXML
    private ImageView close;
    @FXML
    private ImageView min;
    @FXML
    private ImageView shineImage;
    @FXML
    private Accordion friends;
    @FXML
    private ScrollPane friendSp;
    @FXML
    private Label username;

    @FXML
    private Label autograph;

    @FXML
    private void close() {
        System.exit(1);
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
    private void bind() {
    }

    @FXML
    private void min() {
    }

    @FXML
    private void username_entered() {
        username.setStyle("-fx-background-radius:4;-fx-background-color: #136f9b");
    }

    @FXML
    private void username_exited() {
        username.setStyle("");
    }

    @FXML
    private void autograph_entered() {
        autograph.setStyle("-fx-background-radius:4;-fx-background-color: #136f9b");
    }

    @FXML
    private void autograph_exited() {
        autograph.setStyle("");
    }

    @FXML
    private void headEx() {
        shineImage.setVisible(false);
    }

    @FXML
    private void headEn() {
        shineImage.setVisible(true);
    }
}
