package com.chenxianson.mvp.global;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseContract.GlobalView {

    public T mPresenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public abstract void setPresenter();

    @Override
    public void mothod1() {

    }

    @Override
    public void mothod2() {

    }

    @Override
    public void mothod3() {

    }
}
