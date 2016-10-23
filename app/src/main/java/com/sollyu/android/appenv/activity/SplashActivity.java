package com.sollyu.android.appenv.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.sollyu.android.appenv.MainApplication;

/**
 * 作者: Sollyu
 * 时间: 16/10/23
 * 联系: sollyu@qq.com
 * 说明:
 */
public class SplashActivity extends AppCompatActivity {

    private final Handler uiHandler = new Handler();
    private final Integer splashTimeOut = 3 * 1000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        uiHandler.postDelayed(() -> {
            if (!MainApplication.getInstance().isXposedWork()) {
                startActivity(new Intent(SplashActivity.this, XposedNotWorkActivity.class));
            }
        }, splashTimeOut);
    }
}
