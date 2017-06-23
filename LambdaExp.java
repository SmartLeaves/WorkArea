package com.vimal.Test;

import java.awt.List;
import java.util.ArrayList;

public class LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Country{
		
		String continent;
		int population;
		
		String getContinent(){
			return continent;
		}
		int getPopulation(){
			return population;
		}
	}
	
	int getPopulationC(ArrayList<Country> countries, String continent){
		int sum=0;
		for (Country cnt:countries){
			if(cnt.getContinent().equalsIgnoreCase(continent))
				sum+=cnt.getPopulation();
		}
		return sum;
		
	}
	
	
}
