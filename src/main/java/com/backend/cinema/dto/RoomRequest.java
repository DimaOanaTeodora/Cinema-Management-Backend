package com.backend.cinema.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Room request", description = "Required details needed to create a new room")
public class RoomRequest {

	@NotNull(message = "Number cannot be null")
	@Min(1)
	@ApiModelProperty(value = "number", required = true, notes = "The number of the room", example = "123", position = 1)
	private int number;

	@NotNull(message = "Capacity cannot be null")
	@Min(1)
	@ApiModelProperty(value = "capacity", required = true, notes = "The capacity of the room", example = "40", position = 2)
	private int capacity;

	public RoomRequest() {
	}

	public RoomRequest(@NotNull(message = "Number cannot be null") @Min(1) int number,
			@NotNull(message = "Capacity cannot be null") @Min(1) int capacity) {
		this.number = number;
		this.capacity = capacity;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
