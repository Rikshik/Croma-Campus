public class DBPart2 {

	public static void main(String[] args) {
		DBList dbList =  new DBList();
		dbList.readFile("test");
		
		System.out.println("---generateReport---\n\n");
        dbList.generateReport();
        System.out.println("\n\n---generateReportByName---\n\n");
        dbList.generateReportByName();
        System.out.println("\n\n---generateReportByCost---\n\n");
        dbList.generateReportByMonth();

	}

}
