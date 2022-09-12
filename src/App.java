import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class App {
    public static void main(String []args)throws IOException{
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        int num;
        int result;
        double num2;
        double finale;
        char ab;
        boolean is;
        String snum;
        String snum2;
        String sab;
        System.out.println("Start of the program");
        System.out.println("Enter an integer");
        snum=in.readLine();
        num=Integer.parseInt(snum);
        System.out.println("Enter a double");
        snum2= in.readLine();
        num2=Double.parseDouble(snum2);
        System.out.println("Enter a char");
        sab= in.readLine();
        ab=sab.charAt(0);
        System.out.println("Here is your int + 10");
        result=num+10;
        System.out.println(result);
        System.out.println("Here is your double + 10");
        finale=num2+10;
        System.out.println(finale);
        //comment 1
        /* comment 2 */



    }
}
