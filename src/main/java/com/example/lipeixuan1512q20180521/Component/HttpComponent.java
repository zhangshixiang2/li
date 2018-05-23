package com.example.lipeixuan1512q20180521.Component;

import com.example.lipeixuan1512q20180521.Module.HttpModule;
import com.example.lipeixuan1512q20180521.ui.Potho.PothoFragment;
import com.example.lipeixuan1512q20180521.ui.Video.VideoFragment;

import dagger.Component;

/**
 * Created by Administrator on 2018/5/21.
 */
@Component(modules = HttpModule.class)
public interface HttpComponent {
    void inject(PothoFragment pothoFragment);
    void inject(VideoFragment videoFragment);
}
