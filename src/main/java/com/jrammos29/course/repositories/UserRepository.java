package com.jrammos29.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrammos29.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
