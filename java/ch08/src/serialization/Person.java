package serialization;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = 111L;
	
	String name;
	String job;
	
	Person(String name, String job){
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}

}
