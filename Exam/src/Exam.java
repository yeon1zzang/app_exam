import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args){

        //정상적으로 처리가 되면 try안에 구문이 처리되고 나눗셈이 정상적으로 수행되었다는 출력이 나옴

        try{
            Scanner keyboard = new Scanner(System.in);

            System.out.println("피제수 입력 : ");
            int num1 = keyboard.nextInt();
            System.out.println("제수 입력 : ");
            int num2 = keyboard.nextInt();
            System.out.println("연산 결과를 저장할 배열의 인덱스 입력 : ");
            int idx = keyboard.nextInt();

            arr[idx]=num1/num2;
            System.out.println("나눗셈 결과는 "+arr[idx]);
            System.out.println("저장된 위치의 인덱스는 "+idx);
    }

    catch (ArithmeticException e){
            System.out.println("제수는 0이 될 수 없습니다.");
            i-=1;
            continue;
    }

    catch (ArrayIndexOutOfBoundsException e){
            System.out.println("유효하지 않은 인덱스 값입니다.");
            i-=1;
            continue;
        }
    }
}
