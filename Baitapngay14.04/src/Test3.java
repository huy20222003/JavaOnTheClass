
public class Test3 {
	public static String teamInfo(Person p1, Person p2) {
		return "Leader: " + p1.getName() + 
				", member: " + p2.getName();
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Manager m1 = new Manager();
		Manager m2 = new Manager();
		
		e1.setName("Huy");
		e2.setName("Dung");
		m1.setName("Hoanh");
		m2.setName("Hai");
		
		System.out.println(teamInfo(e1, e2));
		System.out.println(teamInfo(m1, m2));
		System.out.println(teamInfo(m1, e2));
	}

}
