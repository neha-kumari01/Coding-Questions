package StriverSheet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SearchInA2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		

	}

	public static int modularExponentiation(int x, int n, int m) {
		// Write your code here.
		if (n == 0)
			return 1;

		if (n % 2 == 0) {
			int y = modularExponentiation(x, n / 2, m);
			return (y * y) % m;
		} else
			return ((x % m) * (modularExponentiation(x, n - 1, m))) % m;
		
		
		/*Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(mp.containsKey(arr[i]))
            	mp.put(arr[i], mp.get(arr[i])+1);
            else
            	mp.put(arr[i], 1);
        }*/
        

	}

}

