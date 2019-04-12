package cn.spring.day07annoationdi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/12 11:00
 **/
@Component("pub")
public class Publisher {
    @Value("北京出版社")
    private String publiName;
    private Integer publiId;

    public String getPubliName() {
        return publiName;
    }

    public void setPubliName(String publiName) {
        this.publiName = publiName;
    }

    public Integer getPubliId() {
        return publiId;
    }

    public void setPubliId(Integer publiId) {
        this.publiId = publiId;
    }
}
