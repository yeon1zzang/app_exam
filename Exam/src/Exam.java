//import java.util.Scanner;

//public class Exam {

//    public static void main(String[] args) {



/*            System.out.println("연짱" + 3);
            System.out.println(3);
            System.out.println(3.1);
            System.out.println(1 + 3);

            // 기초 연습
            System.out.println("Programing! It's Fun.");
            System.out.println("My name is Kim Hee Yeon.");
            System.out.println("I am 24 years old.");
            System.out.println("(@) (@)");
            System.out.println("(=^.^=)");
            System.out.println("(-m-m-)");
            System.out.println("I can program well.");
            System.out.println("Dreams come true");
            System.out.println("My height");
            System.out.println("170");
            System.out.println("My weight");
            System.out.println("68.600000");
            System.out.println("5 Dan");
            System.out.println("5 * 2 = 10");
            System.out.println("      item    count     price");
            System.out.println("       pen       20       100");
            System.out.println("      note        5        95");
            System.out.println("    eraser      110        97");
            System.out.println("My name is Kim");
            System.out.println("My hometown");
            System.out.println("Flowering mountain");
            System.out.println("TTTTTTTTTT");
            System.out.println("TTTTTTTTTT");
            System.out.println("    TT    ");
            System.out.println("    TT    ");
            System.out.println("    TT    ");
            System.out.println("kor 90");
            System.out.println("mat 80");
            System.out.println("eng 100");
            System.out.println("sum"+(90 + 80 + 100));
            System.out.println("avg"+(90 + 80 + 100) / 3); */


//            2018.01.16.화요일
           /* int n1=7;
            int n2=3;

            int result=n1+n2;
            System.out.println("덧셈 결과 :" + result);

            result=n1-n2;
            System.out.println("뺄셈 결과 :" + result);
            System.out.println("곱셈 결과 :" + n1*n2);
            System.out.println("나눗셈 결과 :" + n1/n2);
            System.out.println("나머지 결과 :" + n1%n2);

            int num1, num2, num3;
            num1 = 30;
            num2 = 60;
            num3 = 90;
            int sum = num1+num2+num3;
            double average = sum / 3;

            System.out.println("합계 :"+sum);
            System.out.println("평균 :"+average);


            int num4, num5;
            num4 = 30;
            num5 = 60;
            boolean result1;

            result1 = num4 < num5;

            System.out.println("결과는 :"+result1); */


//          2018.01.17.수요일

           /* int score = 45;

            if (score >= 90) {
                    System.out.println("성적은 수 입니다.");
            }

            else if(score >= 80) {
                    System.out.println("성적은 우 입니다.");
            }

            else if (score >= 70) {
                    System.out.println("성적은 미 입니다.");
            }

            else  if (score >= 60) {
                    System.out.println("성적은 양 입니다.");
            }

            else {
                    System.out.println("성적은 가 입니다.");
            }

            int num = 12;

            if (num >= 1) {
                    System.out.println("Positive");
            }

            else if (num >= )
            }

            */


//           2018.01.22.월요일

            /* int n=3;

            switch (n) {
                    case 1:
                            System.out.println("JAVA");
                    case 2:
                            System.out.println("JAVA2");
                    case 3:
                            System.out.println("JAVA3");
                    default:
                            System.out.println("programing language");
            }

            System.out.println("JAVA4");

            // 변수 n이 3일 때 :

            int num = 0;

            while(num < 9) {
                    num = num + 1;
                    System.out.println(2 * num);
            }

            System.out.println("곱셈종료");


            }*/


//          2018.01.23.화요일

/*          키보드 입력을 준비
            Scanner kb = new Scanner(System.in);
            입력할 숫자를 저장하는 변수
            int num;
            clar ch;
            String str;

            문자를 키보드로 입력받음
            str = kb.nextLine();

            사용자가 입력한 숫자를 변수 num에 저장
            num = kb.nextInt();

            저장한 숫자를 출력함
            System.out.println(num); */


//          [ 예제 ]
// import java.util.Scanner;

                /* Scanner keyboard = new Scanner(System.in);

                System.out.println("이름");
                String str = keyboard.nextLine();
                System.out.println("인사");
                System.out.println("배고파 집가고싶엉");
                boolean isTrue = keyboard.nextBoolean();
                if (isTrue = true)
                        System.out.println("좋앙");
                else
                        System.out.println("싫엉");
                System.out.println("밥먹고싶엉");
                double num1 = keyboard.nextDouble();
                double num2 = keyboard.nextDouble();
                double diff = num1 - num2;
                if (diff > 0)
                        System.out.println("먹엉");
                else
                        System.out.println("먹지망");

                int num = 0;
                int num2 = 0;
                do {
                        System.out.println("java"+num);
                        num++;
                } while (num<5);

//              while을 활용한 반복 출력
                while (num2<5){
                        System.out.println("java"+num);
                        num2++;
                }

//              for를 활용한 반복 출력
                for(int num3 = 0; num3 < 5; num3++){
                        System.out.println("JAVA"+num3);
                } */




//              2018.01.24.수요일

//입력 값을 저장할 변수 선언
                /* int a;
                //입력을 받기 위해 준비
                Scanner kb = new Scanner(System.in);
                //사용자로부터 입력을 받아 변수에 저장
                a = kb.nextInt();
                //횟수를 저장하는 변수 num 생성 후 횟수를 0으로 저장
                int num = 0;
                //10번 반복하여 출력
                while (num < 10){
                        num++;
                        System.out.println(num*a + " ");
                }

                for(int num2=1;num2<=10;num2++){
                        System.out.println((num2+1)*a + " ");
                }

                //숫자를 저장하는 변수
                int num = 1;
                //숫자를 1씩 증가 시키면서 6의 배수이고 14의 배수인지 반복하여 검사
                while (true){
                        //숫자를 6으로 나누어서 값이 0이고 숫자를 14로 나누어서 값이 0이여야
                        // if 부분이 참
                        if(num%6==0 && num%14==0) {
                                //무한루프를 탈출
                                break;
                        }
                        //숫자를 1 증가시킴
                        num++;
                }
                //6과 14의 공배수를 출력
                System.out.println(num); */



//              2018.01.30.화요일

//사용자가 입력한 숫자를 저장하는 변수
                /*double num1;
                double num2;

                //연산자를 구분할 문자를 저장하는 변수
                String operator;

                //사용자가 키보드 입력 준비
                Scanner kb = new Scanner(System.in);
                //사용자로 부터 숫자 입력
                System.out.println("첫번째 숫자를 입력하세요.");
                num1 = kb.nextDouble();

                System.out.println("연산을 입력하세요(덧셈:a, 뺄셈:b, 곱셈:c, 나눗셈:d, 나머지:e)");
                operator = kb.nextLine();

                System.out.println("두번째 숫자를 입력하세요.");
                num2 = kb.nextDouble();

                switch (operator) {
                        case "a":
                                System.out.println("덧셈한 결과는 다음과 같습니다.");
                                System.out.println(adder(num1, num2));
                                break;
                        case "b":
                                System.out.println("뺄셈한 결과는 다음과 같습니다.");
                                System.out.println(adder(num1, num2));
                                break;
                        case "c":
                                System.out.println("곱셈한 결과는 다음과 같습니다.");
                                System.out.println(adder(num1, num2));
                                break;
                        case "d":
                                System.out.println("나눗셈한 결과는 다음과 같습니다.");
                                System.out.println(adder(num1, num2));
                                break;
                        case "e":
                                System.out.println("나머지 결과는 다음과 같습니다.");
                                System.out.println(adder(num1, num2));
                                break;
                        default:
                                System.out.println("연산을 잘못 입력하였습니다.");
                }

                /*double num1;
                double num2;
                Scanner kb = new Scanner(System.in);
                num1 = kb.nextDouble();
                num2 = kb.nextDouble();

                System.out.println(adder(num1,num2));*/

                /*System.out.println(adder(1,1));
                System.out.println(multi(1,2));
                System.out.println(divide(4,2));
                System.out.println(minus(5,2));
                System.out.println(modular(6,4));*/


        /* public static double adder(double num1, double num2) {
                // 덧셈값을 저장하는 변수 생성
                double result;
                result = num1+num2;
                // 덧셈한 결과 값을 리턴(도출)
                return result;
        }

        public static double multi(double num1, double num2) {
                // 곱셈값을 저장하는 변수 생성
                double result;
                result = num1 * num2;
                // 곱셈한 결과 값을 리턴(도출)
                return result;
        }

        public static double divide(double num1, double num2) {
                // 나눗셈값을 저장하는 변수 생성
                double result;
                result = num1 / num2;
                // 나눗셈한 결과 값을 리턴(도출)
                return result;
        }

        public static double minus(double num1, double num2) {
                // 값을 저장하는 변수 생성
                double result;
                result = num1 * num2;
                // 한 결과 값을 리턴(도출)
                return result;
        }

        public static double modular(double num1, double num2) {
                // 값을 저장하는 변수 생성
                double result;
                result = num1 * num2;
                // 한 결과 값을 리턴(도출)
                return result;
        } */

//        2018.01.31.수요일

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        //반지름의 길이를 입력받아 넓이를 출력하는 프로그램
        //사용자가 입력한 숫자를 저장하는 변수
        int num1;
        //사용자로 키보드 입력 준비
        Scanner kb = new Scanner(System.in);
        //사용자로부터 숫자 입력
        System.out.println("반지름을 입력하세요.");
        num1 = kb.nextInt();

        System.out.println("원의 넓이는?");
        System.out.println(area(num1));
    }

    //오늘 순서도에 쓰인 area()함수
    public static double area(int radian){
        double temp;
        double result;

        temp = multi(radian, radian);
        result = multi(temp, 3.14);
        //result = radian*radian*3.14
        return result;
    }
    //오늘 순서도에 쓰인 area()함수
    public static double area2(int radian){
        double temp;
        double result;

        result = radian * radian * 3.14;
        return result;
    }

    public static double multi(double num1, double num2){
        double result;
        //곱셈연산 실행
        result = num1 * num2;
        //곱셈한 결과 값을 리턴(도출)
        return result;
    }
}
