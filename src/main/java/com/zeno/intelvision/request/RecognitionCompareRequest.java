package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.RecognitionCompareResponse;

/**
 * Created by pc on 2016/3/15.
 */
public class RecognitionCompareRequest extends ZenoRequest<RecognitionCompareResponse> {

    @Param(name = "face_id1")
    private String faceId1;

    @Param(name = "face_id2")
    private String faceId2;

    public String getFaceId1() {
        return faceId1;
    }

    public void setFaceId1(String faceId1) {
        this.faceId1 = faceId1;
    }

    public String getFaceId2() {
        return faceId2;
    }

    public void setFaceId2(String faceId2) {
        this.faceId2 = faceId2;
    }

    @Override
    public String getApi() {
        return "/v2/recognition/compare";
    }
}
