package question_There;

import java.util.Date;

/**
 * @author 30391
 */
public class Student {
    private int id;
    private String name;
    private String sex;
    private Date date;

    private String local;


    public Student() {
    }

    public Student(int id, String name, String sex, Date date, String local) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.local = local;
    }

    /**
     * 获取
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     *
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     *
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 获取
     *
     * @return local
     */
    public String getLocal() {
        return local;
    }

    /**
     * 设置
     *
     * @param local
     */
    public void setLocal(String local) {
        this.local = local;
    }

    public String toString() {
        return "Student{id = " + id + ", name = " + name + ", sex = " + sex + ", date = " + date + ", local = " + local + "}";
    }
}
