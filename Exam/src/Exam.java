import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Exam {
        public static void main(String[] args){
            //frame 객체 생성
            JFrame frame = new JFrame();
            //frame 크기 설정
            frame.setBounds(120,120,400,100);
            //프레임 안에 배치될 버튼들의 배치 방식 설정
            frame.setLayout(new GridLayout(2, 2));
            //닫기 버튼 동작을 위한 리스너 설정 및 등록
            /* WindowListener listener = new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    System.exit(0);
                }
                public void windowOpened(WindowEvent we) {
                    System.out.println("프로그램이 수행 되었습니다.");
                }
            };

            frame.addWindowListener(listener); */

            JLabel label1 = new JLabel("ID");
            JLabel label2 = new JLabel("Password");
            JLabel label3 = new JLabel("E-mail");
            JTextField textField1 = new JTextField();
            JPasswordField textField2 = new JPasswordField();
            JTextField textField3 = new JTextField();


            PWHandler pwHandler = new PWHandler(textField1, textField2);
            textField1.addActionListener(pwHandler);
            textField2.addActionListener(pwHandler);

            frame.add(label1);
            frame.add(textField1);
            frame.add(label2);
            frame.add(textField2);
            frame.add(label3);
            frame.add(textField3);

            /*버튼 객체를 생성
            JButton btn1 = new JButton("Btn1");
            JButton btn2 = new JButton("Btn2");
            JButton btn3 = new JButton("Btn3");
            JButton btn4 = new JButton("Btn4");
            JButton btn5 = new JButton("Btn5");
            JButton btn6 = new JButton("Btn6");


            //버튼을 프레임 안에 추가
            frame.add(btn1, BorderLayout.NORTH);
            frame.add(btn2, BorderLayout.CENTER);
            frame.add(btn3, BorderLayout.SOUTH);
            frame.add(btn4, BorderLayout.SOUTH);
            frame.add(btn5, BorderLayout.SOUTH);
            frame.add(btn6, BorderLayout.SOUTH);*/

            //프레임을 화면에 보여줌
            frame.setVisible(true);
        }
    }
}
