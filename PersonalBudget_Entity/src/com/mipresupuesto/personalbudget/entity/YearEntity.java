package com.mipresupuesto.personalbudget.entity;

import java.util.UUID;
import com.mipresupuesto.personalbudget.crosscutting.utils;
//import com.mipresupuesto.personalbudget.crosscutting.UtilUUID;

public class YearEntity {
	private UUID id;
	private int year;

	public YearEntity() { 
		setId(UtilUUID.DEFAULT_UUID);

		setYear(0);
	}

	public YearEntity(final UUID id, int year) {
		setId(id);
		setYear(year);
	}

	public final UUID getId() {
		if(id==null) {
			setId(UtilUUID.DEFAULT_UUID);
			
		}
		
		return id;
	}

	private final void setId(final UUID id) { 	
		this.id = id;
	}

	private final void setYear(int year) {
		this.year = year;
	}

	public final int getYear() {
		return year;
	}

}
