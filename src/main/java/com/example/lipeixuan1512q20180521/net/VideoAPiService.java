package com.example.lipeixuan1512q20180521.net;

import com.example.lipeixuan1512q20180521.bean.PothoBean;
import com.example.lipeixuan1512q20180521.bean.VideoBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2018/5/21.
 */

public interface VideoAPiService {
    @GET("satinApi?type=4&page=1")
    Observable<VideoBean> getVideo();

}
