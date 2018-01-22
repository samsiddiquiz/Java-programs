import java.util.Scanner;

public class StringArray {

    public static void main(String[] args) {


        Scanner Obj = new Scanner(System.in);
        String sub[] = new String[3];
        System.out.println("Store Array Values in String Format: ");
        for (int i = 0; i < sub.length; i++) {
            System.out.println("String Array"+" " +"["+i+"]: ");
            sub[i] = Obj.next();
        }
        for (int i = 0; i < sub.length; i++) {
            System.out.println("Values Of String Array"+" " +"["+i+" "+" \n"+sub[i]);
        }
    }
}
