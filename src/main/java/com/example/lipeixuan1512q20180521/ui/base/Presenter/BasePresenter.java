package com.example.lipeixuan1512q20180521.ui.base.Presenter;

import com.example.lipeixuan1512q20180521.ui.base.Contract.BaseContract;

/**
 * Created by Administrator on 2018/5/21.
 */

public class BasePresenter<T extends BaseContract.BaseView> implements BaseContract.BasePresenter<T> {
    protected T mView;


    @Override
    public void attchView(T view) {
        this.mView = view;
    }


    @Override
    public void detachView() {
        if (mView != null) {
            mView = null;
        }
    }

}
