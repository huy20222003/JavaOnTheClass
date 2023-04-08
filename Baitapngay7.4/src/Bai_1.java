
class MyArray1 {
	int Maxn, a[], n;
	
	MyArray1(int[] arr) {
		n = arr.length;
		Maxn = 2 * n;
		a = new int [Maxn];
		for(int i = 0; i < n; i++) {
			a[i] = arr[i];
		}
	}
	
	void Output() {
		for(int i = 0; i < n; i++) {
			System.out.println(i < n - 1 ? a[i] + "," : a[i] + "\n");
		}
	}
	
	void Add(int x) {
		if(n == Maxn) {
			System.out.println("Array is full");
		} else {
			a[n] = x;
			n++;
		}
	}
	
	void Add(int x, int i) {
		if(n == Maxn) {
			System.out.println("Array is full");
		} else {
			for(int j = n; j > i; j--) {
				a[i] = x;
				n++;
			}
		}
	}
}

public class Bai_1 extends MyArray1{
	Bai_1(int arr[]) {
		super(arr);
	}
	
	void Add(int x) {
		if(n == Maxn) {
			System.out.println("Array is full");
		} else {
			for(int i = n; i > 0; i--) {
				a[0] = x;
				n++;
			}
		}
	}
	
}
