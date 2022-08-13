import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class DBList {
	
	//Fields
	private DB[] db;
	private String[] invalidRecords;
	
	//Constructor
	public DBList() {
		this.db = new DB[0];
		this.invalidRecords = new String[0];
	}
	
	//Methods
	public DB[] getDBArray() {
		return db;
	}
	public void addDB(DB newdb) {
		db = Arrays.copyOf(db, db.length + 1);
		db[db.length - 1] = newdb;
	}
	public String[] getInvalidRecordsArray() {
		return invalidRecords;
	}
	public void addInvalidRecord(String newinvalidRecord) {
		invalidRecords = Arrays.copyOf(invalidRecords, invalidRecords.length + 1);
		invalidRecords[invalidRecords.length - 1] = newinvalidRecord;
	}
	public String readFile(String filename) {
		try {
			FileInputStream fis = new FileInputStream(filename);
			DataInputStream dis = new DataInputStream(fis);
			BufferedReader br = new BufferedReader(new InputStreamReader(dis));
			String str;
			
			while((str = br.readLine()) != null) {
				Scanner sc = new Scanner(str);
				ArrayList<String> al = new ArrayList<String>();
				sc.useDelimiter(",");
				while(sc.hasNext()) {
					al.add(sc.next());
				}
				
				switch(al.get(0)) {
				case "C":
					CentralizedDB centralizedDB = new CentralizedDB(al.get(1), Double.parseDouble(al.get(2)), Double.parseDouble(al.get(3)), Double.parseDouble(al.get(4)));
					addDB(centralizedDB);
					break;
				
				case "D":
					DistributedDB distributedDB = new DistributedDB(al.get(1), Double.parseDouble(al.get(2)), Double.parseDouble(al.get(3)), Integer.parseInt(al.get(4)), Double.parseDouble(al.get(5)));
					addDB(distributedDB);
					break;
				
				case "H":
					HomogeneousDB homogeneousDB = new HomogeneousDB(al.get(1), Double.parseDouble(al.get(2)), Double.parseDouble(al.get(3)), Integer.parseInt(al.get(4)), Double.parseDouble(al.get(5)));
					addDB(homogeneousDB);
					break;
				
				case "E":
					HeterogeneousDB heterogeneousDB = new HeterogeneousDB(al.get(1), Double.parseDouble(al.get(2)), Double.parseDouble(al.get(3)), Integer.parseInt(al.get(4)), Double.parseDouble(al.get(5)));
					addDB(heterogeneousDB);
					break;
				default:
					System.out.println("");
				}
			sc.close();
			}
		dis.close();
		} catch(FileNotFoundException e) {
			System.out.println("An error ocurred");
			e.printStackTrace();
		} catch  (IOException e) {
			System.out.println("An error ocurred");
			e.printStackTrace();
		}
		return "";
	}
	
	public void generateReport() {
		DB[] db = getDBArray();
		for(int i = 0; i < db.length; i++) {
			System.out.println(db[i].toString());
		}
	}
	
	public void generateReportByName() {
        Arrays.sort(getDBArray());
        for (int i = 0; i < db.length; i++) {
            System.out.println(db[i].toString());
        }
    }

    public void generateReportByMonth() {
        Arrays.sort(getDBArray(), new MonthlyCostComparator());
        for (int i = 0; i < db.length; i++) {
            System.out.println(db[i].toString());

        }
    }
	
}
