package com.github.vaibhavsinha.kong.model.plugin.authentication.basic;

import com.google.gson.annotations.SerializedName;

/**
 * Created by vaibhav on 17/06/17.
 */

public class BasicAuthConfig {

    @SerializedName("hide_credentials")
    Boolean hideCredentials;
    @SerializedName("anonymous")
    String anonymous;

    public Boolean getHideCredentials() {
        return hideCredentials;
    }

    public void setHideCredentials(Boolean hideCredentials) {
        this.hideCredentials = hideCredentials;
    }

    public String getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(String anonymous) {
        this.anonymous = anonymous;
    }
}
