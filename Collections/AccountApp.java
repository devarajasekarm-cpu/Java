import java.util.*;

public class AccountApp extends Account{

    void main(){

        Account user1 = new Account("Deva",1111,10000);
        Account user2 = new Account("Raja",2222,20000);
        Account user3 = new Account("Sekar",3333,30000);
        Account user4 = new Account("Sasi",4444,40000);
        Account user5 = new Account("Kumar",5555,50000);

        // using array
        Account[] arrAccountants = {user1, user2, user3, user4, user5};

        for(Account i:arrAccountants){
            System.out.println(i.name +" "+ i.accountNo+" "+i.amount);
        }

        // using arraylist
        ArrayList<Account> accountantList = new ArrayList();

        accountantList.add(user1);
        accountantList.add(user2);
        accountantList.add(user3);
        accountantList.add(user4);
        accountantList.add(user5);

        //show all details about each accountant
        for(Account acc:accountantList){
            System.out.println("Name : "+acc.name+ " Account No : "+acc.accountNo+ " Amount : "+ acc.amount);
        }

    }

}
