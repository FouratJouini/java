public class Bank {
    private String account_number;
    private String login;
    private String password;
    //polymorphism (1/4 of pillars)
    //constructor_1
    public Bank(String account_number, String login, String password ){
        this.account_number = account_number;
        this.login = login;
        this.password = password;
    }
    //constructor_2
    public Bank(String login, String password){
        this.login = login;
        this.password = password;
    }
    //getters and setters
    //getter
    public String getAccountNumber(){
        return this.account_number;
    }
    //setter
    public void setAccountNumber(String newAccountNumber){
        this.account_number = newAccountNumber;
    }
    //toString
    public String toString(){
        return "Account Number: \n" + this.account_number + "\nLogin:\n" + this.login + "\nPassword:\n" + this.password;
    }
}
