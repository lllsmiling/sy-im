package com.sy.view.base;

import com.sy.annotation.VIEW;
import com.sy.app.AppContext;
import com.sy.model.StageConfig;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * @author lllsmiling
 * @create 2017-12-13 16:39
 **/
public abstract class BaseView {
    protected Parent root;
    protected Scene scene;

    protected double width;
    protected double height;

    protected StageConfig stageConfig;

    public BaseView() {
        VIEW view = getClass().getAnnotation(VIEW.class);
        try {
            this.root = FXMLLoader.load(getClass().getResource(AppContext.fxmlRootPath + "/"+view.name()+".fxml"));
        }catch (Exception e){
            this.root = null;
            e.printStackTrace();
        }
    }
    public Parent getRoot() {
        return root;
    }
    public void show(){
        if(scene == null){
            scene = new Scene(root);
        }
        AppContext.show(scene,stageConfig,root);
    }
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
