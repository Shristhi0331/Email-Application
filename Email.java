package email_application;
import java.util.Scanner;
public class Email {
private String firstname;
private String lastname;
private String department;
private String password;
private String email;
private String randomPassword;
private int mailboxcapacity=500;
private int defaultPasswordlength=10;
private String alternateEmail;
private String companySuffix="xyzcomany.com";

// asking first and last name
public Email(String firstname,String lastname)
{
	this.firstname=firstname;
	this.lastname=lastname;
	System.out.println("EMAIL CREATED: "+this.firstname+" "+this.lastname);
	
	// Call a method asking for department and return department
this.department=setDepartment();
System.out.println("Department: "+this.department);

    //method that returns a random password
this.password=randomPassword(defaultPasswordlength);
System.out.println("Your password is:"+this.password);

    //combining elements to generate email
email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department +companySuffix;
System.out.println("Your email is:"+email);
}
	private String setDepartment()
	{
System.out.println(" ENTER THE DEPARTMENT CODE\n1 for sales \n2 for development \2 for accounting \n0 for none");
Scanner in=new Scanner(System.in);
int Deptchoice=in.nextInt();
if(Deptchoice==1) {return "sales";}
else if(Deptchoice==2) {return "development";}
else if(Deptchoice==3) {return "accounting";}
else {return " ";}
}
	
//Generate a random password
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@$%";
		char[]password=new char[length];
		for(int i=0;i<length;i++)
		{
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
			}
		return new String(password);
	}
//Set the mailbox capacity
	public void setMailCapacity(int capacity) {
		this.mailboxcapacity=capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail=altEmail;
	}
	//change the password
	public void changePassword(String password) {
		this.password=password;
	}
	public int getMailboxCapacity() {return mailboxcapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME:"+firstname+" "+lastname+
				"COMPANY EMAIL:"+email+
				"MAILBOX CAPACITY:"+	mailboxcapacity+"ab";
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
