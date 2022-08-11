
public class DBPart1 {
	
	public static void main(String[] args) {
		CentralizedDB db1 = new CentralizedDB("Database One", 1200.0, 5.00, 1500.0);
		DistributedDB db2 = new DistributedDB("Database Two", 2000.0, 7.5, 100, 12.0);
		HomogeneousDB db3 = new HomogeneousDB("Database Three", 2000, 7.5, 100, 14.0);
		HeterogeneousDB db4 = new HeterogeneousDB("Database Four", 2000, 7.5, 100, 14.0);
		System.out.println(db1);
		System.out.println();
		System.out.println(db2);
		System.out.println();
		System.out.println(db3);
		System.out.println();
		System.out.println(db4);

	}

}
