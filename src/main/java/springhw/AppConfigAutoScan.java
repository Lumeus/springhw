package springhw;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.scanbeans.HelloBean;
import springhw.scanbeans.PrinterBean;

public class AppConfigAutoScan {

	public static void main(String[] args) {
		// Создаём конекст приложения из xml файла ("src/main/resources/applicationAutoScanContext.xml")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationAutoScanContext.xml");
		// Считываем бин (объект)
		HelloBean hb = ctx.getBean("HB", HelloBean.class);
		// Считываем бин принтера
		PrinterBean pr = ctx.getBean("PB", PrinterBean.class);
		// Печатаем объект в консоль
		pr.print(hb);
		// Закрываем контекст приложения 
		ctx.close();
	}

}
