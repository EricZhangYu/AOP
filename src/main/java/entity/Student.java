package entity;

import java.io.Serializable;

/**
 * @ClassName
 * @Author zhangyukang
 * @Date 2019/4/9 9:44
 **/
//Serializable 序列化
public class Student implements Serializable{
    private int sid;
    private String sname;
    private int tid;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", tid=" + tid +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }
}
