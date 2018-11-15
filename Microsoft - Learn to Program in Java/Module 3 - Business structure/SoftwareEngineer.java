public class SoftwareEngineer extends TechnicalEmployee {

    //Instance variables
    public boolean codeAccess;
    public double bonus;

    //Constructor
    public SoftwareEngineer(String name){
        super(name);
    }

    //Methods
    public boolean getCodeAccess(){
        return codeAccess;
    }

    public void setCodeAccess(boolean access){
        codeAccess = access;
    }
    public int getSuccessfulCheckIns(){
        return checkIns;
    }
    public boolean checkInCode(){
        return false;

    }
}
