package com.zeno.intelvision.request;

import com.zeno.intelvision.response.InfoGetAppResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class InfoGetAppRequest extends ZenoRequest<InfoGetAppResponse> {
    @Override
    public String getApi() {
        return "/face/info/get_app";
    }
}
