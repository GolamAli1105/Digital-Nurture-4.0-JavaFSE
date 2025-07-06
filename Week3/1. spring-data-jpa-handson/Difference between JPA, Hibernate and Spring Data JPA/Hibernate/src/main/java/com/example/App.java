package com.example;

public class App {
  public static void main(String[] args) {
    EmployeeDAO dao = new EmployeeDAO();
    Employee emp = new Employee();
    emp.setName("John Doe");
    emp.setDepartment("HR");

    Integer id = dao.addEmployee(emp);
    System.out.println("Employee added with ID: " + id);
  }
}
