import java.text.DecimalFormat;

public abstract class DB implements Comparable<DB>{
	
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
//	public static void setCount(int count) {
//	       DB.count = count;
//	   }
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
	
	public int compare(DB db1, DB db2) {
		if(db1 == db2) {
			return 0;
		}
		if(db1 == null) {
			return 1;
		}
		if(db2 == null) {
			return -1;
		}
		return db1.compareTo(db2);
	}
}
