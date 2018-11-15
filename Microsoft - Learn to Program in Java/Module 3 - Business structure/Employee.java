public abstract class Employee {

    //Instance variables
    private String name;
    private double baseSalary;
    private int employeeCount = 0;
    private int employeeID;
    private Employee manager;

    //Constructor for Employee
    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
        employeeCount++;
        this.employeeID = employeeCount;
    }

    //Methods for the class

    public double getBaseSalary(){

        return this.baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName(){

        return this.name;
    }

    public int getEmployeeID(){

        return this.employeeID;
    }

    public Employee getManager(){
        return this.manager;
    }

    public boolean equals(Employee other){

        return (this.employeeID == other.getEmployeeID());
    }
    public String toString(){
        return (employeeID + " " + name);
    }

    public String employeeStatus(){
        return "a";
    }
}
