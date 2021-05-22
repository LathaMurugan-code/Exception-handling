package collectionpackage;  
import java.util.Date;  
public class VoterIdEligibilty {  
public static void main(String[] args)throws Exception {  
    Date today = new Date();                   
    @SuppressWarnings("deprecation")
	Date myDate = new Date(103,4,18);
    //year=year+1900,month=month-1
    System.out.println("My Date is"+myDate);    
    System.out.println("Today Date is"+today);
    if (today.compareTo(myDate)<18)
        System.out.println("Not Eligible for voting");
    else if (today.compareTo(myDate)>=18)
        System.out.println("Eligible for vote"); 
    else
        System.out.println("Both Dates are equal"); 
}  
}  
