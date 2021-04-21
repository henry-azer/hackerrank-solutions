package Java.DataStructures;

import java.util.*;

class Students {

	private int id;
	private String fname;
	private double cgpa;

	public Students(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

public class JavaSort {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Students> studentList = new ArrayList<>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Students st = new Students(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}

		Comparator<Students> studentComparator = (s1, s2) -> {
			double epsilon = 0.001;
			if (Math.abs(s1.getCgpa() - s2.getCgpa()) > epsilon)
				return s1.getCgpa() < s2.getCgpa() ? 1 : -1;
			else if (!s1.getFname().equals(s2.getFname()))
				return s1.getFname().compareTo(s2.getFname());
			else
				return s1.getId() - s2.getId();
		};

		studentList.sort(studentComparator);

      	for(Students st: studentList){
			System.out.println(st.getFname());
		}
	}
}



