import java.util.Scanner;
public class Exam {
    public static void main(String[] args){

        double inch, feet, yard;
        Scanner sc = new Scanner(System.in);

        System.out.println("변환할 미터값을 입력하시오.");
        double meter = sc.nextDouble();

        inch = 39.37*meter;
        feet = 3.2808*meter;
        yard = 1.0936*meter;

        System.out.println("미터(M)를 인치(Inch)로 변환한 결과:"+inch);
        System.out.println("미터(M)를 피트(Feet)로 변환한 결과:"+feet);
        System.out.println("미터(M)를 야드(Yard)로 변환한 결과:"+yard);
    }
}

// 18.02.14.수요일

public class Person {
    private int perID;
    private int milID;

    public Person(int pID, int mID) {
        perID = pID;
        milID = mID;
    }
    public Person(int pID) {
        perID = pID;
        milID = -1;
    }
    public void showInfo() {
        System.out.println("주민번호"+perID);
        if (milID == -1) {
            System.out.println("군번이 없음");
        } else {
            System.out.println("군번 : " +milID);
        }
    }
}

public class Exam {
    public static void main(String[] args) {
        Person p1 = new Person( 1234, 5678);
        Person p2 = new Person( 4321);

        p1.showInfo();
        p2.showInfo();
    }
}

public class Exam {
    public static void main(String[] args){
        String str = "문자열 예제";
        int strLen = str.length();
        System.out.println(strLen);

        if(strLen < 6 && strLen >= 20) {
            System.out.println("올바른 비번");
        } else {
            System.out.println("재입력 요청");
        }
    }
}

public class Exam {
    public static void main(String[] args){
        String str1 = "Smart";
        String str2 = " and ";
        String str3 = "Simple";

        String result = str1.concat(str2);
        System.out.println(result);
    }
}

public class Exam {
    public static void main(String[] args){
        String str1 = "A";
        String str2 = "B";
        String str3 = "Simple";

        String str4 = new String ("A")

        int result = str4.length();
        System.out.println(result);
    }
}

public class Exam {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = new String("JAVA");
        strArray[1] = new String("Flex");
        strArray[2] = new String("Ruby");

        for (int i = 0; i < strArray.length; i++){
            System.out.println(strArray[i]);
        }
    }
}
