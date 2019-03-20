public class Operario extends Employee {
    private String name;
    private Integer id;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Operario(String name, Integer id, double salary) {
        this.name = name;
        this.id = id;
        this.salary=salary;
    }
    @Override
    public double salary() {
        return this.salary;
    }

}
