package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.ImageDeleteResponse;

/**
 * Created by pc on 2016/3/15.
 */
public class ImageDeleteRequest extends ZenoRequest<ImageDeleteResponse> {

    @Param(name = "image_id")
    private String imageId;

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @Override
    public String getApi() {
        return "/v2/image/delete";
    }
}
