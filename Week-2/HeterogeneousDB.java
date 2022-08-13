
class HeterogeneousDB extends DistributedDB {
	
	//Field
	public static final double COST_FACTOR = 1.3;
	
	//Constructor
	public HeterogeneousDB(String name, double BaseCost, double DbStorage, int numOfUsers, double costPerUser) {
		super(name, BaseCost, DbStorage, numOfUsers, costPerUser);
	}
	
	//Methods
	public double getCostFactor() {
		return COST_FACTOR;
	}
	public double monthlyCost() {
		return (BaseCost + (userCost()*HeterogeneousDB.COST_FACTOR));
	}
}
