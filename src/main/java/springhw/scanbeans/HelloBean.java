package springhw.scanbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("HB")
public class HelloBean {
	private String name;

	//Конструктор
	public HelloBean() {
		super();
		this.name = "HW";
	}

	//Getter
	public String getName() {
		return name;
	}
	
	//Setter	
	public void setName(String name) {
		this.name = name;
	}

	//Печать объекта в строку
	//@Override
	public String toString() {
		return "HelloBean [name=" + name + ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
