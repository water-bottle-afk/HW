public class Client {
    private String firstName;
    private String lastName;
    private String id;
    private String address;
    private String phone;

    private SavingAccount[] savingAccounts;
    private static Client[] allClients;
    private static int index;
    private Banker banker;



    static void printAllClients(){
        for (int i=0;i<Client.allClients.length;i++){
            System.out.println(Client.allClients[i].ToString()+"\n");
        }
    }

    public String ToString(){
        String totalMoney = "";
        for (int i=0;i<this.savingAccounts.length;i++){
            totalMoney+= this.savingAccounts[i].getBallance();
        }
        return String.format("Client[%s %s, id = %s, address = %s, phone = %s, number of accounts = %d, Total ballance = %f] ",
        this.firstName, this.lastName, this.id, this.address, this.phone, this.savingAccounts.length, totalMoney);
    }
}
