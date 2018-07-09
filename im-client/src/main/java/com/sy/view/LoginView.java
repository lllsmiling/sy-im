package com.sy.view;

import com.sy.annotation.VIEW;
import com.sy.model.StageConfig;
import com.sy.view.base.BaseView;
import javafx.stage.StageStyle;

/**
 * @author lllsmiling
 * @create 2017-12-13 16:38
 **/
@VIEW(name = "login")
public class LoginView extends BaseView {

    public LoginView() {
        super();
        init();
    }
    private void init() {
        stageConfig = new StageConfig();
        stageConfig.setFullScreen(false);
        stageConfig.setResizable(false);
        stageConfig.setTitle("IM");
        stageConfig.setStageStyle(StageStyle.TRANSPARENT);
        this.width = 600;
        this.height = 400;
    }


}
