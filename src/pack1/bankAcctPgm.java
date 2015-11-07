package pack1;


class account
{
String name;
int bal;
int acctno;
static String bankName = "icici bank"; 
void showBalance()
{

System.out.println("Total available balance = "+bal);

}

void deposit(int amt)
{
bal+=amt;
System.out.println("Deposit successful");
}

void withdraw(int amt)
{
if(bal>=amt){
bal-=amt;
}
else
{
System.out.println("Entered the amount less than = "+amt);
}
}
}

public class bankAcctPgm 

{
	
public static void main(String[] args)
{
System.out.println("main starts");
account a1=new account();
a1.name="Sarvjeet";
a1.bal=10000;
a1.acctno=123456;
System.out.println("Acctno="+a1.acctno);
System.out.println("Bank name = "+account.bankName);
a1.showBalance();
a1.deposit(1000);
a1.showBalance();
a1.withdraw(20000);
a1.showBalance();
System.out.println("Main ends");

}
}


