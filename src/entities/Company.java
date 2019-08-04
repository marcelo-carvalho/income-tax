package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmpoyees;
	
	public Company() {
		
	}
	
	public Company(String name, Double anualIncome, Integer numberOfEmpoyees) {
		super(name, anualIncome);
		this.numberOfEmpoyees = numberOfEmpoyees;
	}

	public Integer getNumberOfEmpoyees() {
		return numberOfEmpoyees;
	}

	public void setNumberOfEmpoyees(Integer numberOfEmpoyees) {
		this.numberOfEmpoyees = numberOfEmpoyees;
	}

	@Override
	public double tax() {
		if(numberOfEmpoyees <= 10) {
			return (super.getAnualIncome() * 0.16);
		}
		else {
			return (super.getAnualIncome() * 0.14);
		}
	}
	
}
