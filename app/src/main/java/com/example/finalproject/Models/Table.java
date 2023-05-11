package com.example.finalproject.Models;
import java.util.Date;
public class Table {
    private int id;
    private String tableName;
    private Date dateCreated;
    private Boolean status;
    public Table(){
    }
    public Table(String tableName, Date dateCreated, Boolean status) {
        this.tableName = tableName;
        this.dateCreated = dateCreated;
        this.status = status;
    }
    public Table(int id, String tableName, Date dateCreated, Boolean status) {
        this.id = id;
        this.tableName = tableName;
        this.dateCreated = dateCreated;
        this.status = status;
    }
    public Table(int id) {
        this.id = id;
    }

//    public Table(String tableName, String s, boolean status) {
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Table{" + "id=" + id + ", tableName=" + tableName + ", dateCreated=" + dateCreated + ", status=" + status + '}';
    }

}