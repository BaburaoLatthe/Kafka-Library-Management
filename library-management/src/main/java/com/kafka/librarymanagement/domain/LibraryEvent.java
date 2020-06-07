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
public class LibraryEvent {

	@JsonProperty(value = "libraryEventId")
	private Integer libraryEventId;

	@JsonProperty(value = "book")
	private Book book;
}
