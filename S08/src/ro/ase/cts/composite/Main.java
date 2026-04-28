package ro.ase.cts.composite;

import ro.ase.cts.composite.abstracts.IEmployee;
import ro.ase.cts.composite.models.Employee;
import ro.ase.cts.composite.models.Manager;

public class Main {
    static void main() {
        IEmployee m1 = new Manager("Gigel", 3000);
        IEmployee e1 = new Employee("Sebastian", 300);
        m1.addEmployee(e1);
        m1.addEmployee(new Manager("Vali", 2999));
        IEmployee m2 = m1.getEmployee("Vali");
        m2.addEmployee(new Employee("Odobasian", 299));
        m2.addEmployee(new Employee("BalaurEntiu", 29));

        //m1.getName();
        System.out.println(m2.getName());
        System.out.println(e1.getName());
    }
}
