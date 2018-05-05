

import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet; 

public class Source
{
    static int getPairsCount(int n, int sum, int[] arr)
    {
        //Todo
    	 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	 HashSet<String> set =new HashSet<String>();
    	 String st;
    	 
    	 
    	 for(int i=0;i<n;i++) {
    	 map.put(arr[i], i);
    	
    	 }
    	 
    	 for(int j=0;j<n;j++) {
    		 
    		 if(map.containsKey(sum - arr[j])) {
    			 //System.out.println("j:" + j + " ,map.get(arr[j]):" + map.get(arr[j]));
    			 if(j!=map.get(sum - arr[j]))
    			 { st = "";
    				 if(arr[j] <(sum-arr[j]) )
    				 {
    					 st = (String) (arr[j] + "," + (sum-arr[j]));
    					 set.add(st);
    					 //System.out.println("(" + arr[j]+ "," + (sum-arr[j]) +")");
    				 }
    				 else {
    					 st = (String) ((sum-arr[j]) + "," + arr[j]);
    					 set.add(st);
    				 }
    			 }
    			 
    		 }
    		 
        	
    		 
    	 }
    	   	 
    	 
    	return set.size();
    	
    }

    public static void main(String[] args) throws IOException{
    	    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	//Todo            	
              

        //int n = Integer.parseInt(br.readLine());
         int n = 4;
         
        // String[] strNums = br.readLine().split(" ");
         String[] strNums = "1 1 1 1".trim().split(" ");
         
         int[] arr = new int[1000];
         for (int i = 0;i<n;i++) {
        	 arr[i] = Integer.parseInt(strNums[i]);
        	 
         }
         
         // int sum = Integer.parseInt(br.readLine());
         int sum = 2;
         
         int k = 0;
         k = getPairsCount(n,sum,arr);
         System.out.println(k);
    }
}
