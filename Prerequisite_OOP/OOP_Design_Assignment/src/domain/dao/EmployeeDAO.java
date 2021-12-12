package domain.dao;

import domain.Employee;

public class EmployeeDAO {
    public void saveEmployee(Employee employee){
//        database.DatabaseConnectionManager connectionManager = database.DatabaseConnectionManager.getManager;
//        connectionManager.connect();
//        connectionManager.getConnectionObject().prepareStatement("insert int domain.Employee tbl");
//        connectionManager.disconnect();
        System.out.println("saved employee to the database " + employee);
    }

    public void deleteEmployee(Employee employee) {

        System.out.println("deleted employee to the database " + employee);

    }
}
