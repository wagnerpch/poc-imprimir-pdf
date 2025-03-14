package com.poc.imprimit_pdf.demo.repository;

import com.poc.imprimit_pdf.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

