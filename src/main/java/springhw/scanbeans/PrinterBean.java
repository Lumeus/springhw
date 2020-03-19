package springhw.scanbeans;

import org.springframework.stereotype.Component;

@Component("PB")
public class PrinterBean {

	//Конструктор
	public PrinterBean() {
		super();
	}
	
	//Print
	public void print(HelloBean hb) {
		System.out.println(hb);
	}

}
