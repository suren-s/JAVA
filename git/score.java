import java.util.Scanner;
class score{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if (mark>89){
            System.out.print("mac book pro");
        }else if (mark>59 && mark<90){
            System.out.print("iphone");
        }else if (mark>34 && mark<60){
            System.out.print("video game");
        }
        
     }
}