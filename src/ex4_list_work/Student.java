package ex4_list_work;

public class Student {
	
	private String name;
	private int korea;
	private int eng;
	private int math;
	
	public Student( String name, int korea, int eng, int math ) {
		
		this.name = name;
		this.korea = korea;
		this.eng = eng;
		this.math = math;
		
	}
	
	public int total() {
		return korea + eng + math;
	}
	
	public float avg() {
		return total() / 3f;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorea() {
		return korea;
	}
	public void setKorea(int korea) {
		this.korea = korea;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	

}
