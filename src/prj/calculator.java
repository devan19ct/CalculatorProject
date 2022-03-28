package prj;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class calculator implements ActionListener {
	
	boolean isoperatorClicked=false;
	double first;
	double second;
	String operations="";
	String answer="";
			
	String oldvalue;
	 
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton mullButton;
	JButton subButton;
	JButton addButton;
	JButton clearButton;
	JButton backspaceButton;
	JButton percentageButton;
	
	public calculator() {
		jf=new JFrame("calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300,150);
		
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.GRAY);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.WHITE);
		jf.add(displayLabel);
		
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30,130,80,80);
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(140,130,80,80);
		eightButton.addActionListener(this);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(250,130,80,80);
		nineButton.addActionListener(this);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30,240,80,80);
		fourButton.addActionListener(this);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(140,240,80,80);
		fiveButton.addActionListener(this);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(250,240,80,80);
		sixButton.addActionListener(this);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30,350,80,80);
		oneButton.addActionListener(this);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(140,350,80,80);
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(250,350,80,80);
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(threeButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(30,450,80,80);
		dotButton.addActionListener(this);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(140,450,80,80);
		zeroButton.addActionListener(this);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(250,450,80,80);
		equalButton.addActionListener(this);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(equalButton);
		
		
		
		
		divButton=new JButton("/");
		divButton.setBounds(360,130,80,80);
		divButton.addActionListener(this);
		divButton.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(divButton);
		
		mullButton=new JButton("*");
		mullButton.setBounds(360,240,80,80);
		mullButton.addActionListener(this);
		mullButton.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(mullButton);
		
		subButton=new JButton("-");
		subButton.setBounds(360,350,80,80);
		subButton.addActionListener(this);
		subButton.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(subButton);
		
		addButton=new JButton("+");
		addButton.setBounds(360,450,80,80);
		addButton.addActionListener(this);
		addButton.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(addButton);
		
		clearButton=new JButton("clr");
		clearButton.setBounds(460,450,80,80);
		clearButton.addActionListener(this);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(clearButton);
		
		backspaceButton=new JButton("bck");
		backspaceButton.setBounds(460,350,80,80);
		backspaceButton.addActionListener(this);
		backspaceButton.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(backspaceButton);
		
		percentageButton=new JButton("%");
		percentageButton.setBounds(460,240,80,80);
		percentageButton.addActionListener(this);
		percentageButton.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(percentageButton);
		
	
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new calculator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	
	{
	
		if(e.getSource()==sevenButton){	
			
			if(isoperatorClicked) {
				
				displayLabel.setText("7");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
			
		}		
		else if (e.getSource()==eightButton) {
	if(isoperatorClicked) {
				
				displayLabel.setText("8");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
			
		}
		else if (e.getSource()==nineButton) {
	if(isoperatorClicked) {
				
				displayLabel.setText("9");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
						
		}
		else if (e.getSource()==sixButton) {
	if(isoperatorClicked) {
				
				displayLabel.setText("6");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
			
		}
		else if (e.getSource()==fiveButton) {
	if(isoperatorClicked) {
				
				displayLabel.setText("5");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
			
		}
		else if (e.getSource()==fourButton) {
	if(isoperatorClicked) {
				
				displayLabel.setText("4");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
			
		}
		else if (e.getSource()==threeButton) {
	if(isoperatorClicked) {
				
				displayLabel.setText("3");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
			
		}
		else if (e.getSource()==twoButton) {
	if(isoperatorClicked) {
				
				displayLabel.setText("2");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
			
		}
		else if (e.getSource()==oneButton) {
	if(isoperatorClicked) {
				
				displayLabel.setText("1");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
			
		}
		else if (e.getSource()==zeroButton) {
	if(isoperatorClicked) {
				
				displayLabel.setText("0");
				isoperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
		
	
	
		}
		else if (e.getSource()==dotButton) {
				displayLabel.setText(displayLabel.getText()+".");
			}
		
		
		else if (e.getSource()==addButton) {
			
			first=Double.parseDouble(displayLabel.getText());
			displayLabel.setText("");
			operations="+";
		}
		else if (e.getSource()==subButton) {
			
			first=Double.parseDouble(displayLabel.getText());
			displayLabel.setText("");
			operations="-";
			
		}
		else if (e.getSource()==mullButton) {
			
			first=Double.parseDouble(displayLabel.getText());
			displayLabel.setText("");
			operations="*";
			
		}
		else if (e.getSource()==divButton) {
			
			first=Double.parseDouble(displayLabel.getText());
			displayLabel.setText("");
			operations="/";
			
		}
        else if (e.getSource()==percentageButton) {
			
			first=Double.parseDouble(displayLabel.getText());
			displayLabel.setText("");
			operations="%";
			
		}
		
		else if (e.getSource()==equalButton) {
			double result;
			second=Double.parseDouble(displayLabel.getText());
			if(operations=="+")
			{
			    result=first+second;
			    answer=String.valueOf(result);
			    displayLabel.setText(answer);
			
		}
			if(operations=="-")
			{
			    result=first-second;
			    answer=String.valueOf(result);
			    displayLabel.setText(answer);
			
			
	}
			
			if(operations=="*")
			{
			    result=first*second;
			    answer=String.valueOf(result);
			    displayLabel.setText(answer);
			
			
	}
			
			if(operations=="/")
			{
			    result=first/second;
			    answer=String.valueOf(result);
			    displayLabel.setText(answer);
			
			
	}
			if(operations=="%")
			{
			    result=first%second;
			    answer=String.valueOf(result);
			    displayLabel.setText(answer);
		
		}
		else if (e.getSource()==clearButton) {
			displayLabel.setText("");

	}
		else if (e.getSource()==backspaceButton) {
			
			String backspace=null;
			StringBuilder str=new StringBuilder(displayLabel.getText());
			str.deleteCharAt(str.length()-1);
			backspace=str.toString();
			displayLabel.setText(backspace);
		}
    
	}
	
}
	
}

