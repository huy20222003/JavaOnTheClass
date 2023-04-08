
public class Bai_2 {
	private int tuSo;
	private int mauSo;
	
	public Bai_2() {
		this.tuSo = 0;
		this.mauSo = 0;
	}

	public Bai_2(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}

	public int getTuSo() {
		return tuSo;
	}

	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}

	public int getMauSo() {
		return mauSo;
	}

	public void setMauSo(int mauSo) {
		if(this.mauSo != 0) {
			this.mauSo = mauSo;
		}
	}

	public static void main(String[] args) {
		Bai_2 b = new Bai_2();
		Bai_2 b1 = new Bai_2(2, 3);
		System.out.println(b1.tuSo + " " +  b1.mauSo);
	}

}
