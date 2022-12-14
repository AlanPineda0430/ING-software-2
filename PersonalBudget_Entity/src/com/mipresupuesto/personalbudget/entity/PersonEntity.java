package com.mipresupuesto.personalbudget.entity;

import java.util.UUID;


import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;

public class PersonEntity {

	private UUID id;
	private String idCard;
	private String firstName; 
	private String middleName;
	private String firstSurname;
	private String secondSurname;

	public PersonEntity() {
		setId(UtilUUID.DEFAULT_UUID);
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setFirstSurname("");
		setSecondSurname("");
	}

	public PersonEntity(final UUID id, final String idCard, final String firstName, final String middleName,
			final String firstSurname, final String secondSurname) {
		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middleName);
		setFirstSurname(firstSurname);
		setSecondSurname(secondSurname);

	}

	public final UUID getId() {
		if (id== null) {
			setId(UtilUUID.DEFAULT_UUID);
		}
		return id;
	}

	public final void setId(final UUID id) {
		this.id = id;
	}

	public final String getIdCard() {
		return idCard;
	}

	public final void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public final String getFirstName() {
		return firstName;
	}

	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public final String getMiddleName() {
		return middleName;
	}

	public final void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public final String getFirstSurname() {
		return firstSurname;
	}

	public final void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}

	public final String getSecondSurname() {
		return secondSurname;
	}

	public final void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}
}
