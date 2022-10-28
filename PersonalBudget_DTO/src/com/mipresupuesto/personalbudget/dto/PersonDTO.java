package com.mipresupuesto.personalbudget.dto;

public final class PersonDTO {
	
	private String id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String firstSurname;
	private String secondSurname;
	private String name;
	private String lastName;
	private String completeName;
	
	
	
	public PersonDTO() {
		setId("");
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setFirstSurname("");
		setSecondSurname("");
	}
	
	public PersonDTO(final String id, final String idCard, final String firstName, final String middleName,
			final String firstSurname, final String secondSurname, final String name, final String lastName, final String completeName) {
		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middleName);
		setFirstSurname(firstSurname);
		setSecondSurname(secondSurname);
		setName(name);
		setLastName(lastName);
		setCompleteName(completeName);
	}
	public final String getId() {
		if (id== null || "" .equals(id.trim())) {
			setId("");
		}
		return id;
	}
	public final String getIdCard() {
		if (idCard== null || "" .equals(idCard.trim())) {
			setIdCard("");
		}
		return idCard;
	}
	public final String getFirstName() {
		if (firstName== null || "" .equals(firstName.trim())) {
			setFirstName("");
		}
		return firstName;
	}
	public final String getMiddleName() {
		if (middleName== null || "" .equals(middleName.trim())) {
			setMiddleName("");
		}
		return middleName;
	}
	public final String getFirstSurname() {
		if (firstSurname== null || "" .equals(firstSurname.trim())) {
			setFirstSurname("");
		}
		return firstSurname;
	}
	public final String getSecondSurname() {
		if (secondSurname== null || "" .equals(secondSurname.trim())) {
			setSecondSurname("");
		}
		return secondSurname;
	}
	public final void setId(final String id) {
		this.id = id;
	}
	public final void setIdCard(final String idCard) {
		this.idCard = idCard;
	}
	public final void setFirstName(final String firstName) {
		this.firstName = firstName;
	}
	public final void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}
	public final void setFirstSurname(final String firstSurname) {
		this.firstSurname = firstSurname;
	}
	public final void setSecondSurname(final String secondSurname) {
		this.secondSurname = secondSurname;
	}
	public final String getName() {
		if(name==null) {
			setName("");
		}
		return name.trim();
	}
	public final String getLastName() {
		return lastName;
	}
	public final String getCompleteName() {
		return completeName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

	public static PersonDTO create() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
