package work.entity;

import java.util.Objects;

public class Animal {
    private String naem;
    private int age;


    public Animal() {
    }

    public Animal(String naem, int age) {
        this.naem = naem;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return naem
     */
    public String getNaem() {
        return naem;
    }

    /**
     * 设置
     *
     * @param naem
     */
    public void setNaem(String naem) {
        this.naem = naem;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Animal{naem = " + naem + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(naem, animal.naem);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(naem, age);
//    }
}
