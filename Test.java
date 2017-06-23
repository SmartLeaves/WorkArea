package com.vimal.Test;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
	
	/*public int [] merge (int[] a, int b[]){
		
		if (a.length> b.length){
			
		}
		
	}*/
	
	
	
	
	
	

}
