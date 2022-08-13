
public class HomogeneousDB extends DistributedDB {
	
	//Field
	public static final double COST_FACTOR = 1.2;
	
	//Constructor
	public HomogeneousDB(String name, double BaseCost, double DbStorage, int numOfUsers, double costPerUser) {
		super(name, BaseCost, DbStorage, numOfUsers, costPerUser);
	}
	
	//Methods
	public double getCostFactor() {
		return COST_FACTOR;
	}
	public double monthlyCost() {
		return (BaseCost + (userCost()*HomogeneousDB.COST_FACTOR));
	}
}
