package evm_hashmethod;


import java.io.*;
import java.util.HashMap;


/**
 * @author Dileep R Dominic
 * Name Electioncount
 * Description : Election count program implemented using Hashing technique
 */

class PollInformation {
	
	/*Declaring hashmap datastructure for mapping candidate id and voter id*/
    HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
		
	public void add(int voterid,int candidateid) {
		
		list.put(voterid, candidateid);
		System.out.println("Successfully added voterid: " + voterid + " ,Candidateid :"+ list.get(voterid)); 
		
	}
	
	public void find(int voterid) {
		
		if(list.get(voterid)!=null) {
			
			System.out.println("Candidate_id: " + list.get(voterid) + " for voterid:" + voterid);		
		}	
		else {
			System.out.println("No such voterid exists");		
		}	
	}

	public void count(int candidateid) {
		
		int count = 0;
		boolean checkcandidate = false;
		
		for ( Integer key : list.keySet() ) {
			
			if(list.get(key) == candidateid) {
				count++;
				checkcandidate = true;
			    System.out.println( key );		
			}
		}

		if(checkcandidate == true) {
			System.out.println("Number of votes for "+candidateid +":"+count );
		}
		else {
			System.out.println("No such candidate exist!");
		}

	}	
	
}

public class electionCount {


	public static void main(String[] args) throws Exception {
		
		PollInformation pollinfo = new PollInformation();
		
		//Reading the input data from file from local
		FileReader input = new FileReader("C:\\upgrad\\data.txt");
		BufferedReader in = new BufferedReader(input);

	    String inputLine;
	    String[] st;
	    
	    //Adding all inputs from file
	    while ((inputLine = in.readLine()) != null) {
	    	st = inputLine.split("\\s+");
	    	pollinfo.add(Integer.parseInt(st[0]),Integer.parseInt(st[1]));
	    }
	    
	    // Checks for find and count operations
	    pollinfo.find(151030);  
	    pollinfo.count(135);
	    pollinfo.count(1);

	    in.close();
	}

}
