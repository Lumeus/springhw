package springhw.beans;

public class FactoryBean {

	public PrinterBean createPrinter() {
		return new PrinterBean();
	}
	
	public HelloBean createHB(String name) {
		return new HelloBean(name);
	}
}
