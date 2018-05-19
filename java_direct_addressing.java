/**
 * 
 */
package evm;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author Dileep R Dominic
 * Name Electioncount
 * Description : Election count program implemented using Direct Addressing technique
 */


class Record { 
	int voter_id;
	int candidate_id;
	
	public int getvoter_id() {
		return voter_id;
	}
	
	public void setvoter_id(int voter_id) {
		this.voter_id = voter_id;
	}
	
	public long getcandidate_id() {
		return candidate_id;
	}
	
	public void setcandidate_id(int candidate_id) {
		this.candidate_id = candidate_id;
	}
	
}

class PollInformation {
	
	private int maxSize;
	private Record[] list;
	
	public PollInformation(int s) {
		
		   maxSize = s;
		   list = new Record[maxSize];		
	}
	
	public void add(int voterid,int candidateid) {
		
		Record r = new Record();
		r.setvoter_id(voterid);
		r.setcandidate_id(candidateid);
		list[voterid] = r;
		System.out.println("Successfully added voterid: " + list[voterid].getvoter_id() + " ,Candidateid :"+ list[voterid].getcandidate_id()); 	
	}
	
	public void find(int voterid) {
		
		if(list[voterid] != null) {
			System.out.println("Candidate_id: " + list[voterid].getcandidate_id() + " for voterid:" + list[voterid].getvoter_id());
		}
		else {
			System.out.println("No such voterid exists");		
		}	
	}

	public void count(int candidateid) {
		
		int count = 0;
		boolean checkcandidate = false;
		int len = list.length;
		for(int i = 0; i < len ; i++) {
			if(list[i]!= null) {
				if(list[i].getcandidate_id() == candidateid) {
					count++;
					checkcandidate = true;
				}
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
		
		//Voter id array declaration for 6 digit voter id 
		PollInformation pollinfo = new PollInformation(999999);
		
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
