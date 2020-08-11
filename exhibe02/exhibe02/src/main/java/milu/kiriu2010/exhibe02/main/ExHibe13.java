package milu.kiriu2010.exhibe02.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 条件付きで Book オブジェクト取得するクラス
 * プレースホルダ―
 * クエリをBook.hbm.xmlに記述
 */
// https://www.techscore.com/tech/Java/Others/Hibernate/04-2/
public class ExHibe13 {

	  /**
	   * データを検索するためのメインメソッド
	   * @param args
	   */
	  public static void main(String[] args) {
		    Configuration config = new Configuration().configure();
		    SessionFactory sessionFactory = config.buildSessionFactory();
		    Session session = sessionFactory.openSession();
		    Query query = getQuery(session);
		    List list = query.list();
		    for (int i = 0; i < list.size(); i++) {
		      System.out.println(((Book)list.get(i)).getName());
		    }
		    session.close();
	  }
	  
	  private static Query getQuery(Session session) {
		    Query query = session.getNamedQuery("priceLessThan");
		    query.setInteger("price", 2000);
		    return query;
	  }
}
