package com.chenxianson.mvp.global;


public abstract class BasePresenter<V extends BaseActivity> implements BaseContract.GlobalPresenter {

    public V mActivity;


    public BasePresenter(V activity){
        this.mActivity=activity;
    }

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
