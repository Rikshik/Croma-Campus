import java.text.DecimalFormat;

abstract class DB {
	
	//Fields
	protected String name;
	protected double BaseCost;
	protected double DbStorage;
	protected static int count = 0;
	
	//Constructor
	public DB(String name, double BaseCost, double DbStorage){
		this.name = name;
		this.BaseCost = BaseCost;
		this.DbStorage = DbStorage;
		count++;
	}
	
	//Methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBaseCost() {
		return BaseCost;
	}
	public void setBaseCost(double BaseCost) {
		this.BaseCost = BaseCost;
	}
	public double getDbStorage() {
		return DbStorage;
	}
	public void setDbStorage(double DbStorage) {
		this.DbStorage = DbStorage;
	}
	public static int getCount() {
		return count;
	}
	public static void resetCount() {
		count = 0;
	}
	@Override
	public String toString() {
		String pat1 = "#.000";
		String pat2 = "$#,##0.00";
		DecimalFormat df1 = new DecimalFormat(pat1);
		DecimalFormat df2 = new DecimalFormat(pat2);
		return "Storage: " + df1.format(DbStorage) + " TB\n"
				+ "Base Cost: " + df2.format(BaseCost);
	}
	public abstract double monthlyCost();
}
