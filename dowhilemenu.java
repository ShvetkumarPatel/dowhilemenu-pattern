import java.util.*;
public class dowhilemenu {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int ch; 

      do
        {
            System.out.println("+-----------------------------------+");
            System.out.println("|       Welcome to Peri Patel's     |");
            System.out.println("|       Printing Pattern App        |");
            System.out.println("+-----------------------------------+");
            System.out.println("Enter number from 1-6 to select one of the designs or -1 to quit");
            System.out.println("");
            System.out.println("1. Pattern1");
            System.out.println("**********");
            System.out.println("**********");
            System.out.println("**********");
            System.out.println("**********");
            System.out.println("**********");
            System.out.println("");
            System.out.println("2. Pattern2");
            System.out.println("*");
            System.out.println("**");
            System.out.println("***");
            System.out.println("****");
            System.out.println("*****");
            System.out.println("");
            System.out.println("3. Pattern3");
            System.out.println("      *");
            System.out.println("     **");
            System.out.println("    ***");
            System.out.println("   ****");
            System.out.println("  *****");
            System.out.println("");
            System.out.println("4. Pattern4");
            System.out.println("   *");
            System.out.println("  ***");
            System.out.println(" *****");
            System.out.println("*******");
            System.out.println("");
            System.out.println("5. Pattern5");
            System.out.println("    1");
            System.out.println("   222");
            System.out.println("  333333");
            System.out.println(" 4444444");
            System.out.println("555555555");
            System.out.println("");
            System.out.println("6. Pattern6");
            System.out.println("     1");
            System.out.println("    212");
            System.out.println("   32123");
            System.out.println("  4321234");
            System.out.println("543212345");
            System.out.println("");
            System.out.println("-1. Exit");

            ch = sc.nextInt();
           
            switch (ch)
            {
                case 1:
                System.out.println("How many rows you want in this pattern (1-10)?");
                 int r = sc.nextInt();
                 System.out.println("Here is your pattern....!!!");
                 for (int i= 0; i<= r-1 ; i++)
                    {
                        for (int j=r-1; j>i; j--)
                         {
                             System.out.printf("*"+" ");
                         }
                         for (int k=0; k<=i; k++)
                        {
                        System.out.print("*" + " ");
                        }
                  System.out.println("");
                }
        
                break;
               

                case 2:
                System.out.println("How many rows you want in this pattern?");

                int rows = sc.nextInt();
        
                System.out.println("Here is your pattern....!!!");
                
                for (int i=0; i< rows;i++ )
                    {
                     for (int j=0; j<=i; j++)
                     {
                        System.out.print("*" + " ");
                     }
                    System.out.println();
                    } 
        
                break;
               

                case 3:
                System.out.println("How many rows you want in this pattern?");

                 int ro = sc.nextInt();

                 System.out.println("Here is your pattern....!!!");
            
                for (int i= 0; i<= ro; i++)
                 {
                     for (int j=1; j<=ro-i; j++)
                        {
                          System.out.print(" ");
                         }
                             for (int k=0;k<=i;k++)
                                 {
                                      System.out.print("*");
                                 } 
                System.out.println("");
                }
                break;


                case 4:
                int n,c,p,s;
                System.out.println("How many rows you want in this pattern?");
                n=sc.nextInt();
                System.out.println("Here is your pattern....!!!");
                 for(p=1;p<=n;p++)
                    {
                        for(s=1;s<=n-p;s++)
                        {
                            System.out.print(" ");
                        }
                        for(c=1;c<=2*p-1;c++)
                        {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }

               

                break;
                case 5:
                System.out.println("How many rows you want in this pattern?");

                int rono = sc.nextInt();
        
                System.out.println("Here is your pattern....!!!");
                
                for (int i = 1; i <= rono; i++)
                    {
                        for (int j = rono; j > i; j--)
                     {
                        System.out.print("" );
                     }
                     for (int k = 1; k <= 2 * i - 1; k++)
                     {
                        System.out.println("", i);
                     }
                    System.out.println();
                    } 
                case 6:
                System.out.println("How many rows you want in this pattern?");

                int ron = sc.nextInt();

                System.out.println("Here is your pattern....!!!");
                for(int i=1;i<=ron;i++)
    {
        for(int j=1;j<=ron-i;j++)
        {
            System.out.print(" ");
        }

        for(int j=i;j>=1;j--)
        {
            System.out.print(j);
        }

        for(int j=2;j<=i;j++)
        {
            System.out.print(j);
        }
            System.out.println();
    }
                break;
                case -1:
					System.out.println("Thank you, program is finished.");
					break;
				
				default:
					System.out.printf("oops!! illegal choice....");
					System.out.println("Please provide valid numbers as per instruction....");
					break;

            }


        } while(ch!=-1);
        sc.close();

    
        
    }
}