public class Manager extends Employee {
    private String name;
    private Integer id;
    private double bsalary;
    private double vendedors; //lista vendedores fer funció diners

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public double getBsalary() {
        return bsalary;
    }

    public double getVendedors() {
        return vendedors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBsalary(double bsalary) {
        this.bsalary = bsalary;
    }

    public void setVendedors(double vendedors) {
        this.vendedors = vendedors;
    }

    public Manager(String name, Integer id, double bsalary){
        this.name=name;
        this.id=id;
        this.bsalary=bsalary;
        this.vendedors=0;
    }
    @Override
    public double salary() {
        return bsalary+(0.01*vendedors);
    }
}
