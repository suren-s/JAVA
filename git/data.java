import java.util.Scanner;
class data{
    public static void main(String args[])
    {
        Scanner datas = new Scanner(System.in);
        String name = datas.nextLine();
        int age = datas.nextInt();
        datas.nextLine(); // when a string need after a int we need to use this line to take the remaing gap from that int and we can take next string
        String add = datas.nextLine();
        System.out.println("my name is "+name);// ln for next line
        System.out.println("my age is "+age);
        System.out.print("my add is "+add);
    }
}


