package com.backend.cinema.dto;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Reservation request", description = "Required details needed to create a new reservation")
public class ReservationRequest {

	@NotBlank(message = "No of persons cannot be null")
	@ApiModelProperty(value = "noPersons", required = true, notes = "The no of persons of the reservation", example = "3", position = 1)
	@Min(1)
	private Integer noPersons;

	@NotBlank(message = "Date registered cannot be null")
	@ApiModelProperty(value = "dateRegistered", required = true, notes = "The reservation's date registered", example = "07/09/2023 13:45", position = 2)
	private Date dateRegistered;

	public ReservationRequest() {
	}

	public ReservationRequest(@NotBlank(message = "No of persons cannot be null") @Min(1) Integer noPersons,
			@NotBlank(message = "Date registered cannot be null") Date dateRegistered) {
		this.noPersons = noPersons;
		this.dateRegistered = dateRegistered;
	}

	public Integer getNoPersons() {
		return noPersons;
	}

	public void setNoPersons(Integer noPersons) {
		this.noPersons = noPersons;
	}

	public Date getDateRegistered() {
		return dateRegistered;
	}

	public void setDateRegistered(Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}

}
