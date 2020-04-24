package com.stocks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stocks.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
