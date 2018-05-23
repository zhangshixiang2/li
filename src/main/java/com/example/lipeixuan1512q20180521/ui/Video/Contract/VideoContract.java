package com.example.lipeixuan1512q20180521.ui.Video.Contract;

import com.example.lipeixuan1512q20180521.bean.PothoBean;
import com.example.lipeixuan1512q20180521.bean.VideoBean;
import com.example.lipeixuan1512q20180521.ui.Potho.Contract.PothoContract;
import com.example.lipeixuan1512q20180521.ui.base.Contract.BaseContract;

/**
 * Created by Administrator on 2018/5/21.
 */

public interface VideoContract {
    interface View extends BaseContract.BaseView{
        void onSuccess(VideoBean videoBean);

    }
    interface Presenter extends BaseContract.BasePresenter<View>{
        void getVideo();
    }
}
