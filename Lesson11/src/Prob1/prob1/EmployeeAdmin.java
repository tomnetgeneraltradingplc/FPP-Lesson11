package Prob1.prob1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		
		//IMPLEMENT
		List<Employee> EList= new ArrayList<>();
		for (String ssn : socSecNums) {
			if(table.containsKey(ssn)){
				Employee e = table.get(ssn);
				if(e.getSalary()>80000)
					EList.add(e);
				
			}
			
		}
		
		Collections.sort(EList, new EmployeeComparator());
		return EList;
		
		
	}
	
}
