package com.example.finalproject.Models;
public class TableDetails {
    private int id;
    private int tableID;
    private int billID;

    public TableDetails() {
    }
//    public TableDetails()
    public TableDetails(int tableID, int billID){
        this.tableID=tableID;
        this.billID=billID;
    }
    public TableDetails(int id, int tableID, int billID){
        this.id=id;
        this.tableID=tableID;
        this.billID=billID;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getTableID() {
        return tableID;
    }

    public void setTableID(int tableID) {
        this.tableID = tableID;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    @Override
    public String toString() {
        return "TableDetails{" +
                "id=" + id +
                ", tableID=" + tableID +
                ", billID=" + billID +
                '}';
    }


}