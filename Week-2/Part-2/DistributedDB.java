import java.text.DecimalFormat;

public class DistributedDB extends DB {
	
	//Fields
	protected int numOfUsers;
	protected double costPerUser;
	public static final double COST_FACTOR = 1.1;
	
	//Constructor
	public DistributedDB(String name, double BaseCost, double DbStorage, int numOfUsers, double costPerUser) {
		super(name, BaseCost, DbStorage);
		this.numOfUsers = numOfUsers;
		this.costPerUser = costPerUser;
	}
	
	//Methods
	public int getNumberOfUsers() {
		return numOfUsers;
	}
	public void setNumberOfUsers(int numOfUsers) {
		 this.numOfUsers = numOfUsers;
	}
	public double getCostPerUser() {
		return costPerUser;
	}
	public void setCostPerUser(double costPerUser) {
		 this.costPerUser = costPerUser;
	}
	public double userCost() {
		return (numOfUsers*costPerUser);
	}
	public double getCostFactor() {
		return COST_FACTOR;
	}
	public double monthlyCost() {
		return (BaseCost + (userCost()*DistributedDB.COST_FACTOR));
	}
	@Override
	public String toString() {
		String pat1 = "$#,##0.00";
		DecimalFormat df1 = new DecimalFormat(pat1);
		return name + " Monthly Cost: " + df1.format(monthlyCost()) + "\n"
				+ super.toString() +"\n"
				+ "Number of Users: "  + numOfUsers + "\n"
				+ "Cost per User: " + df1.format(costPerUser) +  "\n"
				+ "User Cost: " + df1.format(userCost()) +"\n"
				+ "Cost Factor: " + getCostFactor();
	}
	@Override
	public int compareTo(DB db) {
		return 0;
	}
}
