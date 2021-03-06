package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.PlatesetSetInfoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetSetInfoRequest extends ZenoRequest<PlatesetSetInfoResponse> {

    @Param(name = "plateset_id")
    private String platesetId;

    @Param(name = "plateset_name")
    private String platesetName;

    @Param(name = "tag")
    private String tag;

    public String getPlatesetId() {
        return platesetId;
    }

    public void setPlatesetId(String platesetId) {
        this.platesetId = platesetId;
    }

    public String getPlatesetName() {
        return platesetName;
    }

    public void setPlatesetName(String platesetName) {
        this.platesetName = platesetName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getApi() {
        return "/plate/plateset/set_info";
    }
}
