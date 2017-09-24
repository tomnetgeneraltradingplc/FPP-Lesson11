package Prob1.prob1;
import java.util.Comparator;
public class EmployeeComparator implements Comparator<Employee> {
	 @Override
	 public int compare(Employee e1, Employee e2) {
		 
		 String s1 = e1.getSsn();
		 String s2 = e2.getSsn();
		  	  return s1.compareTo(s2);
}
}