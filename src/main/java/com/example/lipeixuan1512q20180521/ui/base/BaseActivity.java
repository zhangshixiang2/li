package com.example.lipeixuan1512q20180521.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.lipeixuan1512q20180521.inter.IBase;
import com.example.lipeixuan1512q20180521.ui.base.Contract.BaseContract;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/5/21.
 */

public abstract class BaseActivity<T extends BaseContract.BasePresenter> extends AppCompatActivity implements IBase,
        BaseContract.BaseView {
    @Inject
    protected T mPresenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentLayout());
        inject();
        //绑定
        if (mPresenter != null) {
            mPresenter.attchView(this);
        }


    }


    @Override
    public void initView(View view) {


    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解绑
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }


    @Override
    public void showLoading() {


    }


    @Override
    public void dismissLoading() {


    }

}