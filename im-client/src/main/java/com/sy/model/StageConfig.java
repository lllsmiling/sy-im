package com.sy.model;

import javafx.stage.StageStyle;

/**
 * @author lllsmiling
 * @create 2017-12-14 15:36
 **/
public class StageConfig {
    private boolean fullScreen;

    private boolean resizable;

    private String title;

    private StageStyle stageStyle;

    public StageConfig() {
        this.fullScreen = true;
        this.resizable = true;
        this.title = "Hello World";
    }

    public boolean isFullScreen() {
        return fullScreen;
    }

    public void setFullScreen(boolean fullScreen) {
        this.fullScreen = fullScreen;
    }

    public boolean isResizable() {
        return resizable;
    }

    public void setResizable(boolean resizable) {
        this.resizable = resizable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public StageStyle getStageStyle() {
        return stageStyle;
    }

    public void setStageStyle(StageStyle stageStyle) {
        this.stageStyle = stageStyle;
    }
}
