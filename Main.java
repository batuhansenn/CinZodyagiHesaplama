import javax.net.ssl.SSLContextSpi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        int dTarihi,sonuc;
        String burc="";
        boolean isError=false;
        Scanner input=new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz :  ");
        dTarihi=input.nextInt();
        if(dTarihi>1900 && dTarihi<=2023) {
            sonuc = dTarihi % 12;

            switch (sonuc) {

                case 0:
                    burc = "Maymun";
                    break;
                case 1:
                    burc = "Horoz";
                    break;
                case 2:
                    burc = "Köpek";
                    break;
                case 3:
                    burc = "Domuz";
                    break;
                case 4:
                    burc = "Fare";
                    break;
                case 5:
                    burc = "Öküz";
                    break;
                case 6:
                    burc = "Kaplan";
                    break;
                case 7:
                    burc = "Tavşan";
                    break;
                case 8:
                    burc = "Ejderha";
                    break;
                case 9:
                    burc = "Yılan";
                    break;
                case 10:
                    burc = "At";
                    break;
                case 11:
                    burc = "Koyun";
                    break;
                default:
                    isError = true;
            }
        }else{
            isError=true;
        }
        if(isError){
            System.out.println("girilen deger gecersizdir");
        }else {
            System.out.println("Çin Zodyağı Burcunuz :" + burc);
        }
    }

}