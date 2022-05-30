package com.app.springbootwithjpa.repository;

import com.app.springbootwithjpa.model.UserAttendance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAttendanceRepository extends JpaRepository<UserAttendance,Integer> {
    
}
