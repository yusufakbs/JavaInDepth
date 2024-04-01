package composition.exampleHuman;

import java.util.List;

public class Department {
    private long deparmentId;
    private String deparmentName;

    private List<Employee> employeeList;

    public long getDeparmentId() {
        return deparmentId;
    }

    public void setDeparmentId(long deparmentId) {
        this.deparmentId = deparmentId;
    }

    public String getDeparmentName() {
        return deparmentName;
    }

    public void setDeparmentName(String deparmentName) {
        this.deparmentName = deparmentName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Department() {
    }

    public Department(long deparmentId, String deparmentName) {
        this.deparmentId = deparmentId;
        this.deparmentName = deparmentName;
    }

    //alternative
    public Employee addEmployee(int employeeId, String employeeName, int monthlySalary){
        Employee employee = new Employee(deparmentId, employeeName, monthlySalary);
        employee.setDepartment(this);
        employeeList.add(employee);
        return employee;
    }
}
