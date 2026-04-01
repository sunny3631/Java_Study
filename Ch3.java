import java.util.Scanner;

//for 문 - 1부터 10까지의 덧셈 표시하고 출력
public class Ch3 {
    public static void main(String[] args){
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum+=i;
            System.out.print(i);
            if(i<=9){
                System.out.print("+");
            }
            else{
                System.out.print("=");
                System.out.print(sum);
            }
        }
    }
}

//while문 - -1이 입력될 때까지 입력된 수의 평균 구하기

class WhileSample{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("수를 입력하세요");
        int count = 0;
        int sum = 0;

        int  n= scanner.nextInt();
        while( n!= -1){
            sum += n;
            count++;
            n= scanner.nextInt();
        }
        if(count==0){
            System.out.println("입력된 수가 없습니다");
        }
        else{
            System.out.print("정수의 개수는"+ count+ "개이며 ");
            System.out.println("평균은"+ (double)sum/count+ "입니다");
        }
    }
}

//do-while문
class DoWhileSample{
    public static void main(String[] args){
        char c = 'a';

        do{
            System.out.print(c);
            c= (char) (c+1);
        } while(c <= 'z');
    }
}

//중첩반복
class NestedLoop{
    public static void main(String[] args){
        for(int i=1 ; i<10 ; i++){
            for(int j=1; j<10; j++){
                System.out.print(i+"*" + j + "=" + i*j);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}

//continue 실습
class ContinueExample{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 5개를 입력하세요");
        int sum=0;
        for(int i=0; i<5; i++){
            int n = scanner.nextInt();
            if(n<=0){
                continue;
            } else{
                sum += n;
            }
            System.out.println("양수의 합은 " + sum);
        }
        scanner.close();
    }
}

//배열 입력받은 수 중 제일 큰 수 찾기
class ArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intArray[] = new int[5];
        int max = 0;
        System.out.println("정수 5개를 입력하세요");

        for (int i = 0; i < 5; i++) {
            intArray[i] = scanner.nextInt();
            if (intArray[i] > max) {
                max = intArray[i];
            }

        }
        System.out.print("가장큰수는" + max + "입니다");
        scanner.close();
    }
}

//배열의 length 필드 이용하여 배열의 크기만큼 정수를 입력받고 평균을 구하기
class ArrayLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intArray[] = new int[5];
        int sum= 0;
        System.out.println("정수 5개를 입력하세요");

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            sum += intArray[i];

        }
        System.out.print("평균은" + (double)sum/ intArray.length + "입니다");
        scanner.close();
    }
}

//2차원 배열
class ScoreAverage{
    public static void main(String[] args) {
        double score[][] = {{3.3, 3.4}, {3.5, 3.6}, {3.2, 3.6},{3.5, 3.8}};
        double sum = 0;

        for(int year=0; year<score.length; year++){
            for(int term=0; term<score[year].length ; term++){
                sum+=score[year][term];
            }
        }
        System.out.println("전체 평점 평균은" + (double)sum/(score.length * score[0].length));
    }
}

//비정방형 배열
class SkewedArray{
    public static void main(String[] args) {
        int intArray [][] = new int[4][];
        intArray[0] = new int[3];
        intArray[1] = new int[2];
        intArray[2] = new int[3];
        intArray[3] = new int[2];

        for (int i=0; i<intArray.length;i++ ){
            for(int j= 0; j<intArray[i].length; j++) {
                intArray[i][j] = (i + 1) * 10 + j;
            }
        }
        for (int i=0; i<intArray.length;i++ ){
            for(int j= 0; j<intArray[i].length; j++) {
                System.out.print(intArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class Array2{
    public static void main(String[] args){
        int n [][] ={{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
        for(int i=0; i<n.length; i++){
            for(int j=0; j<n[i].length; j++){
                System.out.println(n[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//배열 리턴
class ReturnArray {
    static int[] makeArray(){ //main이 static이기 때문에 같은 static으로 선언해야 호출됨
        int temp[] = new int[4];
        for(int i=1; i<temp.length; i++){
            temp[i] = i;
        }
        return temp;

    }
    public static void main(String[] args){
        int intArray[];
        intArray = makeArray();
        for(int i=0 ; i<intArray.length; i++ ){
            System.out.println(intArray[i]);

        }

    }
}

//예외처리
class DevideByZeroHandling{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int dividend;
        int divisor;

        while(true) {
            System.out.print("나뉨수를 입력하시오: ");
            dividend = scanner.nextInt();
            System.out.print("나눗수를 입력하세요:");
            divisor = scanner.nextInt();
            try{
                System.out.println(dividend + "를" + divisor + "로 나누면 몫은" + dividend / divisor + "입니다");

            }
            catch(ArithmeticException e){
                System.out.println("0으로 나눌 수 없습니다 ");
            }
        }
        //scanner.close();
    }
}

//이중 중첩
class For2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int n = scanner.nextInt();
        for(int i=n ; i>=1 ; i--){
            for(int j = 0 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}

//배열, 반복문 연습
class ReArray{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[10];
        System.out.println("정수를 입력하세요");

        for(int i=0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("3의 배수는 ");
        for(int i=0; i<arr.length; i++){
             if(arr[i] % 3 == 0){
            System.out.print(arr[i]+" ");
            }
        }
    }
}

class ReArray2{
    public static void main(String[] args){
        int [] arr = new int[10];
        int sum = 0;
        System.out.print("랜덤한 정수들 : ");
        for(int i =0 ; i<arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
            System.out.print(arr[i] + " ");
        }
        double avg = (double) sum / arr.length;
        System.out.print("평균은" + avg);

    }
}

class ReArray3{
    public static void main(String[] args){

    }
}