package com.app.springbootwithjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_attendance")
public class UserAttendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private int month;
    private int days;
    public UserAttendance() {
    }
    

    public UserAttendance(int month, int days) {
        this.month = month;
        this.days = days;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "UserAttendance [days=" + days + ", id=" + id + ", month=" + month + "]";
    }
    
}
