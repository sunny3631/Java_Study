public class Test {

}

//for 문 구구단
class GuguFor{
    public static void main(String[] args){
        int res=0;
        for(int i=2; i<=9; i++){
            for(int j=1; j<=9; j++){
                res = i*j;
                System.out.println(i + "*" + j + "=" + res);

            }

        }
    }
}

 //while문 구구단
 class GuguWhile{
    public static void main(String[] args){
        int res= 0;
        int i= 2;
        //int j = 1; 초기화를 계속 해줘야 해서 바깥 while문 앞에 초기화해줘야됨
        while(i<=9){
            int j = 1;
            while(j<=9){
                res = i *j;
                System.out.println(i + "*" + j + "=" + res);
                j++;
            }
            i++;
        }
    }
}

//switch문 구구단
class GuguSwitch{
    public static void main(String[] args){
        int i = 2;
        while(i<=9){
            switch(i){
                case 2:
                    for(int j=1;j<=9;j++){
                        System.out.println(i*j);
                    }
                    break;
                case 3:
                    for(int j=1;j<=9;j++){
                        System.out.println(i*j);
                    }
                    break;
                case 4:
                    for(int j=1;j<=9;j++){
                        System.out.println(i*j);
                    }
                    break;
            } i++;
        }

    }
}


//public static void main(String[] args){
//    int sum =0;
//    for(int i =1; i<=100; i++){
//        sum += i;
//    }
//    System.out.print(sum);
//}

//for문을 이용하여 구구단 출력 (조건)
class GuguIf{
    public static void main(String[] args){
        int res = 0;
        for(int i=2;i<=9;i++){
            if(i%2 ==0){
                if(i==6){
                    break;
                }
            for(int j=1; j<=9; j++) {
                res = i * j;
                System.out.println(i + "*" + j + "=" + res);

            }
            }
        }
    }
}

