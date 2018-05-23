package com.example.lipeixuan1512q20180521.ui.Potho.Presenter;

import com.example.lipeixuan1512q20180521.bean.PothoBean;
import com.example.lipeixuan1512q20180521.net.PothoAPi;
import com.example.lipeixuan1512q20180521.ui.Potho.Contract.PothoContract;
import com.example.lipeixuan1512q20180521.ui.base.Presenter.BasePresenter;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Administrator on 2018/5/21.
 */

public class PothoPresenter extends BasePresenter<PothoContract.View> implements PothoContract.Presenter {
    private PothoAPi pothoAPi;
    @Inject
    public PothoPresenter(PothoAPi pothoAPi) {
        this.pothoAPi = pothoAPi;
    }

    @Override
    public void getPotho() {
        pothoAPi.getPotho()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<PothoBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(PothoBean pothoBean) {
                        mView.onSuccess(pothoBean);

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
