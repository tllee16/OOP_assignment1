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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//sets Title, Size, and Exit button behavior
		
		JLabel heading = new JLabel("Registration Form");	 
		heading.setFont(new Font("Arial", Font.BOLD, 24));		// creates a new label with the text "Registration Form" and sets the font 	
		
		JLabel namePrompt = new JLabel("Name:");		      	
		JTextField nameField = new JTextField(15);
		JLabel yearPrompt = new JLabel("Year:");
		String[] yearArray = {"1st Year", "2nd Year", "3rd Year", "4th Year"};
		JComboBox yearChoice = new JComboBox(yearArray);
		JLabel emailPrompt = new JLabel("E-mail:");
		JTextField emailField = new JTextField(15);
		JLabel numPrompt = new JLabel("Contact No.:");
      		JTextField numField = new JTextField(15);			//creates the labels and text fields for the name, e-mail, and contact no. info and the label and combo box for the year level      

		JLabel sexPrompt = new JLabel("Sex:");
      		ButtonGroup sexGroup = new ButtonGroup();
      		JRadioButtonMenuItem male = new JRadioButtonMenuItem("Male", false);
      		JRadioButtonMenuItem female = new JRadioButtonMenuItem ("Female", false);
										//creates the label, button group, and radio buttons for the sex
      
		JLabel langPrompt = new JLabel("Language:");
      		JCheckBox cLang = new JCheckBox("C", false);
      		JCheckBox javaLang = new JCheckBox("Java", false);
      		JCheckBox htmlLang = new JCheckBox("HTML", false);
      		JCheckBox phpLang = new JCheckBox("PHP", false);		//creates the label and check boxes for the languages
      
		JLabel expectationsPrompt = new JLabel("What do you expect from this class?");
      		JTextArea expectationsArea = new JTextArea(5,25);		//creates the label and text area for the expectations
      		
		JButton submit = new JButton("Submit");
      		JButton clear = new JButton("Clear");				//creates the buttons for submission and clearing
      		
		JPanel infoFields = new JPanel(new GridLayout(4,2));
      		JPanel genderFields = new JPanel(new GridLayout(1,3));
      		JPanel langFields = new JPanel(new GridLayout(1,5));
      		JPanel theButtons = new JPanel(new GridLayout(1,2,5,5));	//creates containers to group certain components together and sets their layouts
      
		setLayout (new FlowLayout());					//sets the main layout for the window
		
		add(heading);							//adds the heading label 
		
		infoFields.add(namePrompt);
		infoFields.add(nameField);
      		infoFields.add(yearPrompt);
      		infoFields.add(yearChoice);
      		infoFields.add(emailPrompt);
      		infoFields.add(emailField);
      		infoFields.add(numPrompt);
      		infoFields.add(numField);
      		add(infoFields);						//adds the labels and text fields for the name, e-mail, and contact no. info and the label and combo box for the year level to the infoFields container then adds that container to the frame
      
		genderFields.add(sexPrompt);
      		sexGroup.add(male);
      		sexGroup.add(female);
      		genderFields.add(male);
      		genderFields.add(female);
      		add(genderFields);						//adds the label, button group, and radio buttons for the sex to the genderField container then adds that container to the frame
      
		langFields.add(langPrompt);
      		langFields.add(cLang);
      		langFields.add(javaLang);
      		langFields.add(htmlLang);
      		langFields.add(phpLang);
      		add(langFields);						//adds the label and check boxes for the languages to the langFields container then adds that container to the frame
      
		add(expectationsPrompt);
      		add(expectationsArea);						//adds the expectations label and text area to the frame
      
		theButtons.add(submit);
      		theButtons.add(clear);
      		add(theButtons);						//adds the submit and clear buttons to the theButtons container then adds that container to the frame
	} 

}