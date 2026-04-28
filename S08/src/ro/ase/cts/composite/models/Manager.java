package ro.ase.cts.composite.models;

import ro.ase.cts.composite.abstracts.IEmployee;

import java.util.ArrayList;
import java.util.List;

public class Manager implements IEmployee {
    //Composite
    String name;
    int salary;
    List<IEmployee> employees = new ArrayList<>();

    public Manager(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        String names = name;
        for(IEmployee e : employees) {
            names += ", " + e.getName();
        }
        return names;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void addEmployee(IEmployee employee) {
        employees.add(employee);
    }

    @Override
    public void removeEmployee(IEmployee employee) {
        employees.remove(employee);
    }

    @Override
    public IEmployee getEmployee(String name) {
       for(IEmployee e : employees) {
           if(e.getName().equals(name)) {
               return e;
           }
       }
       return null;
    }
}
