package bilibili;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class MyFrame extends JFrame {
	Button btn =new Button("欢迎来到深夜食堂，八哥请你吃饭");
	
	public MyFrame(final AppStudent f){
		ImageIcon image=new ImageIcon("fengmian/fengmian.jpg");
		JLabel label=new JLabel(image);
		add(label);
		label.setBounds(0,30,400,500);
		



		
		setTitle("这是一个深夜食堂！");
		setSize(400, 500);
		setLayout(null);
		setLocation(300, 200);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});


		btn.setBounds(50, 0, 250, 30);
		btn.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent arg0) {
					f.setVisible(true);
					dispose();
			
			}
		});
		add(btn);
	}
}
