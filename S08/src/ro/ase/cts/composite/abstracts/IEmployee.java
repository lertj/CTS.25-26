package ro.ase.cts.composite.abstracts;

public interface IEmployee {
    public String getName();
    public int getSalary();
    public void addEmployee(IEmployee employee);
    public void removeEmployee(IEmployee employee);
    public IEmployee getEmployee(String name);
}
