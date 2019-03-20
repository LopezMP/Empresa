import java.util.List;

public interface CompanyManager {
    public void addEmployee(String id, String name, String salary);
    public void nuevaventa (String idvendedor, String idventa, double precio);
    List<Employee> findAllOrderByName();
    List<Employee> findAllOrderBySalary();
}
