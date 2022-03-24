package com.flush.flushservice.persistence.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "users")
public class UserEntity {

    @Id
    private long id;

    private String email;
    private String password;
    private String inviteCode;
    private String username;
    private String mobileNumber;
    private String tableId;
    private Integer level;
    private String levelName;

    public UserEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id && Objects.equals(email, that.email) && Objects.equals(password, that.password) && Objects.equals(inviteCode, that.inviteCode) && Objects.equals(username, that.username) && Objects.equals(tableId, that.tableId) && Objects.equals(level, that.level) && Objects.equals(levelName, that.levelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, password, inviteCode, username, tableId, level, levelName);
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", inviteCode='" + inviteCode + '\'' +
                ", username='" + username + '\'' +
                ", tableId='" + tableId + '\'' +
                ", level='" + level + '\'' +
                ", levelName='" + levelName + '\'' +
                '}';
    }
}
