import static javax.swing.JOptionPane.*;

public class o3opg2 {
    public static void main(String[] args){
        int tall;

        do{
            String tallLest=showInputDialog("Skriv inn et tall større enn 1");
            tall=Integer.parseInt(tallLest);
        }while(tall<=1);

        System.out.println(erPrimtall(tall));

    }
    static boolean erPrimtall(int tallet){
        for (int i=2;i<tallet;i++){
            if (tallet%i==0){
                return false;
            }
        }return true;
    }
}
