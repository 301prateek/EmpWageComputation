

public class EmpWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");

		int IS_FULL_TIME = 1;
		int empAttendance = (int) Math.floor(Math.random()*10)%3;

		if(empAttendance == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}
