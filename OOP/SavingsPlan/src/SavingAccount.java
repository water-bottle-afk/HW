public class SavingAccount {
    private static double AnnualIntrestRate; // In %
    private double SavingBallance;

    public SavingAccount (double SavingBallance){
        this.SavingBallance=SavingBallance;
    }

     static {
        SavingAccount.AnnualIntrestRate = 6;
    }

    public static void modifyAnnualIntrestRate(double AnnualIntrestRate){
        SavingAccount.AnnualIntrestRate = AnnualIntrestRate;
    }

    public double getBallance(){
        return this.SavingBallance;
    }

    public void calculateMonthlyIntrest(){
        double monthlyIntrestRate = (SavingAccount.AnnualIntrestRate/100)/12;
        this.SavingBallance += monthlyIntrestRate*this.SavingBallance;

      //  this.SavingBallance = ((SavingAccount.AnnualIntrestRate/12/100)+1)*this.SavingBallance;
    }

    public String ToString(){
        return String.format("Savings Account[Saving Ballance= %f] ",this.SavingBallance);
    }

    
}
