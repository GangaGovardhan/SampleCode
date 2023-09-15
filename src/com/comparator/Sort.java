package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Emp> emps= new ArrayList<Emp>();
		
		emps.add(new Emp(5, "its me", 90978700098l));
		emps.add(new Emp(1, "Its you", 90786577689l));
		emps.add(new Emp(3, "Its you", 90786577689l));
		emps.add(new Emp(6, "Its you", 90786577689l));
		emps.add(new Emp(8, "Its okay", 90786577689l));
		
		System.out.println(emps);
		
		
		Collections.sort(emps);
		
		System.out.println(emps);
       
	}

}
