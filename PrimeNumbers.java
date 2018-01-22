
import java.util.Scanner;
import java.lang.Long;
public class PrimeNumbers {

    public static void main(String[] args) {

    Scanner Obj= new Scanner(System.in);
    System.out.println("Prime Number Program");
    System.out.println("Enter Number:");
     Long a = Obj.nextLong();

     int prime=0;

     for(Long i=2L; i<a;i++)
     {
         if(a%i==0)
         {
             prime++;
         }
     }
if(prime==0)
{
    System.out.println("Number is Prime");
}
else
    {
        System.out.println("Number is not Prime");
}

    }


}
