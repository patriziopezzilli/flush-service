package com.flush.flushservice.persistence.entity;

import java.util.Objects;

public class UserTableEntity {

    private String userId;
    private String username;
    private String status;
    private Boolean paied;
    private Boolean joined;
    private String mobileNumber;
    private String inviteCode;
    private UserTableEntity firstChildren;
    private UserTableEntity secondChildren;

    public UserTableEntity() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getPaied() {
        return paied;
    }

    public void setPaied(Boolean paied) {
        this.paied = paied;
    }

    public Boolean getJoined() {
        return joined;
    }

    public void setJoined(Boolean joined) {
        this.joined = joined;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public UserTableEntity getFirstChildren() {
        return firstChildren;
    }

    public void setFirstChildren(UserTableEntity firstChildren) {
        this.firstChildren = firstChildren;
    }

    public UserTableEntity getSecondChildren() {
        return secondChildren;
    }

    public void setSecondChildren(UserTableEntity secondChildren) {
        this.secondChildren = secondChildren;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserTableEntity that = (UserTableEntity) o;
        return Objects.equals(userId, that.userId) && Objects.equals(username, that.username) && Objects.equals(status, that.status) && Objects.equals(paied, that.paied) && Objects.equals(joined, that.joined) && Objects.equals(inviteCode, that.inviteCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, username, status, paied, joined, inviteCode);
    }

    @Override
    public String toString() {
        return "UserTableEntity{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", status='" + status + '\'' +
                ", paied=" + paied +
                ", joined=" + joined +
                ", inviteCode='" + inviteCode + '\'' +
                '}';
    }
}
