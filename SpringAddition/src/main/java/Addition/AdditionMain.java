package Addition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdditionMain {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("addition.xml");
		AdditionBean ab = (AdditionBean) ac.getBean("studentbean");
		ab.printAddition();
	}

}
