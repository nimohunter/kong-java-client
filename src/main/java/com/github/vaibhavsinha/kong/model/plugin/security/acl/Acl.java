package com.github.vaibhavsinha.kong.model.plugin.security.acl;

import com.google.gson.annotations.SerializedName;

/**
 * Created by vaibhav on 18/06/17.
 */

public class Acl {
    @SerializedName("id")
    private String id;
    @SerializedName("group")
    private String group;
    @SerializedName("consumer_id")
    private String consumerId;
    @SerializedName("created_at")
    private Long createdAt;

    public Acl(String group) {
        this.group = group;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
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
