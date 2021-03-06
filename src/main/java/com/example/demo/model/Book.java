package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name = "book")
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private long id;

	@Column(name = "author_name", nullable = false)
	private String author_name;

	@Column(name = "book_name", nullable = false)
	private String book_name;

	@Column(name = "create_ts", nullable = false)
	private String create_ts;

	@Column(name = "update_ts", nullable = false)
	private String update_ts;

	public Book() {
		super();
	}

	public Book(String author_name, String book_name, String create_ts, String update_ts) {
		this.author_name = author_name;
		this.book_name = book_name;
		this.create_ts = create_ts;
		this.update_ts = update_ts;
	}
}
