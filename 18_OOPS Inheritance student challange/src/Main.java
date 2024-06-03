import javax.security.auth.login.AccountException;

class Account {
    public String account;
    public String name;
    public String address;
    public String phno;
    public long balance;
    public String dob;

    public account(String acc, String n, String add, String phno, String dob) {
        account = acc;
        name = n;
        address = add;
        this.phno = phno;
        balance = 0;

    }

    public String getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phno;
    }

    public String getAddress() {
        return address;
    }

    public long getBalance() {
        return balance;
    }

    public String getDob() {
        return dob;
    }

    public void setAddress(String add) {
        address = add;
    }

}

class SavingsAccount extends Account
{
    public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }
}

class LoanAccount extends Account
{
    public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}




public class Main {
    public static void main(String[] args) {
    }
}