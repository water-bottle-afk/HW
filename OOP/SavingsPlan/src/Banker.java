public class Banker {
    private String firstName;
    private String lastName;
    private String id;
    private String address;
    private String phone;

    private Client[] clients;
    private static Banker[] allBankers;
    private static int index;

    static void printAllBankers(){
        for (int i=0;i<Banker.allBankers.length;i++){
            System.out.println(Banker.allBankers[i].ToString()+"\n");
        }
    }

    private void printAllClients(){
        for (int i=0;i<this.clients.length;i++){
            System.out.println(this.clients[i].ToString()+"\n");
        }
    }

    public Banker(String firstName, String lastName, String id, String address, String phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.address = address;
        this.phone = phone;
        Banker.AddBanker(this);
    }

    static {
        Banker.allBankers = new Banker[100];
        Banker.index = 0;
    }


    static void AddBanker(Banker banker){
        if (index >= Banker.allBankers.length){
            //Extend arr
            Banker[]tmp = new Banker[Banker.allBankers.length*2];
            for (int i=0;i<Banker.allBankers.length;i++){
                tmp[i] = Banker.allBankers[i];
            }
            Banker.allBankers = tmp;
        }
        else{
            Banker.allBankers[index] = banker;
        }
        index++;
    }



    public String ToString(){
        return String.format("Banker[%s %s, id = %s, address = %s, phone = %s, number of clients = %d] ",
        this.firstName, this.lastName, this.id, this.address, this.phone, this.clients.length);
    }
}
