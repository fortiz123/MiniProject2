import java.util.Scanner;
class Main {
  public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int count = 1;
int num = scan.nextInt();
int sum = 0;
    
while (count < 11 && num != 0)
  {
    count += 1;
    System.out.print("Please input your number: " + num);
    sum += num;
    num = scan.nextInt();
  }
  System.out.println("The sum of the number is" + sum);
  }
}
    