package chap1;

import javax.swing.JFrame;
public class Demo extends JFrame {
 public Demo() {
 setSize(300, 200);
 setTitle("Simple");
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
 public static void main(String[] args) {
 Demo simple = new Demo();
simple.setVisible(true);
 }
}