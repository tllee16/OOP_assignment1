import javax.swing.*;
import java.awt.*;

public class OOP_RegSystem extends JFrame
{
	final int FRAME_WIDTH = 400;
	final int FRAME_HEIGHT = 400;
   	
	public OOP_RegSystem()
	{
		super("OOP Registration System");			           
		setSize (FRAME_WIDTH, FRAME_HEIGHT);			       
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		   
		
		JLabel heading = new JLabel("Registration Form");	 
		heading.setFont(new Font("Arial", Font.BOLD, 24)); 	
		
		JLabel namePrompt = new JLabel("Name:");		      	
		JTextField nameField = new JTextField(15);
		JLabel yearPrompt = new JLabel("Year:");
		String[] yearArray = {"1st Year", "2nd Year", "3rd Year", "4th Year"};
		JComboBox yearChoice = new JComboBox(yearArray);
		JLabel emailPrompt = new JLabel("E-mail:");
		JTextField emailField = new JTextField(15);
		JLabel numPrompt = new JLabel("Contact No.:");
      		JTextField numField = new JTextField(15);      

		JLabel sexPrompt = new JLabel("Sex:");
      		ButtonGroup sexGroup = new ButtonGroup();
      		JRadioButtonMenuItem male = new JRadioButtonMenuItem("Male", false);
      		JRadioButtonMenuItem female = new JRadioButtonMenuItem ("Female", false);
      
		JLabel langPrompt = new JLabel("Language:");
      		JCheckBox cLang = new JCheckBox("C", false);
      		JCheckBox javaLang = new JCheckBox("Java", false);
      		JCheckBox htmlLang = new JCheckBox("HTML", false);
      		JCheckBox phpLang = new JCheckBox("PHP", false);
      
		JLabel expectationsPrompt = new JLabel("What do you expect from this class?");
      		JTextArea expectationsArea = new JTextArea(5,25);
      		
		JButton submit = new JButton("Submit");
      		JButton clear = new JButton("Clear");
      		
		JPanel infoFields = new JPanel(new GridLayout(4,2));
      		JPanel genderFields = new JPanel(new GridLayout(1,3));
      		JPanel langFields = new JPanel(new GridLayout(1,5));
      		JPanel theButtons = new JPanel(new GridLayout(1,2,5,5));
      
		setLayout (new FlowLayout());
		add(heading);
		
		infoFields.add(namePrompt);
		infoFields.add(nameField);
      		infoFields.add(yearPrompt);
      		infoFields.add(yearChoice);
      		infoFields.add(emailPrompt);
      		infoFields.add(emailField);
      		infoFields.add(numPrompt);
      		infoFields.add(numField);
      		add(infoFields);
      
		genderFields.add(sexPrompt);
      		sexGroup.add(male);
      		sexGroup.add(female);
      		genderFields.add(male);
      		genderFields.add(female);
      		add(genderFields);
      
		langFields.add(langPrompt);
      		langFields.add(cLang);
      		langFields.add(javaLang);
      		langFields.add(htmlLang);
      		langFields.add(phpLang);
      		add(langFields);
      
		add(expectationsPrompt);
      		add(expectationsArea);
      
		theButtons.add(submit);
      		theButtons.add(clear);
      		add(theButtons);	
	} 

}