package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.Persondao;
import Dto.Pancard;
import Dto.Person;

public class FetchById {

	public static void main(String[] args) {

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("person.xml");
		Person person=(Person) applicationContext.getBean("person");
		Pancard pancard=(Pancard) applicationContext.getBean("pancard");
		Persondao persondao=(Persondao) applicationContext.getBean("persondao");
		persondao.fetchById(1);
	}

}
