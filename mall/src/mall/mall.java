package mall;
import java.io.*;
import java.util.Scanner;
class elec
{
     Scanner in=new Scanner(System.in);
     int elect[][]=new int[3][4];
     String pro[][]=new String[3][4];
     int pro1[][]=new int[3][4];
     String s1[][]=new String[3][4];
     elec()
     {
           for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
               elect[i][j]=0;
            }
        }
          pro[0][0]="Sony 80 cm    [31,990 RS]";pro[0][1]="Sony(43 Inches)[52,900 RS]";pro[0][2]="Sony(60 Inc)[1,47,900RS]";pro[0][3]="Samsung(50 Inches)[55,900 RS] ";
          pro[1][0]="Boat rockers  [1399 RS] ";pro[1][1]="JBL CLOOSI       [699 RS] ";pro[1][2]="MI earphone    [399 RS] ";pro[1][3]="JBL Tune 500BT     [4000 RS] ";
          pro[2][0]="Canon EOS 1500D[27490 RS]";pro[2][1]="Canon EOS 1500D[37490 RS]";pro[2][2]="Sony a7 III   [81000 RS]";pro[2][3]="Sony a7 III[2,00,000 RS] ";
          pro1[0][0]=31990;pro1[0][1]=52900;pro1[0][2]=147900;pro1[0][3]=55900;
          pro1[1][0]=1399;pro1[1][1]=699;pro1[1][2]=399;pro1[1][3]=4000;
          pro1[2][0]=27490;pro1[2][1]=37490;pro1[2][2]=81000;pro1[2][3]=200000;
          s1[0][0]="TV        ";s1[0][1]="TV        ";s1[0][2]="TV        ";s1[0][3]="TV        ";
          s1[1][0]="Headphones";s1[1][1]="Headphones";s1[1][2]="Headphones";s1[1][3]="Headphones";
          s1[2][0]="camera    ";s1[2][1]="Camera    ";s1[2][2]="camera     ";s1[2][3]="camera   ";
     }
    void eltx()
    {
        int ch,ch1,ch2;
        String a;
       
        do{
            System.out.println("1.TV\n2.Headphones\n3.camera\n4.GO BACK");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                {
                     do
                       {
                                System.out.println("1.Sony Bravia 80 cm (32 Inches)[31,990 RS]\n2.Sony Bravia(43 Inches)[52,900 RS]"
                                 + "\n3.Sony Bravia(60 Inches) 4K UHD LED Smart Android TV KD-55X9000F (Black) (2018 model)[1,47,900 RS]\n4.Samsung 125 cm (50 Inches)[55,900 RS]"
                                  + "\n5. GOTO BACK");
                                  ch1=in.nextInt();
                                  switch(ch1)
                                    {
                                        case 1:    
                                            
                                                   elect[0][0]++;
                                                   break; 
                
                                        case 2:  
                                                   elect[0][1]++;
                                                 
                                                     break;
                                        case 3:  elect[0][2]++;
                                            
                                               
                                                      break;
                                        case 4:  elect[0][3]++;
                                                   
                                                      break;
                                       
                                        case 5:  break; 
                                    }
                        }while(ch1!=5);
                     break;
                }
                case 2:
                {
                    do
                    {
                                System.out.println("1.Boat rockers 400 on-ear[1399 RS]\n2.JBL CLOOSI[699 RS]\n3.MI earphone[399 RS]"
                                + "\n4.JBL Tune 500BT Powerful Bass Wireless On-Ear Headphones with Mic (Black)[4000 RS]\n5.GOTO BACK");
                               ch=in.nextInt();
                                switch(ch)
                                  {
                                      case 1:elect[1][0]++;
                                      break;
                                             
                                      case 2:elect[1][1]++; 
                                           break;
                                      case 3: elect[1][2]++;
                                            break;
                                       case 4: elect[1][3]++;
                                      break;
                                       case 5: break;
            }
            }while(ch!=5);
                    break;
                }
                case 3:
                {
                     do
                  {
                     System.out.println("1.Canon EOS 1500D Digital SLR Camera (Black) with EF S18-55 is II Lens/Camera Case[27490 RS]"
                    + "\n2.Canon EOS 1500D 24.1MP Digital SLR Camera (Black) with 18-55 and 55-250mm is II Lens, 16GB Card and Carry Case[37490 RS]"
                    + "\n3.Sony Alpha ILCE-6400L 24.2MP Mirrorless Digital SLR Camera (Black) with 16-50mm Power Zoom Lens[81000 RS]" +
                       "\n4.Sony a7 III Full-Frame Mirrorless Interchangeable-Lens Camera (with 28-70mm F3.5-5.6 OSS Lens)[2,00,000 RS]\n" +
                                 "\n5.GOTO BACK");
            ch=in.nextInt();
            switch(ch)
            {
                case 1: elect[2][0]++;break;
                        
                case 2:  elect[2][1]++;break;
                      
                case 3:  elect[2][2]++;break;
                        
                case 4:  elect[2][3]++;break;
                  
                case 5: break;
            }
               }while(ch!=5);
                     break;
                }
                case 4:break;
            }
            
        }while(ch!=4);
    }
    
}
class clothing extends elec
{
    //Scanner in=new Scanner(System.in); 
      int clo[][]=new int[3][4];
     String pro2[][]=new String[3][4];
     int pro3[][]=new int[3][4];
     String s2[][]=new String[3][4];
      clothing()
     {
           for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
               clo[i][j]=0;
            }
        }
            pro2[0][0]="T   shirts   ft[RS 849]    ";pro2[0][1]="casual  shirts [RS 1500]";pro2[0][2]="slim fit jeans[RS 2000] ";pro2[0][3]="cotton   shorts   [RS 800]    ";
          pro2[1][0]="saree[RS 5000]           ";pro2[1][1]="kurta[RS 1000]          ";pro2[1][2]="Tops[RS 800]            ";pro2[1][3]="slim fit jeans[RS 900]         ";
          pro2[2][0]="T   shirts   ft[RS 849]  ";pro2[2][1]="shirts [RS 1500]        ";pro2[2][2]=" slim fit jeans[RS 2000]";pro2[2][3]="cotton   shorts   [RS 800]     ";
          pro3[0][0]=849;pro3[0][1]=1500;pro3[0][2]=2000;pro3[0][3]=800;
          pro3[1][0]=5000;pro3[1][1]=1000;pro3[1][2]=800;pro3[1][3]=900;
          pro3[2][0]=849;pro3[2][1]=1500;pro3[2][2]=2000;pro3[2][3]=800;
         s2[0][0]="Men clothing  ";s2[0][1]="Men clothing ";s2[0][2]="Men clothing  ";s2[0][3]="Men clothing   ";
         s2[1][0]="Women clothing";s2[1][1]="Women clothing";s2[1][2]="Women clothing";s2[1][3]="Women clothing";
         s2[2][0]="Kids clothing ";s2[2][1]="Kids clothing  ";s2[2][2]="Kids clothing ";s2[2][3]="Kids clothing  ";
     }
      
     
    int ch,ch1;
    void clo()
    {
        do
        {
            System.out.println("1.FOR MEN\n2.FOR WOMEN\n3.FOR KIDS\n4.GO BACK");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                {
                    do{
                        System.out.println("1.T shirts[RS 849]\n2.casual shirts[RS 1500]\n3.slim fit jeans[RS 2000]\n4.cotton shorts[ RS 800]\n5.GO BACK");
                        ch1=in.nextInt();
                        switch(ch1)
                        {
                            case 1:
                                clo[0][0]++;
                                break;
                            case 2:
                                clo[0][1]++;
                                break;
                            case 3:
                                clo[0][2]++;
                                break;
                            case 4:
                                clo[0][3]++;
                                break;
                            case 5:break;
                        }
                        
                     }while(ch1!=5);
                    break;
                }
                case 2:
                {
                    do{
                        System.out.println("1.saree[RS 5000]\n2.kurta[RS 1000]\n3.Tops[RS 800]\n4.slim fit jeans[RS 900]\n5.GO BACK");
                        ch1=in.nextInt();
                        switch(ch1)
                        {
                            case 1:
                                clo[1][0]++;
                                break;
                            case 2:
                                clo[1][1]++;
                                break;
                            case 3:
                                clo[1][2]++;
                                break;
                            case 4:
                                clo[1][3]++;
                                break;
                            case 5:break;
                        }
                        
                     }while(ch1!=5);
                    break;
                }
                case 3:
                { do{
                        System.out.println("1.T shirts[RS 849]\n2.shirts[RS 1500]\n3.slim fit jeans[RS 2000]\n4.cotton shorts[ RS 800]\n5.GO BACK");
                        ch1=in.nextInt();
                        switch(ch1)
                        {
                            case 1:
                                clo[2][0]++;
                                    break;
                            case 2:
                                clo[2][1]++;
                                break;
                            case 3:
                                clo[2][2]++;
                                break;
                            case 4:
                                clo[2][3]++;
                                break;
                            case 5:break;
                        }
                        
                     }while(ch1!=5); 
                    break;
                }
                case 4:break;
            }
        }while(ch!=4);
    }
    
}
class grocery extends clothing
{
 Scanner in=new Scanner(System.in); 
 int ch,ch1;
      int gro[][]=new int[3][4];
     String pro4[][]=new String[3][4];
     int pro5[][]=new int[3][4];
     String s3[][]=new String[3][4];
      grocery()
     {
           for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
               gro[i][j]=0;
            }
        }
          pro4[0][0]="oil[200 RS]                ";pro4[0][1]="Ghees[300RS]              ";pro4[0][2]="Rice[70RS]                 ";pro4[0][3]="Pulses[250RS]              ";
          pro4[1][0]="biscuits[50 RS]             ";pro4[1][1]="nuts[150 RS]             ";pro4[1][2]="seeds[55 RS]               ";pro4[1][3]="dried fruits[350 RS]        ";
          pro4[2][0]="Coffee[70 Rs]               ";pro4[2][1]="teabags[50 RS]           ";pro4[2][2]="born vita[80 RS]            ";pro4[2][3]="milk powder[40 RS]       ";
          pro5[0][0]=200;pro5[0][1]=300;pro5[0][2]=70;pro5[0][3]=250;
          pro5[1][0]=50;pro5[1][1]=150;pro5[1][2]=55;pro5[1][3]=350;
          pro5[2][0]=70;pro5[2][1]=50;pro5[2][2]=80;pro5[2][3]=40;
          s3[0][0]="cooking      ";s3[0][1]="cooking       ";s3[0][2]="cooking       ";s3[0][3]="cooking        ";
         s3[1][0]="Snacks        ";s3[1][1]="Snacks        ";s3[1][2]="Snacks        ";s3[1][3]="Snacks         ";
         s3[2][0]="Beverages     ";s3[2][1]="Beverages     ";s3[2][2]="Beverages     ";s3[2][3]="Beverages      ";
     }
  void gro()
  {
      do{
          System.out.println("1.cooking\n2.snacks\n3.Beverages\n4.GOTO BACK");
          ch=in.nextInt();
        
         switch(ch)
          {
             case 1:
             {
                 do{
                     System.out.println("1.oil[200 RS]\n2.Ghees[300RS]\n3.Rice[70RS]\n4.Pulses[RS 250]\n5.GOTO back");
                     ch1=in.nextInt();
                     switch(ch1)
                     {
                         case 1: gro[0][0]++;
                                 break;
                         case 2: gro[0][1]++;
                                 break; 
                         case 3: gro[0][2]++;
                                 break;
                         case 4: gro[0][3]++;
                                 break; 
                         case 5:break;
                     }
                 }
                 while(ch1!=5);
                break;
             }
             case 2:
             {  
                 do{
                     System.out.println("1.biscuits[50 RS]\n2.nuts[150 RS]\n3.seeds[55 RS]\n4.dried fruits[350 RS]\n5.GOTO back");
                     ch1=in.nextInt();
                     switch(ch1)
                     {
                         case 1: gro[1][0]++;
                                 break;
                         case 2: gro[1][1]++;
                                 break; 
                         case 3: gro[1][2]++;
                                 break;
                         case 4: gro[1][3]++;
                                 break; 
                         case 5:break;
                     }
                 }
                 while(ch1!=5);
               break;  
             }
            
             case 3:
             {
                    do{
                     System.out.println("1.Coffee[70 Rs]\n2.teabags[50 RS]\n3.born vita[80 RS]\n4.milk powder[40 RS]\n5.GOTO back");
                     ch1=in.nextInt();
                     switch(ch1)
                     {
                         case 1: gro[2][0]++;
                                 break;
                         case 2: gro[2][1]++;
                                 break; 
                         case 3: gro[2][2]++;
                                 break;
                         case 4: gro[2][3]++;
                                 break; 
                         case 5:break;
                     }
                 }
                 while(ch1!=5);
               break; 
                 
             }
             case 4:break;
             
          }
      }while(ch!=4);
  }
}

class disp extends grocery
{
     int t1[][]=new int[3][4];
       int t2[][]=new int[3][4];
       int t3[][]=new int [3][4];
        int t4[][]=new int [3][4];
   
    void d1()
    {
        
        
         for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
               t1[i][j]=elect[i][j]*pro1[i][j];
            }
        }
       
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                if((elect[i][j])!=0)
                {
                    System.out.println(s1[i][j]+"\t\t"+pro[i][j]+"\t\t\t*"+elect[i][j]+"\t\t"+t1[i][j]);
                }
            }
        }
    }
        
         void d2()
         {
       
         for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
               t2[i][j]=clo[i][j]*pro3[i][j];
            }
        }
       
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                if((clo[i][j])!=0)
                {
                    System.out.println(s2[i][j]+"\t\t"+pro2[i][j]+"\t\t\t*"+clo[i][j]+"\t\t"+t2[i][j]);
                }
            }
        }
    }
          void d3()
         {
       
         for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
               t3[i][j]=gro[i][j]*pro5[i][j];
            }
        }
       
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                if((gro[i][j])!=0)
                {
                    System.out.println(s3[i][j]+"\t\t"+pro4[i][j]+"\t\t\t*"+gro[i][j]+"\t\t"+t3[i][j]);
                }
            }
        }
         }
          void d4()
          {
              int result=0;
         for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
               result=result+t1[i][j]+t2[i][j]+t3[i][j];
            }
        }
         System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
         System.out.println("\t\t\t\t\t\t\t\t\t   GRAND TOTAL= "+ result+" RS ONLY");
          System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
          System.out.println("**************************************************THANK YOU****************************************************************");
    }
        
    }


public class mall {

   
    public static void main(String[] args) {
        System.out.println("                                      WELCOME TO INFINITY MALL                                                                              ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        Scanner in=new Scanner(System.in);
        disp obj=new disp();
        int ch;
        do{
            System.out.println("category\n1.Electronics\n2.Clothing"
                               + "\n3.Grocery\n4.EXIT MALL Show me bill");
            ch=in.nextInt();
            switch(ch)
            {
                case 1: obj.eltx();break;
                case 2: obj.clo();break;
                case 3: obj.gro();break;
                case 4:
                    break;
            }
            
            
        }while(ch!=4);
         System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
         System.out.println("                                                 INFINITY MALL                                                                           ");
         System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
         System.out.println("PRODUCT TYPE\t\tPRODUCT\t\t\t\t\t\tCOUNT\t\tTOTAL(RS)");
         System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        obj.d1();
        obj.d2();
        obj.d3();
        obj.d4();
      }
    
    
}
/*output
                                       WELCOME TO INFINITY MALL                                                                              
-----------------------------------------------------------------------------------------------------------------------------------------
category
1.Electronics
2.Clothing
3.Grocery
4.EXIT MALL Show me bill
1
1.TV
2.Headphones
3.camera
4.GO BACK
1
1.Sony Bravia 80 cm (32 Inches)[31,990 RS]
2.Sony Bravia(43 Inches)[52,900 RS]
3.Sony Bravia(60 Inches) 4K UHD LED Smart Android TV KD-55X9000F (Black) (2018 model)[1,47,900 RS]
4.Samsung 125 cm (50 Inches)[55,900 RS]
5. GOTO BACK
1
1.Sony Bravia 80 cm (32 Inches)[31,990 RS]
2.Sony Bravia(43 Inches)[52,900 RS]
3.Sony Bravia(60 Inches) 4K UHD LED Smart Android TV KD-55X9000F (Black) (2018 model)[1,47,900 RS]
4.Samsung 125 cm (50 Inches)[55,900 RS]
5. GOTO BACK
5
1.TV
2.Headphones
3.camera
4.GO BACK
3
1.Canon EOS 1500D Digital SLR Camera (Black) with EF S18-55 is II Lens/Camera Case[27490 RS]
2.Canon EOS 1500D 24.1MP Digital SLR Camera (Black) with 18-55 and 55-250mm is II Lens, 16GB Card and Carry Case[37490 RS]
3.Sony Alpha ILCE-6400L 24.2MP Mirrorless Digital SLR Camera (Black) with 16-50mm Power Zoom Lens[81000 RS]
4.Sony a7 III Full-Frame Mirrorless Interchangeable-Lens Camera (with 28-70mm F3.5-5.6 OSS Lens)[2,00,000 RS]

5.GOTO BACK
4
1.Canon EOS 1500D Digital SLR Camera (Black) with EF S18-55 is II Lens/Camera Case[27490 RS]
2.Canon EOS 1500D 24.1MP Digital SLR Camera (Black) with 18-55 and 55-250mm is II Lens, 16GB Card and Carry Case[37490 RS]
3.Sony Alpha ILCE-6400L 24.2MP Mirrorless Digital SLR Camera (Black) with 16-50mm Power Zoom Lens[81000 RS]
4.Sony a7 III Full-Frame Mirrorless Interchangeable-Lens Camera (with 28-70mm F3.5-5.6 OSS Lens)[2,00,000 RS]

5.GOTO BACK
5
1.TV
2.Headphones
3.camera
4.GO BACK
4
category
1.Electronics
2.Clothing
3.Grocery
4.EXIT MALL Show me bill
3
1.cooking
2.snacks
3.Beverages
4.GOTO BACK
2
1.biscuits[50 RS]
2.nuts[150 RS]
3.seeds[55 RS]
4.dried fruits[350 RS]
5.GOTO back
1
1.biscuits[50 RS]
2.nuts[150 RS]
3.seeds[55 RS]
4.dried fruits[350 RS]
5.GOTO back
1
1.biscuits[50 RS]
2.nuts[150 RS]
3.seeds[55 RS]
4.dried fruits[350 RS]
5.GOTO back
2
1.biscuits[50 RS]
2.nuts[150 RS]
3.seeds[55 RS]
4.dried fruits[350 RS]
5.GOTO back
3
1.biscuits[50 RS]
2.nuts[150 RS]
3.seeds[55 RS]
4.dried fruits[350 RS]
5.GOTO back
5
1.cooking
2.snacks
3.Beverages
4.GOTO BACK
1
1.oil[200 RS]
2.Ghees[300RS]
3.Rice[70RS]
4.Pulses[RS 250]
5.GOTO back
1
1.oil[200 RS]
2.Ghees[300RS]
3.Rice[70RS]
4.Pulses[RS 250]
5.GOTO back
5
1.cooking
2.snacks
3.Beverages
4.GOTO BACK
4
category
1.Electronics
2.Clothing
3.Grocery
4.EXIT MALL Show me bill
4
-----------------------------------------------------------------------------------------------------------------------------------------
                                                 INFINITY MALL                                                                           
-----------------------------------------------------------------------------------------------------------------------------------------
PRODUCT TYPE		PRODUCT						COUNT		TOTAL(RS)
-----------------------------------------------------------------------------------------------------------------------------------------
TV        		Sony 80 cm    [31,990 RS]			*1		31990
camera   		Sony a7 III[2,00,000 RS] 			*1		200000
cooking      		oil[200 RS]                			*1		200
Snacks        		biscuits[50 RS]             			*2		100
Snacks        		nuts[150 RS]             			*1		150
Snacks        		seeds[55 RS]               			*1		55
-----------------------------------------------------------------------------------------------------------------------------------------
									   GRAND TOTAL= 232495 RS ONLY
-----------------------------------------------------------------------------------------------------------------------------------------
**************************************************THANK YOU****************************************************************
 */
