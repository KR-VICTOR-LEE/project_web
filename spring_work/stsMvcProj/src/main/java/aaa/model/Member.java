package aaa.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {
	
	String id, pw, name, address, tel;
	int age;
}
