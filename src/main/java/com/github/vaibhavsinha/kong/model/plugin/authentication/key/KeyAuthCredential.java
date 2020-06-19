package com.github.vaibhavsinha.kong.model.plugin.authentication.key;

import com.google.gson.annotations.SerializedName;

/**
 * Created by vaibhav on 15/06/17.
 */
public class KeyAuthCredential {

    @SerializedName("id")
    private String id;
    @SerializedName("key")
    private String key;
    @SerializedName("consumer_id")
    private String consumerId;
    @SerializedName("created_at")
    private Long createdAt;

    public KeyAuthCredential(String key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }
}
