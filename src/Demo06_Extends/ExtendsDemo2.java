package Demo06_Extends;

class User{
    private String userName;
    private double balance;

    User(){
    }
    User(String userName,double balance){
        this.userName = userName;
        this.balance = balance;
    }

    void setUserName(String userName){
        this.userName = userName;
    }
    String getUserName(){
        return userName;
    }
    void setBalance(double balance){
        this.balance = balance;
    }
    double getBalance(){
        return balance;
    }

    public void showInfo(){
        System.out.println("UserName:"+userName+" balance:"+balance);
    }
}

class Admin extends User{

}
class Member extends User{

}
public class ExtendsDemo2 {
    Admin a = new Admin();
    Member m = new Member();

}
