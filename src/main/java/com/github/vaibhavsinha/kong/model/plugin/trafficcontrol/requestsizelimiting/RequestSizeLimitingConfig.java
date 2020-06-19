package com.github.vaibhavsinha.kong.model.plugin.trafficcontrol.requestsizelimiting;

import com.google.gson.annotations.SerializedName;

/**
 * Created by vaibhav on 18/06/17.
 */

public class RequestSizeLimitingConfig {
    @SerializedName("allowed_payload_size")
    Integer allowedPayloadSize;

    public Integer getAllowedPayloadSize() {
        return allowedPayloadSize;
    }

    public void setAllowedPayloadSize(Integer allowedPayloadSize) {
        this.allowedPayloadSize = allowedPayloadSize;
    }
}
