/*
ID: karthik75
LANG: JAVA
TASK: gift1
*/
import java.io.*;
import java.util.*;

public class gift1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
		StringTokenizer number = new StringTokenizer(f.readLine());
		int num = Integer.parseInt(number.nextToken());
		boolean end = true;
		int divided = 0;
		String nextName = "";
		LinkedHashMap<String, Integer> table = new LinkedHashMap<String, Integer>();
		for(int i = 0; i < num; i++) {
			String name = f.readLine();
			//System.out.println(name);
			table.put(name, 0);
		}
		//System.out.println(Arrays.asList(table));
		
		while((nextName = f.readLine()) != null) {	
			String[] splitCost = f.readLine().split(" ");
			int count = Integer.parseInt(splitCost[1]);
			table.put(nextName, table.get(nextName) - Integer.parseInt(splitCost[0]));
			if(Integer.parseInt(splitCost[1]) != 0){
				divided = Integer.parseInt(splitCost[0]) / count;
				if((Integer.parseInt(splitCost[0]) / count) != 0) {
					int remainder = Integer.parseInt(splitCost[0]) % count;
					table.put(nextName, table.get(nextName) + remainder);
				}
				for(int i = 0; i < count; i++) {
					String tempName = f.readLine();
					table.put(tempName, table.get(tempName) + divided);
				}
				
			}
		}
		
		for(Map.Entry entry: table.entrySet()) {
			out.println(entry.getKey() + " " + entry.getValue());
		}
		out.close();
		System.out.println(Arrays.asList(table));
	}

}
