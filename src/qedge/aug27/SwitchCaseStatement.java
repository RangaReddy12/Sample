package qedge.aug27;
public class SwitchCaseStatement {
	public static void main(String[] args) {
		String course ="selenium";
		switch (course.toUpperCase()) {
		case "MANUALTESTING":
			System.out.println("Course is AvialLable::"+course);
			break;
		case "JAVA":
			System.out.println("Course is AvialLable::"+course);
			break;
		case "SELENIUM":
			System.out.println("Course is AvialLable::"+course);
			break;
		case "PYTHON":
			System.out.println("Course is AvialLable::"+course);
			break;
		default:
			System.out.println("Course is Not AvialLable::"+course);
			break;
		}
     	}

}
