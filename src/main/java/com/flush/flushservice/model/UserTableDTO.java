package com.flush.flushservice.model;

import java.util.Objects;

public class UserTableDTO {

    private String userId;
    private String username;
    private String status;
    private Boolean paied;
    private Boolean joined;
    private String inviteCode;
    private String mobileNumber;
    private UserTableDTO firstChildren;
    private UserTableDTO secondChildren;

    public UserTableDTO() {
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
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

    public UserTableDTO getFirstChildren() {
        return firstChildren;
    }

    public void setFirstChildren(UserTableDTO firstChildren) {
        this.firstChildren = firstChildren;
    }

    public UserTableDTO getSecondChildren() {
        return secondChildren;
    }

    public void setSecondChildren(UserTableDTO secondChildren) {
        this.secondChildren = secondChildren;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserTableDTO that = (UserTableDTO) o;
        return Objects.equals(userId, that.userId) && Objects.equals(username, that.username) && Objects.equals(status, that.status) && Objects.equals(paied, that.paied) && Objects.equals(joined, that.joined) && Objects.equals(inviteCode, that.inviteCode) && Objects.equals(firstChildren, that.firstChildren) && Objects.equals(secondChildren, that.secondChildren);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, username, status, paied, joined, inviteCode, firstChildren, secondChildren);
    }

    @Override
    public String toString() {
        return "UserTableDTO{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", status='" + status + '\'' +
                ", paied=" + paied +
                ", joined=" + joined +
                ", inviteCode='" + inviteCode + '\'' +
                ", firstChildren=" + firstChildren +
                ", secondChildren=" + secondChildren +
                '}';
    }
}
