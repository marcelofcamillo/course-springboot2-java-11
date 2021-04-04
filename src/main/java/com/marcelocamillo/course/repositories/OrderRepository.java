package com.marcelocamillo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcelocamillo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
