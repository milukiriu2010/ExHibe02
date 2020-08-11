package milu.kiriu2010.exhibe02.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookDao extends DaoSupport {
	public void save(Book book) {
		// セッション取得
		Session session = getSession();
		// トランザクション開始
		Transaction transaction = session.beginTransaction();
		// bookオブジェクトを永続化
		session.save(book);
		transaction.commit();
		session.close();
	}
	
	// データをロードする
	public Book load(String isbn) {
		// セッション取得
		Session session = getSession();
		// データロード
		Book book = (Book)session.load(Book.class, isbn);
		session.close();
		return book;
	}
	
	// 全レコードを取り出す
	@SuppressWarnings("unchecked")
	public List<Book> searchAll() {
		// セッション取得
		Session session = getSession();
		List<Book> list = (List<Book>)session.createCriteria(Book.class).list();
		return list;
	}
}
