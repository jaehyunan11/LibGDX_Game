package clients;

import domain.Employee;
import domain.dao.EmployeeDAO;
import reporting.EmployeeReportFormatter;

import java.awt.font.TransformAttribute;

public class ClientModule {

    public static void main(String args[]) {
        Employee peggy = new Employee(1,"peggy","account",true);
        ClientModule.hireNewEmployee(peggy);
        printEmployeeReport(peggy);
    }


    public static void hireNewEmployee(Employee employee){
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.saveEmployee(employee);

    }

    public static void terminateEmployee(Employee employee){
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType.CSV);
        System.out.println(formatter.getFormattedEmployee());

    }
}
