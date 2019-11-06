package com.bjsxt.portaltest.pojo;


import java.io.Serializable;

public class Store implements Serializable {
    private Integer id;
    private Integer nums;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }
}
