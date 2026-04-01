import java.util.Scanner;

public class Ch2 {
    public static int sum(int n, int m){
        return n+m;
    }
    public static void main(String[]args){
        int i = 20;
        int s;
        char a;

        s = sum(i,10);
        a = '?';
        System.out.println(a);
        System.out.println("Hello");
        System.out.println(s);
    }
}

class CircleArea{
    public static void main(String[]args){
        final double PI = 3.14;

        double radius = 10.0;
        double circleArea = radius*radius*PI;
        System.out.println("원의 먼적 =" + circleArea);
    }
}

class ArithmeticOperator{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요");

        int time = scanner.nextInt();
        int second = time % 60;
        int minute = (time % 60) % 60;
        int hour = (time / 60) / 60;

        System.out.print(time + second + minute + hour);
        scanner.close();
    }
}

class SuccessorFail{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요0");

        int score = scanner.nextInt();
        if(score >=80){
            System.out.println("합격");
        }
        scanner.close();
    }

}

class MultipleOfThree{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("수를 입력");

        int num = scanner.nextInt();
        if(num % 3 == 0){
            System.out.println("3의 배수입니다");
        }
        else{
            System.out.println("아닙니다");
        }
        scanner.close();
    }
}

class GradingSwitch{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        char grade;
        System.out.print("점수 입력");
        int score = scanner.nextInt();
        switch(score/10){
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }
        System.out.println("학점은" + grade + "입니다");
        scanner.close();
    }
}

//1번
class Num1{
    public static void main(String[]args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("원화를 입력하세요(단위 원)");
         int won = scanner.nextInt();
         double dollar = won / 1100.0;
         System.out.println(won + "원은" + "$" + dollar + "입니다");
    }
}

//2번
class Num2{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("2자리의 정수(10~99사이)를 입력하세요");
        int num = scanner.nextInt();

        if((num/10) == (num%10)) {
            System.out.println("같다");
        }
        else{
            System.out.println("다르다");
        }
    }
}

//3번
class Num3{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("돈의 액수를 입력하세요");
        int money = scanner.nextInt();

        int thousand = money/1000;
        money %= 1000;

        int hundred = money/100;
        money %= 100;

        int ten = money/10;
        money %= 10;

        int one = money;

        System.out.println(thousand + " " + hundred + " " + ten);
    }
}

//4번
class Num4{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int mid = 0;

        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            mid = a;
        } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
            mid = b;
        } else {
            mid = c;
        }
        System.out.println("중간값은" + mid);
    }
}

//5번
class Num5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if((a+b>c) && (a+c>b) && (b+c>a)){
            System.out.println("삼각형이 됩니다.");
        }
        else{
            System.out.println("안됩니다");
        }
    }
}

//6번 - 틀림 (30일 때 반례 발생, 0을 3으로 나누면 나머지가 0이라서)
class Num6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요");

        int num = scanner.nextInt();
        int ten = num/10;
        int one = num%10;

        if((ten % 3 ==0) && (one % 3 ==0)){
            System.out.println("박수짝짝");
        }
        else if((ten % 3 ==0) || (one % 3 ==0)){
            System.out.println("박수짝");
        }
        else{
            System.out.println("3의배수가 아니다");
        }
    }
}

//6번 다시 풀기
class Num6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요");

        int num = scanner.nextInt();
        int ten = num/10;
        int one = num%10;

        int count = 0;

        if(ten ==3 || ten==6 || ten ==9){
            count++;}
        if(one ==3 || one ==6 || one==9){
            count++;
            }

        if(count==1){
            System.out.println("박수짝");
        }
        else if(count==2){
            System.out.println("박수짝짝");
        }
        else{
            System.out.println("3의배수가 아니다");
        }
    }
}
