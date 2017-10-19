/*
ID: karthik75
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class ride {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader f = new BufferedReader(new FileReader("ride.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		String line1 = st.nextToken().toLowerCase();
		StringTokenizer st1 = new StringTokenizer(f.readLine());
		String line2 = st1.nextToken().toLowerCase();

		int total1 = 1;
		int total2 = 1;
		
		char[] line1Arr = line1.toCharArray();
		for(char c : line1Arr) {
			int temp = (int) c;
			int tempint = 96;
			if(temp <= 122 && temp >= 97) {
				total1 = total1 * (temp - tempint);
			}
		}
		
		char[] line2Arr = line2.toCharArray();
		for(char c : line2Arr) {
			int temp = (int) c;
			int tempint = 96;
			if(temp <= 122 && temp >= 97) {
				total2 = total2 * (temp - tempint);
			}
		}
		
		if(total1 % 47 == total2 % 47) {
			out.println("GO");
		}
		else {
			out.println("STAY");
		}
		out.close();
	}

}
