package Controller;

import java.util.ArrayList;
import java.util.List;

import Dao.Logic;
import Dto.Bag;
import Dto.Books;

public class Update {

	public static void main(String[] args) {

		Bag b1 = new Bag();

		b1.setBagCompany("puma");
		b1.setBagColour("black");
		b1.setBagNumber(20);
		b1.setBagPrice(2000);

		Books books = new Books();
		books.setBookId(2);
		books.setBookName("advJava");
		books.setBookPrice(200);
		books.setBookAuthor("hima");

		Books books1 = new Books();
		books1.setBookId(3);
		books1.setBookName("mysql");
		books1.setBookPrice(100);
		books1.setBookAuthor("rani");

		List<Books> b = new ArrayList<>();
		b.add(books);
		b.add(books1);

		b1.setBook(b);
		Logic logic = new Logic();
		logic.updateBoth(2, b1);

	}

}
