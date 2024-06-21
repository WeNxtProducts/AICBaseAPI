package com.aic.base.qrGeneretor;


import java.util.Map;

public class QRCodeRequestDto {
    private Map<String, String> data;
    private String topText;
    private String bottomText;

    // Getters and Setters
    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    public String getTopText() {
        return topText;
    }

    public void setTopText(String topText) {
        this.topText = topText;
    }

    public String getBottomText() {
        return bottomText;
    }

    public void setBottomText(String bottomText) {
        this.bottomText = bottomText;
    }
}
