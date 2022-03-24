package com.flush.flushservice.model;

import java.util.Objects;

public class TableDTO {

    private String id;
    private String tableName;
    private String tableType;
    private Integer members;
    private Integer membersPaied;
    private UserTableDTO parent;

    public TableDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public UserTableDTO getParent() {
        return parent;
    }

    public void setParent(UserTableDTO parent) {
        this.parent = parent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableDTO tableDTO = (TableDTO) o;
        return Objects.equals(id, tableDTO.id) && Objects.equals(tableName, tableDTO.tableName) && Objects.equals(tableType, tableDTO.tableType) && Objects.equals(members, tableDTO.members) && Objects.equals(membersPaied, tableDTO.membersPaied) && Objects.equals(parent, tableDTO.parent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tableName, tableType, members, membersPaied, parent);
    }

    @Override
    public String toString() {
        return "TableDTO{" +
                "id='" + id + '\'' +
                ", tableName='" + tableName + '\'' +
                ", tableType='" + tableType + '\'' +
                ", members=" + members +
                ", membersPaied=" + membersPaied +
                ", parent=" + parent +
                '}';
    }
}
