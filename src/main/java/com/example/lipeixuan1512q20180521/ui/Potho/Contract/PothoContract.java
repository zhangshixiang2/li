package com.example.lipeixuan1512q20180521.ui.Potho.Contract;

import com.example.lipeixuan1512q20180521.bean.PothoBean;
import com.example.lipeixuan1512q20180521.ui.base.Contract.BaseContract;

/**
 * Created by Administrator on 2018/5/21.
 */

public interface PothoContract {
    interface View extends BaseContract.BaseView{
        void onSuccess(PothoBean pothoBean);

    }
    interface Presenter extends BaseContract.BasePresenter<View>{
        void getPotho();
    }

}
