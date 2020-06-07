package com.kafka.librarymanagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.librarymanagement.domain.LibraryEvent;

@RequestMapping(value="/v1")
@RestController
public class LibraryEventsController {

	@PostMapping(value = "/libraryevent", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<LibraryEvent> postLibraryEvent(@RequestBody LibraryEvent libraryEvent) {
		return new ResponseEntity<>(libraryEvent, HttpStatus.CREATED);
	}
}