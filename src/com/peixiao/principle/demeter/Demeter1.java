package com.peixiao.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
public class Demeter1 {
    public static void main(String[] args) {
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
        // 1. 这里的CollegeEmployee不是SchoolMagager的直接朋友
        // 2. CollegeEmployee是以局部变量的方式出现在SchoolMagager
        // 3. 违背了Demeter Principle.
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("----- 分公司员工 -------");
        for (CollegeEmployee e : list1){
            System.out.println(e.getId());
        }

        List<Employee> list2 = this.getAllEmployee();
        System.out.println("----- 学校总部员工 -------");
        for (Employee e : list2){
            System.out.println(e.getId());
        }
    }
}