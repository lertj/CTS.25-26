package ro.ase.cts.composite.models;

import ro.ase.cts.composite.abstracts.IEmployee;

public class Employee implements IEmployee {
    //Leaf

    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void addEmployee(IEmployee employee) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public void removeEmployee(IEmployee employee) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public IEmployee getEmployee(String name) {
        throw new UnsupportedOperationException("Not supported");
    }
}
