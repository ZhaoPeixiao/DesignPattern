package com.peixiao.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
public class Demeter1 {
    public static void main(String[] args) {
        System.out.println("使用Demeter Principle的改进");
        SchoolMagager schoolMagager = new SchoolMagager();
        schoolMagager.printAllEmployee(new CollegeManager());
    }
}

class CollegeEmployee{
    private String id;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }
}

class Employee{
    private String id;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }
}


class CollegeManager{
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i ++){
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id = " + i);
            list.add(emp);
        }
        return list;
    }

    // 输出员工的信息
    public void printEmployee(){
        List<CollegeEmployee> list1 = this.getAllEmployee();
        System.out.println("----- 分公司员工 -------");
        for (CollegeEmployee e : list1){
            System.out.println(e.getId());
        }
    }
}

// 直接朋友类: Employee, CollegeManager
// CollegeEmployee不是直接朋友而是陌生类，这就违背了Demeter Principle.
class SchoolMagager{
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<Employee>();

        for (int i = 0; i < 5; i ++){
            Employee emp = new Employee();
            emp.setId("学校总部员工id = " + i);
            list.add(emp);
        }
        return list;
    }

    void printAllEmployee(CollegeManager sub){
        // 将输出学院员工的方法封装到CollegeManager中
        sub.printEmployee();

        List<Employee> list2 = this.getAllEmployee();
        System.out.println("----- 学校总部员工 -------");
        for (Employee e : list2){
            System.out.println(e.getId());
        }
    }
}