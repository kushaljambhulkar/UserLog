package com.app.springbootwithjpa.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String email;
    private String password;
    private String date;

    @OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_attendance_id")
    private UserAttendance userAttendance;

    
    
    public User( String email, String password, String date) {
        this.email = email;
        this.password = password;
        this.date = date;
    }
    public User() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
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
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public UserAttendance getUserAttendance() {
        return userAttendance;
    }
    public void setUserAttendance(UserAttendance userAttendance) {
        this.userAttendance = userAttendance;
    }
    @Override
    public String toString() {
        return "User [date=" + date + ", email=" + email + ", id=" + id + ", password=" + password + ", userAttendance="
                + userAttendance + "]";
    }
    
    
    
}
