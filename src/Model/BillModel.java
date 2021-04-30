/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Timestamp;



/**
 *
 * @author PC
 */
public class BillModel {
    private int id;
    private int creatorId;
    private int discountId;
    private Timestamp createTime;
    private int total;
    private int totalAmount;
    private int receivedMoney;
    private int changeMoney;
    
    public BillModel(){
        id = -1;
        creatorId = -1;
        discountId = -1;
        createTime = null;
        total = -1;
        totalAmount = -1;
        receivedMoney = -1;
        changeMoney = -1;
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

    public int getDiscountId() {
        return discountId;
    }

    public void setDiscountId(int discountId) {
        this.discountId = discountId;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getReceivedMoney() {
        return receivedMoney;
    }

    public void setReceivedMoney(int receivedMoney) {
        this.receivedMoney = receivedMoney;
    }

    public int getChangeMoney() {
        return changeMoney;
    }

    public void setChangeMoney(int changeMoney) {
        this.changeMoney = changeMoney;
    }
    
    
}
