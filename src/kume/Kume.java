package kume;

public class Kume {

public static void main(String[] args) {
        int[] k= new int[3];
        k[0]=1;
        k[1]=2;
        k[2]=3;
        int[] k1=new int[3];
        k1[0]=1;
        k1[1]=2;
        k1[2]=34;
        kumeler a=new kumeler(k);
        kumeler b=new kumeler(k1);
        a.ekle(11);
        a.yazdir();
        b.ekle(11);
        a.esit(b);
        if(a.esit(b)==true) System.out.println("esit");
        else System.out.println("esit degil");
        if(a.denk(b)==true) System.out.println("denk");
        
        kumeler c=new kumeler(a.birlesim(b));
        c.yazdir();
        

    }
}
