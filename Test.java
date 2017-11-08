package com.vimal.Test;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test tr = new Test();
		//tr.countSports();
		tr.maxRepeat();
	}
	
public void countSports(){
	String sports = "Cricket baseball volyball hocky Cricket baseball";
	
	String indSprot[] = sports.split(" ");
	
	Map <String, Integer> hp = new HashMap<>();
	
	for (String str : indSprot){
		if (hp.keySet().contains(str)){
			hp.put(str,hp.get(str)+1);
		}
		else{
			hp.put(str, 1);
		}
	}
	for(String str:hp.keySet()){
		System.out.println(str +"  "+ hp.get(str));
	}
}
	
public void maxRepeat(){
	
	int[] list ={3,5,7,9,10,5,2,9,5,0,5};
    
    //int result =5;
    
    
    Map<Integer, Integer> hp = new HashMap<>();
    
    int max=1;
    
    for (int i = 0;i<list.length;++i){
    
        if (hp.containsKey(list[i])){
           if(max==hp.get(list[i]))
            	max=max+1;
            hp.put(list[i], hp.get(list[i])+1);
            
        }
        else{
         hp.put(list[i], 1);
        }
        
    
    }
    
     for (int i = 0;i<list.length;++i){
    	 if (hp.get(list[i])==max){
        	  System.out.println("Maximum occurence is for "+list[i]);
         		break;
         }
     }
	
	
}	
	
	
	
	

}
