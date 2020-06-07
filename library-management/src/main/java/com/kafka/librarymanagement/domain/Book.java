package com.kafka.librarymanagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Book {

	@JsonProperty(value = "bookId")
	private Integer bookId;

	@JsonProperty(value = "bookName")
	private String bookName;

	@JsonProperty(value = "bookAuthor")
	private String bookAuthor;
}
