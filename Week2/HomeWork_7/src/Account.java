public class Account {
    private String id;
    private String name;
    private int balance;

     public Account(){

     }
    public Account(String Id, String Name){
         this.id = Id;
         this.name = Name;

    }
    public Account(String Id, String Name, int Balance){
        this.id = Id;
        this.name = Name;
        this.balance = Balance;
    }


    public String getId(){
         return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setBalance(int Balance){
        this.balance = Balance;
    }

    public int getBalance(){
        return this.balance;
    }

    public int credit(int amount){
        this.balance = this.balance + amount;

        return this.balance;
    }

    public int debit(int amount){
    this.balance = this.balance - amount;

    return this.balance;
    }

    public int transferTo(Account another, int amount){
        this.balance = this.balance - amount;
         return this.balance;
    }

    public String toString(){
        int c = credit(3000);
        int d = debit(1000);
        int account = transferTo(new Account (
                "2",
                "aaa",
                1000), 1500);

         return ("Your Account = " + c + "\n" + "Your account after debited = " + d +
               "\n" + "Your account after transfer = " + account);

    }

}
