package com.mipresupuesto.personalbudget.dto;

public final class YearDTO {
	private String id;
	private int year;
	
	public YearDTO() {
		setId("");
		setYear(0);
	}
	
	public YearDTO(String id, int year) {
		setId(id);
		setYear(year);
	}
	
	public static final YearDTO create() {
		return new YearDTO();
	}

	private final void setId(final String id) {
		this.id = id;
	}

	private final void setYear(final int year) {
		this.year = year;
	}
	
	public final int getYear() {
		return year;
	}

	public final String getId() {
		if (id== null || "" .equals(id.trim())) {
			setId("");
		}
		return id;	
	}

	
	
}



