package com.example.modulea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.shuaige.common.CommonTest;

public class MainModuleAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_module_a);
        TextView tv = (TextView) findViewById(R.id.tv);
        CommonTest commonTest = new CommonTest();
        tv.setText(commonTest.name);


    }
}
