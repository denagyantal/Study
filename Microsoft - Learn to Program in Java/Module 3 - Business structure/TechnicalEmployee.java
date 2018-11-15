public abstract class TechnicalEmployee extends Employee {

    //Instance variables
    public int checkIns;

    //Constructor
    public TechnicalEmployee(String name){
        super(name,7500);
    }
    public String employeeStatus(){
        return (getEmployeeID() + " " + getName() + " has " + checkIns + " successful check ins");
    }
}
