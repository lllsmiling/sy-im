package com.sy.app;

import com.sy.config.AppConfig;
import com.sy.model.StageConfig;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.Light;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lllsmiling
 * @create 2017-12-14 14:42
 **/
public class AppContext {
    public static String fxmlRootPath = "/fxml";

    private static Light.Point point = new Light.Point();
    public static ApplicationContext context;
    public static Stage stage;
    static {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    public static void show(Scene scene, StageConfig stageConfig, Parent root){
        stage.setScene(scene);
        stage.setResizable(stageConfig.isResizable());
        stage.setFullScreen(stageConfig.isFullScreen());
        stage.setTitle(stageConfig.getTitle());
        if(stageConfig.getStageStyle() != null){
            stage.initStyle(stageConfig.getStageStyle());
        }
        stage.show();
        setCommonEvent(stage,root);
    }
    public static void exit() {
        stage.close();
    }


    private static void setCommonEvent(final Stage stage, Parent root) {
        root.setOnMousePressed(new EventHandler<Event>() {

            public void handle(Event event) {
                MouseEvent e = (MouseEvent) event;

                point.setX(stage.getX() - e.getScreenX());
                point.setY(stage.getY() - e.getScreenY());
            }
        });

        root.setOnMousePressed(new EventHandler<Event>() {
            public void handle(Event event) {
                MouseEvent e = (MouseEvent) event;
                point.setX(stage.getX() - e.getScreenX());
                point.setY(stage.getY() - e.getScreenY());
            }

        });
        root.setOnMouseReleased(new EventHandler<Event>() {
            public void handle(Event event) {
                if (stage.getY() < 0) {
                    stage.setY(0);
                }
            }

        });
        root.setOnMouseDragged(new EventHandler<Event>() {
            public void handle(Event event) {
                MouseEvent e = (MouseEvent) event;
                if (stage.isFullScreen()) {
                    return;
                }

                final double x = (e.getScreenX() + point.getX());
                final double y = (e.getScreenY() + point.getY());

                Platform.runLater(new Runnable() {

                    public void run() {
                        stage.setX(x);
                        stage.setY(y);
                        if (stage.getY() < 0) {
                            stage.setY(0);
                        }

                    }
                });
            }
        });
    }


}
