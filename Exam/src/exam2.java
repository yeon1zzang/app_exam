import java.util.ArrayList;
import java.util.Scanner;

public class exam2 {
    //글자수 검사 결과를 함수
    public static void prtCheckNumOfWord(String pw){
        if(pw.length() <= 8) {
            System.out.println("올바른 메세지 입니다.");
        } else {
            System.out.println("8글자 이상 입력해주세요.");
        }
    }

    //재입력 일치 여부를 검사 결과를 함수
    public static void prtCheckReinput(String pw, String pw_re){
        if(pw.compareTo(pw_re) == 0){
            System.out.println("입력 내용이 같습니다.");
        } else {
            System.out.println("재입력 해주세요.");
        }
    }

    public static void main(String[] args){
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        int sum = arr[0] + arr[1] + arr[2];
        System.out.println(sum);
    }

    //정수 10개를 저장할 수 있는 배열을 만들어서
    //1부터 10까지를 대입하고 출력

    public static void main(String[] args){
        //정수 10개를 저장할 수 있는 배열 생성
        int[] arr = new int[10];

        //반복하여 입력받기위한 횟수를 저장하는 변수 생성
        int num = 0;

        //10번 입력받고 정수를 저장하는 반복문
        while(num < 10) {
            //사용자에게 입력받음
            Scanner kb = new Scanner(System.in);
            //배열에 사용자에게 받은 값 저장
            arr[num] = kb.nextInt();
            //10번 반복에서 반복횟수 증가
            num++;
    }

    //배열의 값을 반복문으로 출력함
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }


    public static void main(String[] args){
            int[] arr = new int[5];
            Scanner kb = new Scanner(System.in);


            arr[0] = kb.nextInt();
            arr[1] = kb.nextInt();
            arr[2] = kb.nextInt();
            arr[3] = kb.nextInt();
            arr[4] = kb.nextInt();

            int result = arr[0] + arr[2] + arr[4];
            System.out.println(result);
        }


    public static void main(String[] args){
            int[] arr = new int[5];
            ArrayList<Integer> arrayList = new ArrayList<Integer>();

            System.out.println("데이터 저장");
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);

            System.out.println("데이터 읽기");
            System.out.println(arrayList.get(0));
            System.out.println(arrayList.get(1));
            System.out.println(arrayList.get(2));

            System.out.println("데이터 삭제");
            arrayList.remove(0);
            for(int i = 0; i < arrayList.size(); i++){
                System.out.println(arrayList.get(1));
            }
        }
    }


