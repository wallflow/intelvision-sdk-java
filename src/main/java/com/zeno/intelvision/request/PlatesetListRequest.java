package com.zeno.intelvision.request;

import com.zeno.intelvision.response.PlatesetListResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetListRequest extends ZenoRequest<PlatesetListResponse> {

    @Override
    public String getApi() {
        return "/plate/plateset_list";
    }
}
