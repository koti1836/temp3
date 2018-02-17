import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> vehicles = new HashMap<String, Integer>();

		vehicles.put("BMW", 5);
		vehicles.put("Mercedes", 3);
		vehicles.put("Audi", 4);
		vehicles.put("Ford", 10);

		System.out.println("Total vehicles: " + vehicles.size());

		for (String key : vehicles.keySet())
		{
			System.out.println(key + " - " + vehicles.get(key));
		}
		
		Iterator it = vehicles.keySet().iterator();

		while (it.hasNext()) {
			String key = (String) it.next();
			int value = vehicles.get(key);

			System.out.println(key + " - " + value);
		}

	}

}
