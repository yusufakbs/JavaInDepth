package inheritance;

import person.Person;

public class Employee extends Person {
    private long employeeId;
    private String departmentName;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getGreetings() {
        return "Selam";
    }
}
