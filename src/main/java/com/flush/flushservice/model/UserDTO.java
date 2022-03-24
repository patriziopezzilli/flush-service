package com.flush.flushservice.model;

import java.util.Objects;

public class UserDTO {

    private String id;
    private String email;
    private String password;
    private String inviteCode;
    private String username;
    private String mobileNumber;
    private String tableId;
    private Integer level;
    private String levelName;

    public UserDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
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
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(id, userDTO.id) && Objects.equals(email, userDTO.email) && Objects.equals(password, userDTO.password) && Objects.equals(inviteCode, userDTO.inviteCode) && Objects.equals(username, userDTO.username) && Objects.equals(tableId, userDTO.tableId) && Objects.equals(level, userDTO.level) && Objects.equals(levelName, userDTO.levelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, password, inviteCode, username, tableId, level, levelName);
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", inviteCode='" + inviteCode + '\'' +
                ", username='" + username + '\'' +
                ", tableId='" + tableId + '\'' +
                ", level=" + level +
                ", levelName='" + levelName + '\'' +
                '}';
    }
}
