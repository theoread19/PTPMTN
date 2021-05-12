/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author PC
 */
public class DiscountModel {

    private int id;
    private float discountValue;

    public DiscountModel() {
        id = -1;
        discountValue = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(float discountValue) {
        this.discountValue = discountValue;
    }

}
