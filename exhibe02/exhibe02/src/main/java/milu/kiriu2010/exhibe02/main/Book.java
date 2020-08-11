
package milu.kiriu2010.exhibe02.main;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Book {
    private String isbn = null;
    
    private String name = null;
 
    private int price = -1;
 
    /**
     * @return isbn を戻します。
     */
    public String getIsbn() {
        return isbn;
    }
 
    /**
     * @param isbn
     *            isbn を設定。
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
 
    /**
     * @return name を戻します。
     */
    public String getName() {
        return name;
    }
 
    /**
     * @param name
     *            name を設定。
     */
    public void setName(String name) {
        this.name = name;
    }
 
    /**
     * @return price を戻します。
     */
    public int getPrice() {
        return price;
    }
 
    /**
     * @param price
     *            price を設定。
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                                                  ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
