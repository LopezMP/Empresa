public class Vendedor extends Employee {
    private String name;
    private Integer id;
    private double bsalary;
    private Integer idManager;
    private double ventes;//lista de ventas

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public double getBsalary() {
        return bsalary;
    }

    public Integer getIdManager() {
        return idManager;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setIdManager(Integer idManager) {
        this.idManager = idManager;
    }

    public void setBsalary(double bsalary) {
        this.bsalary = bsalary;
    }

    public void setVentes(double ventes) {
        this.ventes = ventes;
    }

    public Vendedor(String name, Integer id, double bsalary, Integer idManager){
        this.name = name;
        this.id=id;
        this.bsalary=bsalary;
        this.idManager=idManager;
    }

    @Override
    public double salary() {
        return bsalary+(0.1*ventes);
    }
}
