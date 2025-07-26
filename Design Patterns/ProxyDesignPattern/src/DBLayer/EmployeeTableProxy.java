package DBLayer;

import java.util.function.Function;

public class EmployeeTableProxy implements EmployeeTable{

    EmployeeTableImpl employeeTableImpl = new EmployeeTableImpl();

    @Override
    public void addEmployee(String Employee) {
        Function<String,String> fn = str -> {
            return str.length() >5 ? str.substring(0,5) : str;
        };
        Employee = fn.apply(Employee);
        System.out.println(Employee);

        employeeTableImpl.addEmployee(Employee);

    }

    @Override
    public void deleteEmployee(String Employee) {
        
    }

    @Override
    public void updateEmployee(String Employee) {
       
    }
    
}
