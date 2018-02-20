import javax.swing.*;rt java.awt.*;
rt javax.swing.*;

ic import java.awt.*;

class exam3 {
    public static void main(String[] args){
        //frame 객체 생성
        JFrame frame = new JFrame();
        //frame 크기 설정
        frame.setBounds(120,120,400,100);
        //프레임 안에 배치될 버튼들의 배치 방식 설정
        frame.setLayout(new FlowLayout());

        //버튼 객체를 생성
        JButton btn1 = new JButton("Btn1");
        JButton btn2 = new JButton("Btn2");
        JButton btn3 = new JButton("Btn3");

        //버튼을 프레임 안에 추가
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);

        //프레임을 화면에 보여줌
        frame.setVisible(true);
    }
}