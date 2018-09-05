package com.example.administrator.test;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by Administrator on 2018/9/5 0005.
 */

/**
 * App一般都会走向组件化、插件化的道路，而组件化、插件化的前提就是解耦，
 * 那么我们首先要做的就是解耦页面之间的依赖关系
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //解耦页面之间的依赖
        ARouter.openLog();     // 打印日志
        ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        ARouter.init( this ); // 尽可能早，推荐在Application中初始化
    }
}
