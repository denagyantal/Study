public abstract class BusinessEmployee extends Employee {

    //Instance variables
    public double bonusBudget;

    //Constructor
    public BusinessEmployee(String name){
        super (name,50000);
    }

    public double getBonusBudget(){
        return bonusBudget;
    }

    public String employeeStatus(){
        return getEmployeeID() + " " + getName() + " with a budget of " + bonusBudget;
    }
}
