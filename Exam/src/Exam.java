import com.sun.tools.attach.AgentLoadException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args){
        try {
            System.out.println("나이를 입력하세요.");
            int age = kb.nextInt();
            System.out.println("당신의 나이는 "+age);
        } catch (AgenInputException e){
            System.out.println("");
            e.printStackTrace();
        }
    }
    public static int readAge() {
        Scanner kb = new Scanner(System.in);
        int age = kb.nextInt();
        if(age <= 0) {
            AgeInputException ageInputException = new AgeInputException();

        }
    }
}
