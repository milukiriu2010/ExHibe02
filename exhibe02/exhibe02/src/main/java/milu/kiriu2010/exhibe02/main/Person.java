package milu.kiriu2010.exhibe02.main;

import java.util.Set;

public class Person {
	  /** id */
	  private int id = -1;
	  /** 名前 */
	  private String name = null;
	  /** 所有する本 */
	  private Set books = null;
	 
	  /**
	   * @return books を戻します。
	   */
	  public Set getBooks() {
	    return books;
	  }
	  /**
	   * @param books books を設定。
	   */
	  public void setBooks(Set books) {
	    this.books = books;
	  }
	  /**
	   * @return name を戻します。
	   */
	  public String getName() {
	    return name;
	  }
	  /**
	   * @param name name を設定。
	   */
	  public void setName(String name) {
	    this.name = name;
	  }
	  /**
	   * @return id を戻します。
	   */
	  public int getId() {
	    return id;
	  }
	  /**
	   * @param id id を設定。
	   */
	  public void setId(int id) {
	    this.id = id;
	  }
}
