package com.stocks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stocks.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
