package com.in2it.spiketicket.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class CreateTicketDto {
	
	private String title;
	private String description;
	private String assignedBy;
	private String assignTo;

}