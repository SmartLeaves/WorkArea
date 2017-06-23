package com.vimal.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 *  For example perspective i am trying to keep all the methods in same class. In real time we 
 *  need to modularize using multiple classes
 *  
 *  TODO : TDD should be written in parallel to this to test 
 */


public class SoftwareManagement {
	

		// List contain all the installed software at a given point of time
		// eg: [TELNET, TCIP, NETGEAR]
		public static List<String> installedSoftwares = new ArrayList<>();
		
		
		// Map contain the dependecies 
		// eg : {(TELNET->[TCIP, NETCARD]), (TCIP->[NETCARD])..}
		public static HashMap<String, ArrayList> dependencyMap =  new HashMap<>();
		
		//This map contain the usage dependency of software 
		//eg : {(TELNET, null), TCIP->[TELNET, DNS, BROWSER]..}
		//TODO : There is an opertunity to optimize this part i guess. 
		public static HashMap<String, ArrayList> sfUsageMap = new HashMap<>();

	public static void main(String[] args) {
		
		// Read from console/file and interpret the command. 
		
		//add dependency : eg : addDependency("TELNET", list<TCIP,NETCARD>); //read methos needs to do the proper changes to add as list
		//addDependency();
		//install software : eg installSf("TELNET");
		//installSf("TCIP");
		//printInstalledSfs();
		//removeSoftware("TCIP");
	}
	
	//Method to install the software
	// Check whether its already existing in the 'installedSoftwares' list. If so print already installed
	//if not get the dependency list and install the dependency software if not already installed and then install given sf(software)
	public static void installSf(String software){
		
		// add software to installedSoftwares[] list
		if (installedSoftwares.contains(software)){
			printInConsole(software+"is already installed");
		}
		else{
			installedSoftwares.add(software);
			@SuppressWarnings("unchecked")
			ArrayList<String> dependedsfs= dependencyMap.get(software);
			for(String str:dependedsfs){
				if (!installedSoftwares.contains(str)){
					installedSoftwares.add(str);
				}
			}
		}
			
			
		}

	
	// Method to add dependency for software
	// Add the software and dependency list to map. If one of the dependency software is already existing, skip that and add rest
	//Assuming only depended command for a given software. If esiting , it will give warning 
	public static void addDependency(String software, ArrayList dependencyList){
		
		//add to dependencyMap(key(software), list(dependencyList))
		
		if (dependencyMap.get(software)!=null){
			// this dependency is already existing. give warning
			printInConsole("Dependency already existing for "+software);
		}
		else{
			
			dependencyMap.put(software, dependencyList);
		}
		
		
	}
	
	//Method to print all the installed softwares from installedSoftwares
	public static void printInstalledSfs(){
		
		//iterate through installedSoftwares and print all. 
		if (installedSoftwares.isEmpty()){
			printInConsole("No software is installed !!");
		}
		else{
			for(String str: installedSoftwares){
				printInConsole(str);
			}
		}
		
		
	}
	
	//Method to remove the software from computer. This method is the core of the entire program because this method control 
	//and responsible from the proper existance /relationship of softwares in given computer. 
	// When a software is given for removal (say TCPIP), it will first check whether its existing in installed list. If not 
	// it will give not installed.
	public static void removeSoftware(String software){
		
		// 1: Check if software is existing in installedSoftwares list. if not return error message
		
		if (installedSoftwares.isEmpty() && !(installedSoftwares.contains(software))){
			printInConsole(software+"is not installed");
		}
		
		// 2:  check if the software is in the sfUsageMap MAP. if its there , there are the software dependend on this.
		
		if (sfUsageMap.get(software)!=null && !sfUsageMap.get(software).isEmpty()){ // this means there are software which is used by this software
			
			//TODO : major one. 
			// 
			
		}	
		else{ // no software is using the given software (eg foo)
			
			//3. check if the software is used in any other list of sfUsageMap, if not remove from sfUsageMap. Else first remove from the list of other 
			// software of sfUsageMap and then remove from sfUsageMap.
			// eg :removal of DNS
			// this is something need optimization.
			for (String str : sfUsageMap.keySet()){
				if (sfUsageMap.get(str).contains(software)){
					//remove software from list of that entry
				}
			}
			//after removing software from all lists, remove the entry from sfUsageMap map
			sfUsageMap.remove(software);
			//then remove from dependy list if existing
			dependencyMap.remove(software);
			//then remove from installd software list
			installedSoftwares.remove(software);
			printInConsole(software+"is removed");
		
			
		}
		
	}
	
	
	
	public static String readCommandFromConsole(String Usercommand){
		
		//TODO print the message to console
		//TODO Do validation for user entry and accept only if valid command
		printInConsole(Usercommand);
		return Usercommand;
	}
	
	public static void printInConsole(String message){
		
		//TODO print the message to console. Made as a fuction to format the output if required.
	}
	

}
