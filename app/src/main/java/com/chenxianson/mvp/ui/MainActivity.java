package com.chenxianson.mvp.ui;


import android.os.Bundle;
import com.chenxianson.mvp.R;
import com.chenxianson.mvp.global.BaseActivity;
import com.chenxianson.mvp.presenter.MainPresenter;
import com.chenxianson.mvp.presenter.contract.MainContract;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void setPresenter() {
        mPresenter=new MainPresenter(this);
    }


    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }
}
