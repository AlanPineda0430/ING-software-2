
package com.mipresupuesto.personalbudget.entities;

public interface BudgetEnties {

}


import javax.persistence.table;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID*;

@Entity
@Table(name = "Budget")
public final class BudgetEntity {
	

	@Id 
	@Column(name ="id")
	private UUID id;

	@ManyToOne
	@JoinColumn(name = "year")
	private YearEntity year;
	private PersonEntity person;
	
	public BudgetEntity() {
		setId(utilUUID.DEFAULT_UUID);
		setYear(new YearEntity());
		setPerson(new PersonEntity());
	}
	
	public BudgetEntity(final yearEntity year, final PersonEntity person) {
		setYear(year);
	}

}