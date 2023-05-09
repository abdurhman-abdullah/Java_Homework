public class Employee {
    private String id;
    private String name;
    private int salary;

    public Employee(String id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salary;
    }

    public int getAnnualSalary(){
        return this.salary;
    }

    public int getRaisedSalary(int percent){
        this.salary = this.salary + percent;
        return this.salary;
    }

    public String toString(){
        int s = getRaisedSalary(100);
        return ("Your salary = " + s);
    }
}
