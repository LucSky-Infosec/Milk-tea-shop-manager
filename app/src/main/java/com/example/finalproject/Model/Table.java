package com.example.finalproject.Model;
import java.util.Date;
public class Table {
    private int id;
    private String TableName;
    private Date DateCreated;
    private Boolean Status;
    public Table(){
    }
    public Table(int id, String tableName, Date dateCreated, Boolean status) {
        this.id = id;
        TableName = tableName;
        this.DateCreated = dateCreated;
        Status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTableName() {
        return TableName;
    }

    public void setTableName(String tableName) {
        TableName = tableName;
    }

    public Date getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        DateCreated = dateCreated;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }
    @Override
    public String toString() {
        return "Table{" + "id=" + id + ", TableName=" + TableName + ", DateCreated=" + DateCreated + ", Status=" + Status + '}';
    }

}