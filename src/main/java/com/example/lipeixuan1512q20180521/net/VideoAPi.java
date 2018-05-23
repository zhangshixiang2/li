package com.example.lipeixuan1512q20180521.net;

import com.example.lipeixuan1512q20180521.bean.VideoBean;

import io.reactivex.Observable;

/**
 * Created by Administrator on 2018/5/21.
 */

public class VideoAPi {
    private static VideoAPi videoAPi;
    private VideoAPiService videoAPiService;


    private VideoAPi(VideoAPiService videoAPiService) {

        this.videoAPiService = videoAPiService;
    }


    public static VideoAPi getVideoAPi(VideoAPiService videoAPiService) {
        if (videoAPi == null) {
            videoAPi = new VideoAPi(videoAPiService);
        }
        return videoAPi;
    }


    public Observable<VideoBean> getVideo() {
        return videoAPiService.getVideo();
    }
}
