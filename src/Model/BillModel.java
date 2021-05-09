/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author PC
 */
public class BillModel {
    private int id;
    private int creatorId;
    private float discount;
    private Timestamp createTime;
    private float total;
    private float subTotal;
    private int totalAmount;
    private float receivedMoney;
    private float changeMoney;

    private float subtotal;
    private List<BillDetailModel> beverages = new ArrayList<BillDetailModel>();
    
    public BillModel(){
        id = -1;
        creatorId = -1;
        discount = -1;
        createTime = null;
        total = -1;
        subTotal = -1;
        totalAmount = -1;
        receivedMoney = -1;
        changeMoney = -1;
    }


    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discountId) {
        this.discount = discountId;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
    
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public float getReceivedMoney() {
        return receivedMoney;
    }

    public void setReceivedMoney(float receivedMoney) {
        this.receivedMoney = receivedMoney;
    }

    public float getChangeMoney() {
        return changeMoney;
    }

    public void setChangeMoney(float changeMoney) {
        this.changeMoney = changeMoney;
    }

    public List<BillDetailModel> getBeverages() {
        return beverages;
    }

    public void setBeverages(List<BillDetailModel> beverages) {
        this.beverages = beverages;
    }

    
}
