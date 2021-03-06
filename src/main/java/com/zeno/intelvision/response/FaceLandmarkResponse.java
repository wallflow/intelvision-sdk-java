package com.zeno.intelvision.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zeno.intelvision.model.Face;
import com.zeno.intelvision.model.Image;
import com.zeno.intelvision.model.Point;

import java.util.List;

/**
 * @author lan
 * @since 2016-03-15
 */
public class FaceLandmarkResponse extends ZenoResponse {

    private String detectionId;
    private Face face;
    private Image image;
    private List<Point> points;

    @JsonProperty("detection_id")
    public String getDetectionId() {
        return detectionId;
    }

    public void setDetectionId(String detectionId) {
        this.detectionId = detectionId;
    }

    @JsonProperty("face")
    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face;
    }

    @JsonProperty("image")
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @JsonProperty("points")
    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
}
