import java.util.Comparator;

public class MonthlyCostComparator implements Comparator<DB>{
	public int compare(DB db1, DB db2) {
		return (int) (db1.BaseCost - db2.BaseCost);
	}
}

