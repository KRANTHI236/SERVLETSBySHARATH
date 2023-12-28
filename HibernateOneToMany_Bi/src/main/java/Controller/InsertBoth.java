package Controller;

import java.util.ArrayList;
import java.util.List;

import Dao.Logic;
import Dto.Bag;
import Dto.Books;

public class InsertBoth {

	public static void main(String[] args) {

		Bag b = new Bag();
		b.setBagNumber(10);
		b.setBagCompany("puma");
		b.setBagColour("red");
		b.setBagPrice(1000);

		Books books = new Books();

		books.setBookId(10);
		books.setBookName("java");
		books.setBookAuthor("xyz");
		books.setBookPrice(200);

		Books books1 = new Books();

		books1.setBookId(20);
		books1.setBookName("sql");
		books1.setBookAuthor("pqr");
		books1.setBookPrice(100);

		Books books2 = new Books();

		books2.setBookId(30);
		books2.setBookName("web");
		books2.setBookAuthor("abc");
		books2.setBookPrice(200);
		List<Books> b1 = new ArrayList<>();
		b1.add(books);
		b1.add(books1);
		b1.add(books2);

		b.setBook(b1);

		Logic l1 = new Logic();
		l1.insertBoth(b);

	}

}
