package nháp;

import javax.swing.JFrame;

public class Nhap2 extends JFrame {

    Nhap3 nhap3;

    public Nhap2() { // cái này gọi là constructor, tên nó giống tên lớp và k có kiểu trả về
        nhap3 = new Nhap3();
        add(nhap3);
        creatAndShow();
    }

    public void creatAndShow() {
        setTitle("Atom");
        setSize(500, 500);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Nhap2();
    }
}
