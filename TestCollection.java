package com.vimal.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TestCollection {

	public static void main(String[] args) {
		  String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		  Set<String> mySet = new HashSet<>();
		  
		  for(String strEl:strArray){
			  if(!mySet.add(strEl)){
				  System.out.println("Duplicate - "+strEl);
			  }
		  }
		  Arrays.asList(strArray).stream().filter(name -> name.startsWith("a")).forEach(x -> System.out.println(x));
	}

}
