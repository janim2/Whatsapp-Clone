package com.learn.whatsappclone.Models;

public class UserObject {
    private String uid,name, phone, notification_key;

    public UserObject(String uid) {
        this.uid = uid;
    }

    public UserObject(String uid,String name, String phone) {
        this.uid = uid;
        this.name = name;
        this.phone = phone;
    }


    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotification_key() {
        return notification_key;
    }

    public void setNotification_key(String notification_key) {
        this.notification_key = notification_key;
    }
}
