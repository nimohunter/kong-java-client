package com.github.vaibhavsinha.kong.model.admin.upstream;

import com.github.vaibhavsinha.kong.model.common.AbstractEntityList;

import java.util.List;

/**
 * Created by vaibhav on 13/06/17.
 */
public class UpstreamList extends AbstractEntityList {
    Long total;
    String next;
    List<Upstream> data;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public List<Upstream> getData() {
        return data;
    }

    public void setData(List<Upstream> data) {
        this.data = data;
    }
}
