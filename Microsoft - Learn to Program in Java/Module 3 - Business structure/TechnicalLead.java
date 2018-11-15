import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {

    //instance variables
    private int headCount;
    public ArrayList < SoftwareEngineer > reports = new ArrayList <SoftwareEngineer>();

    //constructor
    public TechnicalLead(String name){
        super(name);
        headCount = 4;
        setBaseSalary(getBaseSalary() * 1.3);
    }

    //Methods
    public boolean hasHeadCount(){
        return reports.size() < headCount;
    }
    public boolean addReport(SoftwareEngineer e){
        if (hasHeadCount()){
            reports.add(e);
            return true;
        }
        return false;
    }
    public boolean approveCheckIn(SoftwareEngineer e){
        return reports.contains(e) && e.getCodeAccess();
    }

    public boolean requestBonus(Employee e, double bonus){
        if (((Accountant) getManager()).approveBonus(bonus)){
            ((SoftwareEngineer) e).bonus += bonus;
            return true;
        }
        return false;
    }

    public String getTeamStatus(){
        String result = "";
        result += employeeStatus();
        if (reports.size() == 0){
            result += " and no direct reports yet.";
        } else {
            result += " and is managing: \n";
            for (int i = 0; i < reports.size(); i++){
                result += reports.get(i).employeeStatus() + "\n";
            }
        }
        return result;
    }
}