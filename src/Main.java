import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number=input.nextInt();

        for (int i=1;i<=number;i++){

            for(int k=1; k<=number-i;k++){
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");

            if(i==number){
                for (int m=1; m<i;i--){
                    i--;
                    for (int n=1; n<=number-i;n++){
                        System.out.print(" ");
                    }
                    for (int e=1; e<=(2*i)-1; e++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                    i++;
                }
                break;

            }
        }

    }
}
