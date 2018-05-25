package org.claytantor.model;

import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * Created by claytongraham on 5/24/18.
 */
public class IntpickerRequest {

    @Expose
    private List<Integer> items;

    @Expose
    private Integer sum;

    public IntpickerRequest(){};

    public IntpickerRequest(List<Integer> items, Integer sum) {
        this.items = items;
        this.sum = sum;
    }

    public List<Integer> getItems() {
        return items;
    }

    public void setItems(List<Integer> items) {
        this.items = items;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }
}
