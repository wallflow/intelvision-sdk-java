package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.PlatesetSearchPlateResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetSearchPlateRequest extends ZenoRequest<PlatesetSearchPlateResponse> {

    @Param(name = "plateset_id")
    private String platesetId;

    @Param(name = "plate_number")
    private String palteNumber;

    public String getPlatesetId() {
        return platesetId;
    }

    public void setPlatesetId(String platesetId) {
        this.platesetId = platesetId;
    }

    public String getPalteNumber() {
        return palteNumber;
    }

    public void setPalteNumber(String palteNumber) {
        this.palteNumber = palteNumber;
    }

    @Override
    public String getApi() {
        return "/plate/plateset/search";
    }
}
