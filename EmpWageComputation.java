

public class EmpWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;

		int empHrs  = 0;
		int empWage = 0;

		int empAttendance = (int) Math.floor(Math.random()*10)%3;

		if(empAttendance == IS_FULL_TIME)
			empHrs = 8;
		else if (empAttendance == IS_PART_TIME)
			empHrs = 4;
		else
			empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage : "+empWage);
	}
}
