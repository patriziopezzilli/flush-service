package com.flush.flushservice.persistence.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "tables")
public class TableEntity {

    @Id
    private long id;
    private String tableName;
    private String tableType;
    private Integer members;
    private Integer membersPaied;
    private UserTableEntity parent;

    public TableEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }

    public Integer getMembersPaied() {
        return membersPaied;
    }

    public void setMembersPaied(Integer membersPaied) {
        this.membersPaied = membersPaied;
    }

    public UserTableEntity getParent() {
        return parent;
    }

    public void setParent(UserTableEntity parent) {
        this.parent = parent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableEntity that = (TableEntity) o;
        return id == that.id && Objects.equals(tableName, that.tableName) && Objects.equals(tableType, that.tableType) && Objects.equals(members, that.members) && Objects.equals(membersPaied, that.membersPaied) && Objects.equals(parent, that.parent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tableName, tableType, members, membersPaied, parent);
    }

    @Override
    public String toString() {
        return "TableEntity{" +
                "id=" + id +
                ", tableName='" + tableName + '\'' +
                ", tableType='" + tableType + '\'' +
                ", members=" + members +
                ", membersPaied=" + membersPaied +
                ", parent=" + parent +
                '}';
    }
}
