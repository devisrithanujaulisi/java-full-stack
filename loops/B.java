/*LOOPS*/
/*1.BRIGTH IT CAREER
class B 
{
public static void main(String[] args)
{
for(int i=1;i<10;i++)
{
System.out.println("BRIGTH IT CAREER");
}
}
}*/


/*2.while loop
class B
{
public static void main(String[] args)
{
int i=1;
while(i<=20)
{
System.out.println(i);
i++;
}
}
}*/


/*3.equal and not equal
class B
{
public static void main(String[] args)
{
int a=10;
int b=20;
if(a==b)
{
System.out.println("equal");
}
else
{
System.out.println("not equal");
}
if(a!=b)
{
System.out.println("equal");
}
else
{
System.out.println("not equal");
}
}
}
*/
/*4.odd and even
import java.util.Scanner;
class B
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter number:");
for(int i=1;i<50;i++)
{
if(i%2==0)
{
System.out.println("even numbers:" +i);
}
}
for(int i=1;i<50;i++)
{
if(i%2!=0)
{
System.out.println("odd number:" +i);
}
}
}
}
*/

/*5.largest number
import java.util.Scanner;
class B
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the first number");
int a=sc.nextInt();
System.out.println("enter the second number");
int b=sc.nextInt();
System.out.println("enter the third number");
int c=sc.nextInt();
if(a>=b&&a<=c)
{
System.out.println("a is largest numberb" +a);
}
else if(b>=a&&b<=c)
{
System.out.println("b is largest number a" +b);
}
 else 
{
System.out.println("c is largest number b" +c);
}
}
}*/
/*6. even nuber using while
class B
{
public static void main(String[] args)
{
int i=10;
{
while(i<=100)
{
if(i%2==0){
System.out.println("the even numbers:"+i);}
i++;
}
}
}
}*/
/*7.do while
class B
{
public static void main(String[] args)
{
int i=1;
do{
System.out.println(" 1 to 10:" +i);
i++;
}while(i<=10);

 }
}*/
/*8 armstrong number
import java.util.Scanner;
class B
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int m=sc.nextInt();
int sum=0;
int n=m;
while (m>0)
{
int rem=0;
rem=rem+m%10;
sum=sum+(rem*rem*rem);
m=m/10;
}
if(n==sum)
{
System.out.println("the number is armstrong number:");
}
else
{
System.out.println("the number is not a armstrong number:");
}
}
}*/

/*9.prime numbers
import java.util.Scanner;

public class B{
 public static void main(String[] args)
 {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();
boolean isPrime = true;
if (num <= 1) 
{
isPrime = false;
        }
 else 
{
 for (int i = 2; i <= num / 2; i++) 
{
 if (num % i == 0) 
{
isPrime = false;
break;
  }
  }
  }
if (isPrime) 
{
 System.out.println(num + " is a prime number.");
        } 
else 
{
 System.out.println(num + " is not a prime number.");
        }
    }
}*/

/*10.palindrom number
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.print("Enter a number: ");
  int num = sc.nextInt();
 int original = num;
int reverse = 0;

 while (num != 0)
 {
  int digit = num % 10;          
  reverse = reverse * 10 + digit; 
  num = num / 10;                
        }
 if (original == reverse) 
{
            System.out.println(original + " is a palindrome.");
        } else
 {
            System.out.println(original + " is not a palindrome.");
        }
    }
}*/

/*11.even and odd switch
import java.util.Scanner;
public class B
 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a number: ");
  int number = scanner.nextInt();
   int remainder = number % 2;
  switch (remainder)
 {
  case 0:
  System.out.println(number + " is EVEN.");
    break;
   case 1: 
   System.out.println(number + " is ODD.");
    break;
   default:
             System.out.println("Invalid input.");
    }
 scanner.close();
    }
}*/
/*12 switch case
import java.util.Scanner;

public class B
{
    public static void main(String[] args)
 {
    Scanner scanner = new Scanner(System.in);
     System.out.print("Enter gender (M/F): ");
     char gender = scanner.next().toUpperCase().charAt(0); 
  switch (gender)
 {
      case 'M':
         System.out.println("Gender: Male");
          break;
      case 'F':
         System.out.println("Gender: Female");
           break;
            default:
                System.out.println("Invalid input. Please enter M or F.");
  }
  scanner.close();
    }
}*/

/*13.largest number
public class B
 {
    public static void main(String[] args)
 {
     int a = 10;
     int b = 20;
     int c = 30;
        if (a > b && a > c)
 {
   System.out.println("Largest number is: " + a);
        } else if (b > a && b > c)
 {
  System.out.println("Largest number is: " + b);
        } else if (c > a && c > b)
 {
   System.out.println("Largest number is: " + c);
        } else 
{
  System.out.println("There is a tie.");
        }
    }
}*/