import java.util.Scanner;
public class havadurumu {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = inp.nextInt();

        if (heat < 5){
            System.out.print("Kayak Yapabilirsiniz");
        }else if (heat <= 15 && heat >= 5) {
            System.out.print("Sinemaya gidebilirsiniz.");

        }else if (heat >= 15 && heat <=25){
            System.out.println("Pikniğe gidebilirsiniz");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }

    }
}



