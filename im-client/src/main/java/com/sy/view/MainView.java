package com.sy.view;


import com.sy.annotation.VIEW;
import com.sy.model.StageConfig;
import com.sy.view.base.BaseView;

/**
 * @author lllsmiling
 * @create 2017-12-13 16:38
 **/
@VIEW(name = "main")
public class MainView extends BaseView {

    public MainView() {
        super();
        init();
    }
    private void init() {
        stageConfig = new StageConfig();
        stageConfig.setFullScreen(false);
        stageConfig.setResizable(false);
        stageConfig.setTitle("主界面");
        this.width = 600;
        this.height = 400;
    }


}
