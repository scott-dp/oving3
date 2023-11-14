import java.util.Scanner;

public class opg1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        System.out.println("Skriv inn start verdi");
        int start=in.nextInt();

        System.out.println("Skriv inn slutt verdi");
        int slutt=in.nextInt();

        in.close();

        for (int i=start;i<=slutt;i++){
            System.out.println(i+"-gangen:");
            for (int j=1;j<=10;j++){
                System.out.println(i+"x"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
