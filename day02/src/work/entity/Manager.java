package work.entity;

public class Manager extends Employee {
    @Override
    public void work() {
        System.out.println("把控项目进度");
    }
}
