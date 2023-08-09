package di_p;

import java.util.Arrays;

public class Student {

	String name;
	int[] arr;

	int total, avg;

	public Student() {} // 기본생성자
	
	public Student(String name, int[] arr) {
		this.name = name;
		this.arr = arr;
		calc();
	}

	void calc() {
		total = 0;
		for(int i : arr) {
			total += i;
		}
		avg = total / arr.length;
	}

	public void rank() {
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", arr=" + Arrays.toString(arr) + ", total=" + total + ", avg=" + avg + "]";
	}

}
