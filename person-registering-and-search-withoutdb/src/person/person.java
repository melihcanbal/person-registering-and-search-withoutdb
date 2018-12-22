package kisi;
import java.util.Scanner;
/*
https://github.com/melihcanbal      2016    This is one of my first projects ( I really suck at it :)  )   
*/
public class Kisi {
    
        String zat[]={"kimlik", "ad", "soyad", "yas"};
//        String kimlik=zat[0];
//        String ad=zat[1];
//        String soyad=zat[2];
//        String yas=zat[3];
        static int i;
        public Kisi(){   /* Default Constructor(Test amacli) */
            i++;
            System.out.println(i+". Birey Yaratildi");      
        }
        
          public static void yasEkle(int yas){
            String yas1,yas2,yas3;
            yas1=birey1.zat[3];yas2=birey2.zat[3];yas3=birey3.zat[3];
            Integer deger1=Integer.valueOf(yas1);Integer deger2=Integer.valueOf(yas2);Integer deger3=Integer.valueOf(yas3);           
            int toplam1=deger1+yas;int toplam2=deger2+yas;int toplam3=deger3+yas;
            birey1.zat[3]=String.valueOf(toplam1);birey2.zat[3]=String.valueOf(toplam2);birey3.zat[3]=String.valueOf(toplam3);
            /* yaslara ekleme yapabilmek icin yapmis oldugum atamalar ve tur donusumleri */     
            System.out.println("Kimlik No: "+birey1.zat[0]+" - Isim: "+birey1.zat[1]+" , "+birey1.zat[2]+" - Yas: "+birey1.zat[3]);
            System.out.println("Kimlik No: "+birey2.zat[0]+" - Isim: "+birey2.zat[1]+" , "+birey2.zat[2]+" - Yas: "+birey2.zat[3]); 
            System.out.println("Kimlik No: "+birey3.zat[0]+" - Isim: "+birey3.zat[1]+" , "+birey3.zat[2]+" - Yas: "+birey3.zat[3]);
          }
          public static void yasaGoreListele(int a, int b){
              Integer deger1=Integer.valueOf(birey1.zat[3]);Integer deger2=Integer.valueOf(birey2.zat[3]);Integer deger3=Integer.valueOf(birey3.zat[3]);
              
              if (deger1 >=a && deger1<=b ) 
                  System.out.println("Kimlik No: "+birey1.zat[0]+" - Isim: "+birey1.zat[1]+" , "+birey1.zat[2]+" - Yas: "+birey1.zat[3]);
                    if (deger2 >=a && deger2<=b) 
                        System.out.println("Kimlik No: "+birey2.zat[0]+" - Isim: "+birey2.zat[1]+" , "+birey2.zat[2]+" - Yas: "+birey2.zat[3]);
                        if (deger3 >=a && deger3<=b) 
                            System.out.println("Kimlik No: "+birey3.zat[0]+" - Isim: "+birey3.zat[1]+" , "+birey3.zat[2]+" - Yas: "+birey3.zat[3]);
                  
          }
            static Kisi birey1=new Kisi();   /* 3 adet birey tanimi */
            static Kisi birey2=new Kisi(); 
            static Kisi birey3=new Kisi();
            static Scanner oku=new Scanner(System.in);
    public static void main(String[] args) {        
//            Kisi birey4=new Kisi();
//            Kisi birey5=new Kisi();
        while (true) {            
            Kayit();
            if (birey1.zat[0].equals("0") || birey2.zat[0].equals("0") ||birey3.zat[0].equals("0") ) {
                if (birey1.zat[0].equals("0")) 
                System.out.println("1.Bireyin Kimlik Degeri Gecersiz");
                if (birey2.zat[0].equals("0")) 
                System.out.println("2.Bireyin Kimlik Degeri Gecersiz");
                if (birey3.zat[0].equals("0")) 
                System.out.println("3.Bireyin Kimlik Degeri Gecersiz");
                break;
                
            } else {
               System.out.println("Tum bireylere kac yas eklemek istersiniz ? ");
            int cevap=oku.nextInt();
            yasEkle(cevap);
            System.out.println("Bireylerin belli bir yas araliklarinda olanlari goruntulemek icin SIRASIYLA En kucuk ve En buyukk olmak uzere 2 deger giriniz..");
            System.out.println("En kucuk deger :"); int cevap1=oku.nextInt();
            System.out.println("En buyuk deger :");int cevap2=oku.nextInt();           
            yasaGoreListele(cevap1,cevap2);
            break; 
                
            }
            
            
        }
            
    }
    static void Kayit(){
        while (true) {            
            System.out.println("Kimlik No Giriniz");       /*Klavyeden kullanici bilgilerinin okutulmasi */     
            String no=oku.next();
            if (no.equals("0")) {
                System.out.println("Gecersiz Deger Girdiniz");
            }
            System.out.println("AD Giriniz");            
            String ad=oku.next();
            System.out.println("SOYAD Giriniz");            
            String soyad=oku.next();
            System.out.println("YAS Giriniz");
            String yas=oku.next();           
            System.out.println("Kimlik No Giriniz");
            String no1=oku.next();
            if (no1.equals("0")) {
                System.out.println("Gecersiz Deger Girdiniz");
            }
            System.out.println("AD Giriniz");            
            String ad1=oku.next();
            System.out.println("SOYAD Giriniz");            
            String soyad1=oku.next();
            System.out.println("YAS Giriniz");
            String yas1=oku.next();
            System.out.println("Kimlik No Giriniz");            
            String no2=oku.next();
            if (no2.equals("0")) {
                System.out.println("Gecersiz Deger Girdiniz");
            }
            System.out.println("AD Giriniz");            
            String ad2=oku.next();
            System.out.println("SOYAD Giriniz");            
            String soyad2=oku.next();
            System.out.println("YAS Giriniz");
            String yas2=oku.next();           
            birey1.zat[0]=no;        
            birey1.zat[1]=ad; 
            birey1.zat[2]=soyad; 
            birey1.zat[3]=yas;
            birey2.zat[0]=no1;
            birey2.zat[1]=ad1; 
            birey2.zat[2]=soyad1; 
            birey2.zat[3]=yas1;
            birey3.zat[0]=no2;
            birey3.zat[1]=ad2; 
            birey3.zat[2]=soyad2; 
            birey3.zat[3]=yas2;
            System.out.println("Kayit Listesinin Tamami :");           
            System.out.println("Kimlik No: "+birey1.zat[0]+" - Isim: "+birey1.zat[1]+" , "+birey1.zat[2]+" - Yas: "+birey1.zat[3]);
            System.out.println("Kimlik No: "+birey2.zat[0]+" - Isim: "+birey2.zat[1]+" , "+birey2.zat[2]+" - Yas: "+birey2.zat[3]); 
            System.out.println("Kimlik No: "+birey3.zat[0]+" - Isim: "+birey3.zat[1]+" , "+birey3.zat[2]+" - Yas: "+birey3.zat[3]);  
            break;
            
            
        }
            
    }
    
}