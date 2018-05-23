package com.example.lipeixuan1512q20180521.ui.Video;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.lipeixuan1512q20180521.Component.DaggerHttpComponent;
import com.example.lipeixuan1512q20180521.Module.HttpModule;
import com.example.lipeixuan1512q20180521.R;
import com.example.lipeixuan1512q20180521.bean.VideoBean;
import com.example.lipeixuan1512q20180521.ui.Video.Adapter.VideoAdapter;
import com.example.lipeixuan1512q20180521.ui.Video.Contract.VideoContract;
import com.example.lipeixuan1512q20180521.ui.Video.Presenter.VideoPresenter;
import com.example.lipeixuan1512q20180521.ui.base.BaseFragment;

/**
 * Created by Administrator on 2018/5/21.
 */

public class VideoFragment extends BaseFragment<VideoPresenter> implements VideoContract.View {
    private RecyclerView mRlv;
    @Override
    public int getContentLayout() {
        return R.layout.fragment_video;
    }

    @Override
    public void inject() {
        DaggerHttpComponent.builder()
                .httpModule(new HttpModule())
                .build()
                .inject(this);

    }

    @Override
    public void initView(View view) {

        mRlv = (RecyclerView) view.findViewById(R.id.rlv);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 1, RecyclerView.VERTICAL, false);
        mRlv.setLayoutManager(gridLayoutManager);
        mPresenter.getVideo();
    }

    @Override
    public void onSuccess(VideoBean videoBean) {
        VideoAdapter videoAdapter = new VideoAdapter(getActivity(), videoBean.getData());
        mRlv.setAdapter(videoAdapter);

    }
}
