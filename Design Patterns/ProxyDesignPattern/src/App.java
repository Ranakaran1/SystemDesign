import DBLayer.EmployeeTable;
import DBLayer.EmployeeTableProxy;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        EmployeeTable employeeTable = new EmployeeTableProxy();
        employeeTable.addEmployee("Malanamana");
    }
}
