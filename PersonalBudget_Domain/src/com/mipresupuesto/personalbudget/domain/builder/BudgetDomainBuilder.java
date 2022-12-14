package com.mipresupuesto.personalbudget.domain.builder;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
//import static com.mipresupuesto.personalbudget.crosscutting.UtilUUID.DEFAULT_UUID;
//import static com.mipresupuesto.personalbudget.crosscutting.UtilUUID.getDefaultUUID;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.domain.YearDomain;

public class BudgetDomainBuilder {
	
	private UUID id;
	private YearDomain year;
	private PersonDomain person;
	
	private BudgetDomainBuilder() {
		setId(UtilUUID.DEFAULT_UUID);
		setYear(year);
		setPerson(person);
	}
	
	public static final BudgetDomainBuilder get() {
		return new BudgetDomainBuilder();
	}

	public final BudgetDomainBuilder setId(final UUID id) {
		this.id =(id==null) ?  UtilUUID.DEFAULT_UUID: id;
		return this;
	}

	public final BudgetDomainBuilder setYear(final YearDomain year) {
		this.year = (year==null) ? YearDomainBuilder.get().build() : year;
		return this;
	}

	public final BudgetDomainBuilder setPerson(final PersonDomain person) {
		this.person = (person==null) ? PersonDomainBuilder.get().build() : person;
		return this;
	} 

	public final  BudgetDomain build() {
		return BudgetDomain.create(id, year, person);
	}
	private UUID getId() {
		return id;
	}

	private YearDomain getYear() {
		return year;
	}

	private PersonDomain getPerson() {
		return person;
	}
	
	

}
