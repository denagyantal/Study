public class Accountant extends BusinessEmployee {

    //instance variables
    private TechnicalLead teamSupported;

    //constructor
    public Accountant(String name){
        super(name);
    }

    //Methods
    public TechnicalLead getTeamSupported(){
        return teamSupported;
    }

    public void supportTeam(TechnicalLead lead){
        teamSupported = lead;
        double total = 0;
        for (int i = 0; i < teamSupported.reports.size(); i++){
            total += teamSupported.reports.get(i).getBaseSalary();
        }
        bonusBudget = total * 1.1;
    }

    public boolean approveBonus(double bonus){
        return teamSupported != null && bonus < bonusBudget;
    }

    public String employeeStatus(){
        return super.employeeStatus() + " is supporting " + teamSupported;
    }
}