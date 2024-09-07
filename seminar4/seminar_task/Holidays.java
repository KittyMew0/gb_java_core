package geekbrains_course.java_core.seminar4.seminar_task;

public class Holidays {
	enum HolidayDate{
		NONE,
		NEW_YEAR,
		MARCH_8,
		FEB_23
	};
	
	private static final HolidayDate today = HolidayDate.NONE;
	
	private static void celebrate(Employee[] emp) {
		for (int i = 0; i < emp.length; i++) {
			switch(today) {
				case NEW_YEAR:
					System.out.println(emp[i].name + ", ");
					break;
				case FEB_23:
					if (emp[i].gender == Employee.Genders.MALE) {
						System.out.println(emp[i].name + ", ");
					}
					break;
				case MARCH_8:
					if (emp[i].gender == Employee.Genders.FEMALE) {
						System.out.println(emp[i].name + ", ");
					}
					break;
				default:
					System.out.println(emp[i].name + ", celebrate this morning!");
			}
		}
	}
	
}
