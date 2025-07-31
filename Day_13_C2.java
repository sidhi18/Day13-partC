import java.util.Scanner;

public class Day_13_C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // concating string by input user
        System.out.print("Enter string1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter string2 : ");
        String str2 = sc.nextLine();
        System.out.println(str1.concat(str2));
        System.out.println(str1+" "+str2);
        System.out.println(str1+"!!!");
        System.out.println(str1+100);

        // formatting two strings/elements
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter name : ");
        String str3 = sc1.nextLine();
        System.out.print("Enter age : ");
        int a = sc1.nextInt();
        System.out.print("Enter Blood Group : ");
        String ch = sc1.next();
        System.out.println(String.format("Name : %s \n Age : %d \n Blood Group : %s "+"+VE " , str3,a,ch));

        // is blank and isempty method
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str4 = sc2.nextLine();
        System.out.print("Enter string : ");
        String str5 = sc2.nextLine();
        System.out.println(str4.isBlank());
        System.out.println(str4.isEmpty());
        System.out.println(str5.isEmpty());
        System.out.println(str5.isBlank());

        // joining two strings/element and contain method
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter element1: ");
        String str6 = sc3.nextLine();
        System.out.print("Enter element2: ");
        String str7 = sc3.nextLine();
        System.out.print("Enter element3: ");
        String str8 = sc3.nextLine();
        System.out.print("Enter element4: ");
        String str9 = sc3.nextLine();
        System.out.println(String.join("/",str6,str7,str8,str9));
        System.out.println("enter element : ");
        String a1 = sc3.nextLine();
        System.out.println(str6.contains(a1)); // contain method

    }
}
