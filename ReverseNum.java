// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ReverseNum {
    public static void main(String[] args) {
        System.out.print("Reversed Number is: ");
        printNumRevRec(1994);
    }

    public static void printNumRevRec(int n){
        if (n < 10){
            System.out.print(n);
        }
        else{
            System.out.print(n%10);
            printNumRevRec(n/10);
        }
    }
}