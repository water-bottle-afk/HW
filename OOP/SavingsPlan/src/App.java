public class App {
    public static void main(String[] args) throws Exception {
        //1
        SavingAccount saccount1 = new SavingAccount(5000);
        SavingAccount saccount2 = new SavingAccount(6000);

        saccount1.calculateMonthlyIntrest();
        saccount2.calculateMonthlyIntrest();

        System.out.println(saccount1.ToString());
        System.out.println(saccount2.ToString());

        SavingAccount.modifyAnnualIntrestRate(18);

        SavingAccount saccount3 = new SavingAccount(1000);
        saccount3.calculateMonthlyIntrest();
        System.out.println(saccount3.ToString());

        //2
        
    }
}
