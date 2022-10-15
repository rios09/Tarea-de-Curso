package ol;

import java.io.Serializable;

public class Nomina implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9091272302750103629L;
	private String firstName;
	private String middleName;
	private String surName;
	private String lastName;
	private String gender;
	private String country;
	private String city;
	private String town;
	private double salary;
	private double extraHours;
	private double seniority;
	private double inss;
	private double anualSalary;
	private double ir;
	private double inssPatronal;

	public Nomina() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getExtraHours() {
		return extraHours;
	}

	public void setExtraHours(double extraHours) {
		this.extraHours = extraHours;
	}

	public double getSeniority() {
		return seniority;
	}

	public void setSeniority(double seniority) {
		this.seniority = seniority;
	}

	public double getInss() {
		return inss;
	}

	public void setInss(double inss) {
		this.inss = inss;
	}

	public double getAnualSalary() {
		return anualSalary;
	}

	public void setAnualSalary(double anualSalary) {
		this.anualSalary = anualSalary;
	}

	public double getIr() {
		return ir;
	}

	public void setIr(double ir) {
		this.ir = ir;
	}

	public double getInssPatronal() {
		return inssPatronal;
	}

	public void setInssPatronal(double inssPatronal) {
		this.inssPatronal = inssPatronal;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
