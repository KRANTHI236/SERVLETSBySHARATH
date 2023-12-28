package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.Persondao;
import Dto.Pancard;
import Dto.Person;

public class UpdateBoth {

	public static void main(String[] args) {

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("person.xml");
		Person person=(Person) applicationContext.getBean("person");
		Pancard pancard=(Pancard) applicationContext.getBean("pancard");
		Persondao persondao=(Persondao) applicationContext.getBean("persondao");
		
		person.setPersonName("abc");
		person.setPersonAge(20);
		person.setPersonAddress("hyd");
		
		pancard.setPancardNo("5679yyh");
		pancard.setPancardAuthority("GOI");
		person.setPancard(pancard);
		persondao.update(2, person);
	}

	
}
