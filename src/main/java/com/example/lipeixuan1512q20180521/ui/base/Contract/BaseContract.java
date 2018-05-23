package com.example.lipeixuan1512q20180521.ui.base.Contract;

/**
 * Created by Administrator on 2018/5/21.
 */

public interface BaseContract {
    //抽取所有Presenter共性，比如绑定，解绑
    interface BasePresenter<T extends BaseView> {
        void attchView(T view);


        void detachView();
    }


    //抽取所有View的共性，比如显示进度条和关闭进度
    interface BaseView {
        void showLoading();


        void dismissLoading();
    }

}
