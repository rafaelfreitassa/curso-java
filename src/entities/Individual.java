package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double taxesPaid = 0.00;
		if (anualIncome <= 20000.00) {
			taxesPaid = anualIncome * 0.15;
		}
		else {
			taxesPaid = anualIncome * 0.25;
		}
		if (healthExpenditures > 0) {
			taxesPaid -= healthExpenditures * 0.50;
		}
		return taxesPaid;
	}
	
}
