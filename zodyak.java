package first;

import java.util.Scanner;

public class Zodyak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz:");
        int yil = input.nextInt();
        int kalan=0;
        kalan = yil % 12;
        if(kalan==0){
            System.out.println("Maymun");
        }else if(kalan==1){
            System.out.println("Horoz");
        }else if(kalan==2){
            System.out.println("Köpek");
        }else if(kalan==3){
            System.out.println("Domuz");
        }else if(kalan==4){
            System.out.println("Fare");
        }else if(kalan==5){
            System.out.println("Öküz");
        }else if(kalan==6){
            System.out.println("Kaplan");
        }else if(kalan==7){
            System.out.println("Tavşan");
        }else if(kalan==8){
            System.out.println("Ejderha");
        }else if(kalan==9){
            System.out.println("Yılan");
        }else if(kalan==10){
            System.out.println("At");
        }else if(kalan==11){
            System.out.println("Koyun");
        }
    }
}
