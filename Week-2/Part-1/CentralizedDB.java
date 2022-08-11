import java.text.DecimalFormat;

class CentralizedDB extends DB {
	
	//Field
	private double license;
	
	//Constructor
	public CentralizedDB(String name, double BaseCost, double DbStorage, double license) {
		super(name, BaseCost, DbStorage);
		this.license =  license;
	}
	
	//Methods
	public double getLicense() {
		return license;
	}
	public void setLicense(double license) {
		this.license = license;
	}
	public double monthlyCost() {
		return (BaseCost + license);
	}
	@Override
	public String toString() {
		String pat1 = "$#,##0.00";
		DecimalFormat df1 = new DecimalFormat(pat1);
		return name + " Monthly Cost: " + df1.format(monthlyCost()) + "\n"
		+ super.toString() + "\n"
		+ "License: " + df1.format(license);
	}
}
