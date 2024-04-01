package composition.exampleHuman;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Department department = new Department(340,"Muhasebe");
        department.setEmployeeList(new ArrayList<Employee>());

        Employee employee1 = new Employee(900,"Barış Manço",3400);
        employee1.setDepartment(department);
        department.getEmployeeList().add(employee1);

        Employee employee2 = new Employee(901,"Cem Karaca",2900);
        employee2.setDepartment(department);
        department.getEmployeeList().add(employee2);

        Employee employee3 = new Employee(902,"Fikret Kızılok",1700);
        employee3.setDepartment(department);
        department.getEmployeeList().add(employee3);

        System.out.println(department.getDeparmentId());
        System.out.println(department.getDeparmentName());

        for (Employee employee: department.getEmployeeList()){
            System.out.println(employee.getEmployeeId()+" "
                    +employee.getEmployeeName()+" "
                    +employee.getMonthlySalary()+" "
                    +employee.getDepartment().getDeparmentId());
        }


        //Alternative
       Employee employee00 = department.addEmployee(340,"Selim Saylın",3300);

    }
}
