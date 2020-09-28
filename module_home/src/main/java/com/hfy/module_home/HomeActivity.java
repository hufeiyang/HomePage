package com.hfy.module_home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "homepage/homeActivity")
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.btn_go_cart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //通过路由跳转到 购物车组件的购物车页面（但没有依赖购物车组件）
                ARouter.getInstance().build("/cart/cartActivity").navigation();
            }
        });
    }
}
