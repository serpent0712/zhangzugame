package com.zhangzu.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangzu.game.utils.MD5Util;

import app.zhangzu.com.zhangzugame.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MD5Util.MD5("woani");
    }
}
