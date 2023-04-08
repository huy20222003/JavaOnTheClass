
public class Employee extends Person{
	public float salary;

	public Employee(String ten, int tuoi, String diaChi, float salary) {
		super(ten, tuoi, diaChi);
		this.salary = salary;
	}
	
	public void Show() {
		System.out.println("Ho Ten: " + this.ten  + "co luong la: " + this.salary);
	}
	
	public static void main(String[] args) {
		Employee ep = new Employee("Huy", 20, "Ha Noi", 300000f);
		ep.Show();
	}
}
