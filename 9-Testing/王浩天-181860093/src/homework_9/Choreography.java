package homework_9;

import java.util.ArrayList;

public class Choreography implements Sort_method{
	public void sort(ArrayList<Calabash_Brothers> lis){				
		for(int i=0;i<7-1;i++) {
			for(int j=0;j<7-1;j++) {
				if(lis.get(j).getval()>lis.get(j+1).getval()) {
					lis.get(j).swap(lis.get(j+1));					
				}			
			}		
		}
		for(int i=0;i<lis.size();i++) {
			lis.get(i).show();
		}
	}
}
