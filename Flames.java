
import javax.swing.*;

public class Flames {
	public static void main(String[] args) {
		Gui go = new Gui();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(400,400);
		go.setVisible(true);
		

	}

}




import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame{
	private JLabel flamespic;
	private Icon picture = new ImageIcon(getClass().getResource("Flames.jpg"));
	private JLabel text1 = new JLabel("Name of your crush:");
	private JLabel text2 = new JLabel("Your name:");
	private JTextField item1 = new JTextField(20);
	private JTextField item2 = new JTextField(20);
	private JButton calculate = new JButton("Calculate");
	public Gui(){
		super("Flames");
		setLayout(new FlowLayout());
		flamespic = new JLabel(picture);
		add(flamespic);
		add(text1);
		add(item1);
		add(text2);
		add(item2);
		add(calculate);
		calculate.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						String NameCrush;
						String NameUser;
						NameCrush = item1.getText();
						NameUser = item2.getText();
						
						String result;
						int counter = 0;
						int breakIt, signal;
						
						NameCrush = NameCrush.replace(" ", "");
		                NameUser = NameUser.replace(" ", "");
		                NameCrush = NameCrush.toLowerCase();
		                NameUser = NameUser.toLowerCase();
					
						for (int charCrush=0;charCrush<NameCrush.length();charCrush++){
							breakIt = 0;
							signal = 0;
							for(int charMe=0;charMe<NameUser.length();charMe++){
								if(NameCrush.charAt(charCrush)==NameUser.charAt(charMe)){
									counter++;
									for (int charCrush1=0;charCrush1<charCrush;charCrush1++){
										if(NameCrush.charAt(charCrush1)==NameCrush.charAt(charCrush)){
											counter--;
											breakIt=1;
											break;
										}
									}
									if(breakIt==1){
										break;
									}
									if (signal==0){
										for(int charCrush1=0;charCrush1<NameCrush.length();charCrush1++){
											if(NameCrush.charAt(charCrush1)==NameCrush.charAt(charCrush)){
												counter++;
											}
										}
										signal=1;
									}
								}
							}
							
						}
						
						while(counter>6){
							counter = counter - 6;
						}
						
						if (counter==1)
							result = "friends";
						else if (counter==2)
							result = "lovers";
						else if (counter==3)
							result = "angry";
						else if (counter==4)
							result = "marriage";
						else if (counter==5)
							result = "enemy";
						else
							result = "sweethearts";
						JOptionPane.showMessageDialog(null, result, "Flames", JOptionPane.PLAIN_MESSAGE);
					}
					
				}
				);
		
	}
	
	
	
	

}


