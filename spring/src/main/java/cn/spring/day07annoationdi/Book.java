package cn.spring.day07annoationdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/12 10:17
 **/
@Component
public class Book {
    @Value("1")
    private Integer bookId;
    @Value("百年孤独")
    private String bookName;
    @Value("100")
    private Integer bookPrice;

    //Spring注解
//    @Autowired
//    @Qualifier("pub")  名字必须和实体类中的一样

    //JDK注解
    @Resource
    //@Autowired自动装配
    //byType  byName
    private Publisher pub;

    public Publisher getPub() {
        return pub;
    }

    public void setPub(Publisher pub) {
        this.pub = pub;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Integer bookPrice) {
        this.bookPrice = bookPrice;
    }
}
