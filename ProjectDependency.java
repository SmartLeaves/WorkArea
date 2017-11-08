package com.vimal.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * A	B,C
 * B	D,E
 * C	E
 * D	F
 * E	Null
 * F	Null
 * 
 */


public class ProjectDependency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Project> prjList = new ArrayList<>();
		Set<String> prjSet = new HashSet<>();
		prjList.add(new Project("A", "B,C"));
		prjList.add(new Project("B", "D,E"));
		prjList.add(new Project("C", "E"));
		prjList.add(new Project("D", "F"));
		prjList.add(new Project("E", ""));
		prjList.add(new Project("F", ""));
		
		disDependency(projList, )
		
		
	}
	
	

}

class Project{
	String name;
	String dependency;
	
	public Project(String name, String dependncy){
		this.name=name;
		this.dependency=dependncy;
	}
	
	public String getName(){
		return name;
	}
	public String getDependency(){
		return dependency;
	}
	
	
	
}