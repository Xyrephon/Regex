package regex.view;

import javax.swing.*;
import regex.controller.RegexController;


public class RegexPanel extends JFrame
{
	private RegexController baseController;
	private SpringLayout baseLayout;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField phoneNumber;
	private JTextField emailAddress;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel phoneLabel;
	private JLabel emailLabel;
	
	public RegexPanel (RegexController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.firstName = new JTextField(20);
		this.lastName = new JTextField(20);
		this.phoneNumber = new JTextField(20);
		this.emailAddress = new JTextField(20);
		this.firstNameLabel = new JLabel("First: ");
		this.lastNameLabel = new JLabel("Last: ");
		this.phoneLabel = new JLabel("Phone Number: ");
		this.emailLabel = new JLabel("Email: ");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
