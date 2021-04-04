package com.marcelocamillo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelocamillo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
