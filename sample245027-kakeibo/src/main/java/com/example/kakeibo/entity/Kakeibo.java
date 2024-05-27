package com.example.kakeibo.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Kakeibo")
@Data
public class Kakeibo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // PostgreSQL用の自動採番。strategyに指定する値は、使用するデータベースシステムや自動採番の方法により異なる。
	@Column(name = "id")
	private Long id;
	
	private LocalDate date;
	private String category;
	private int price;
	private String memo;
}
