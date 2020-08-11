package milu.kiriu2010.exhibe02.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * 人をインサートするためのサンプル
 */
// https://www.techscore.com/tech/Java/Others/Hibernate/05-3/
public class ExHibe14 {

	  /**
	   * 
	   * @param args
	   */
	  public static void main(String[] args) {
		    Configuration config = new Configuration().configure();
		    SessionFactory sessionFactory = config.buildSessionFactory();
		    Session session = sessionFactory.openSession();
		    Transaction transaction = session.beginTransaction();
		    
		    Book book = (Book) session.load(Book.class, "ISBN4-0000-0000-0");
		    
		    Person person = new Person();
		    person.setName("四次元太郎");
		    Set set = new HashSet();
		    set.add(book);
		    person.setBooks(set);
		    
		    session.save(person);

		    transaction.commit();
		    session.close();
	  }
}
