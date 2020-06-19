package com.github.vaibhavsinha.kong.model.plugin.authentication.key;

import com.github.vaibhavsinha.kong.model.common.AbstractEntityList;

import java.util.List;

/**
 * Created by dvilela on 17/10/2017.
 */
public class KeyAuthCredentialList extends AbstractEntityList {
    Long total;
    List<KeyAuthCredential> data;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<KeyAuthCredential> getData() {
        return data;
    }

    public void setData(List<KeyAuthCredential> data) {
        this.data = data;
    }
}
