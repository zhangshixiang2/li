package com.example.lipeixuan1512q20180521.net;

import com.example.lipeixuan1512q20180521.bean.PothoBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2018/5/21.
 */

public interface PothoAPiService {
    @GET("satinApi?type=3&page=1")
    Observable<PothoBean> getPotho();

}
