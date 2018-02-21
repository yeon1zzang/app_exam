import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Exam {
    public static void main(String[] args){
        try{
            int num1 = 10;
            int num2 = 0;

            double result = num1/num2;
            System.out.println("결과 : " + result);
        } catch (ArithmeticException e){
            System.out.println("안내 : 에러가 발생하였습니다.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("나눗셈이 정상적으로 수행되었습니다.");
    }
}
