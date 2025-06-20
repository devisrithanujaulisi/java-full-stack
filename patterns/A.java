/*1.
import java.util.Scanner;
class A  
{
public static void main(String[] args)

{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();

for(int i=0;i<6;i++)
{
for(int j=0;j<6;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}*/


/*2.numbersquare pattern
class A  
{
public static void main(String[] args)
{
for(int i=1;i<=6;i++)
{
for(int j=1;j<=6;j++)
{
System.out.print(i + " ");
}
System.out.println();
}
}
}*/

/*3.numbers
 
class A  
{
public static void main(String[] args)
{
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(j +" ");
}
System.out.println();
}
}
}*/

/* 4.whole numbers
class A  
{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print( num +" ");
num++;
}
System.out.println();
}
}
}*/

/*5. pattern
class A  
{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print( num +" ");
num++;
if(num>9)
{
num=1;
}
}
System.out.println();
}
}
}*/

/*6. pattern
class A  
{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print( num +" ");
num+=2;
}
System.out.println();
}
}
}*/

/*7.10101
      10101
      10101
      10101
      10101

public class A
 {
    public static void main(String[] args)
 {
        String pattern = "10101"; 
        System.out.println(pattern);
        for (int i = 0; i < 5; i++)
 {
            System.out.println("      " + pattern);
        }
    }
}
*/
  
/*8. stars pattern
import java.util.Scanner;
public class A
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();

for(int i=0;i<=n;i++)
{
for(int j=n-i;j>1;j--)
{

System.out.print(" ");
}
{
for(int j=0;j<=i;j++)

System.out.print("* ");
}
System.out.println();
}
}
}*/

/*9.
import java.util.Scanner;
public class A
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
for(int j=n-i;j>1;j--)
{

System.out.print(" ");
}
{
for(int j=1;j<=i;j++)

System.out.print(2*j+" ");
}
System.out.println();
}
}
}*/
/*10
import java.util.Scanner;
public class A {
    public static void main(String[] args)
 {
Scanner sc=new Scanner(System.in);
System.out.println("enter the word  :");
        String word = sc.nextline();
        
        for (int i = 1; i <= word.length(); i++) {
            
            if (i == word.length()) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(word.charAt(j) + " ");
            }

            System.out.println();
        }
    }
}
*/
/*11
import java.util.Scanner;
public class A{
    public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) 
{  
            for (int j = i; j < rows; j++)
 {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++)
 {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/
/*12.public class A 
import java.util.Scanner;
public class A
{
    public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
        int n = sc.nextInt();
{
        
        for (int i = 0; i <= n; i++)
 {
            for (int j = n - i; j > 0; j--)
 {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++)
 {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--)
 {
            for (int j = n - i; j > 0; j--) 
{
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}   *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/

/*13.
import java.util.Scanner;
 
public class A 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("enter n:");
int a= sc.nextInt();
System.out.println(""); 
for (int i = 1; i <=a; i++)
{
for (int j = 1; j <=a-i; j++)
{s
System.out.print(" ");
}
for (int j = 1; j <= i; j++)
{
if (j == 1 || j == i)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println();
}      
for(int i=a-1;i>=1;i--)
{
for(int j=1;j<=a-i;j++)
{
System.out.print(" ");
}
for (int j=1;j<=i;j++)
{
if (j==1||j==i)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println();
}
}
}

    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
*/
/*14.
public class A{
    public static void main(String[] args)
 {
 int rows = 5;
  int columns = 9; 

    for (int i = 0; i < rows; i++) 
{
            for (int j = 0; j < columns; j++) 
{
    if (i == 0 || i == rows - 1)
 {
                    if (i == rows - 1 && j == 0)
 {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                
                else {
                    if (j == 0 || j == columns - 1)
 {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            
            System.out.println();
        }
    }
}*********
*                *
*                *
*                *
 *********
*/ 
/*15.
public class A{
    public static void main(String[] args) {
        int rows = 7;
        int columns = 13; 
        for (int i = 0; i < rows; i++) 
{
            for (int j = 0; j < columns; j++) 
{
                if (i == 2 && j >= 2 && j <= 10)
 {
                    System.out.print("*");
                }
else if ((i < 2 || i > 2) && j == 6) 
{
                    System.out.print("*");
                }
                
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}     *      
      *      
*********** 
      *      
      *      
      *      
      * */     
/*16.
class B {
    public static void main(String[] args) {
int size = 7;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i || j == size - i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}*/
/*17.import java.util.Scanner;

public class PatternHollowSquare {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the size (odd number like 7): ");
 int n = sc.nextInt();  // For your pattern, n = 7
  for (int i = 0; i < n; i++) {
   for (int j = 0; j < n; j++) {
  if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == n / 2 || j == n / 2)
   System.out.print("* ");
   else
 System.out.print("  ");  // Print spaces inside
   }
   System.out.println();
        }
    }
}
*/
/*18.
import java.util.Scanner; 
public class A 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n:"); 
int a=sc.nextInt();  
System.out.println(" ");  
for(int i=a;i>=1;i--)
{   
for(int j=1;j<=i;j++)
{
if(j== 1||j==i||i==a)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
} 
System.out.println();
}  
}
}*
/*19.
import java.util.Scanner;
public class A
 {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter n:");
int n=sc.nextInt();
for(int i=0;i<=n; i++)
 {
for(int j=0;j<(n-i);j++) 
{
System.out.print(" ");
}
for (int k=0;k<i;k++)
 {
System.out.print("*");
}
System.out.println(i);
}
}
}*/

/*20.
public class PatternF {
    public static void main(String[] args) {
        int n = 7; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    System.out.print("* ");
                }
                else if (j == 0) {
                    System.out.print("* ");
                }
                else if (i == 1 && j < n - 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }*/








