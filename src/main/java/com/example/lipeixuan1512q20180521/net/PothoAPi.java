package com.example.lipeixuan1512q20180521.net;

import com.example.lipeixuan1512q20180521.bean.PothoBean;

import io.reactivex.Observable;

/**
 * Created by Administrator on 2018/5/21.
 */

public class PothoAPi {
    private static PothoAPi pothoAPi;
    private PothoAPiService pothoAPiService;


    private PothoAPi(PothoAPiService pothoAPiService) {
        this.pothoAPiService = pothoAPiService;
    }


    public static PothoAPi getPothoAPi(PothoAPiService pothoAPiService) {
        if (pothoAPi == null) {
            pothoAPi = new PothoAPi(pothoAPiService);
        }
        return pothoAPi;
    }


    public Observable<PothoBean> getPotho() {
        return pothoAPiService.getPotho();
    }
}
