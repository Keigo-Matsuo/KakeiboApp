package com.example.kakeibo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kakeibo.entity.Kakeibo;

public interface KakeiboRepository extends JpaRepository<Kakeibo, Long> {

}
