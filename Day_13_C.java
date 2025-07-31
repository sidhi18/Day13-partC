import jdk.jfr.StackTrace;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.transform.Source;
import java.util.SortedMap;

public class Day_13_C {
    public static void main(String[] args) {
        // Concating two strings
        String a = " Delhi";
        String b = "capital ";
        System.out.println(a + " is "+b +" of India "); // using '+' operator
        System.out.println(a.concat(" is ").concat(b).concat("of India"));  // concating operator
        System.out.println("10".concat("600"));
        System.out.println(a+18);

        // value of operator
        int c = 45;
        byte d = 84;
        short e = 119;
        long f = 7884938;
        char g = 'S';
        float h = 874.0812f;
        double i = 770977.2424;
        boolean j = 45==67;
        String k = String.valueOf(c);
        String l = String.valueOf(d);
        System.out.println(k+l);
        System.out.println(String.valueOf("hello"+f));
        String m = String.valueOf(j);
        System.out.println(m);
        System.out.println(m+70/35);
        String n = String.valueOf(h);
        String o = String.valueOf(i);
        System.out.println(n+o);
        System.out.println(n+" @ " +o);

        //join method
        System.out.println(String.join("/","Sparrow ","Peacock ","Pigeon"));
        System.out.println("Todays date is : "+String.join("-","2025","07","31"));

        //format method
        System.out.println("Your personal details are as follows :  ");
        System.out.println(String.format(" Name : %s \n Age : %d \n Blood group : %c"+"+VE","Sidhijadhav",18,'A'));
        System.out.println("Your favourite's are as follows : ");
        System.out.println(String.format("Fav color : %s\n Fav food : %s \n Fav sports : %s ","Blue","Pizza","Cricket"));

        // isblank and isempty method
        String p = " ";
        String q = "";
        String r = "sidhi";
        System.out.println(p.isBlank()); // checking blank method for p
        System.out.println(q.isBlank()); // checking blank method for q
        System.out.println(p.isEmpty()); // checking empty method for p
        System.out.println(q.isEmpty()); // checking empty method for q
        System.out.println(r.isEmpty()); // checking empty method for r
        System.out.println(r.isBlank()); // checking blank method for r

        // contains method
        String s = "Monsoon is my favourite season";
        System.out.println(s.contains("Monsoon"));  // checks if the char or charsequence is present or not
        System.out.println(s.contains("s"));
        System.out.println(s.contains("ouri"));

        //replacefirst method
        String t = "Tony Stark is my fav. superhero;\n He is famous for his role of spiderman";
        System.out.println(t.replaceFirst("is","was"));  // replaces only first appearing  character
        System.out.println(t.replace("is","was"));       // replaces the target character everywhere in String

        // intern method
        String u = "Umbrella";
        String v = "Umbrella";
        String w = new String("Umbrella");
        System.out.println(u==v);  // == opeartor checks the referance address
        System.out.println(u==w);
        System.out.println(u.equals(v));  // equals to check the content
        System.out.println(u.equals(w));
        String x = w.intern();  // intern method points the same memory
        System.out.println(u==x);





    }
}
