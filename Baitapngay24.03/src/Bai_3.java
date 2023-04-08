import java.util.Scanner;

public class Bai_3 {
	private Bai_2[] arr;
	
	public Bai_3() {
		
	}
	public Bai_3(Bai_2[] arr) {
		this.arr = arr;
	}

	public Bai_2[] getArr() {
		return arr;
	}

	public void setArr(Bai_2[] arr) {
		this.arr = arr;
	}
	
	public static void main(String[] args) {
		Bai_2[] arr = new Bai_2[2];
		arr[0] = new Bai_2(2, 3);
		arr[1] = new Bai_2(4, 3);
		for(int i = 0; i < 2; i++) {
			System.out.println(arr[i].getTuSo() + "/" + arr[i].getMauSo());
		}
	}

}
