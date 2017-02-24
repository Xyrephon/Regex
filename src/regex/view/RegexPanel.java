package regex.view;

import java.awt.Color;
import javax.swing.*;
import regex.controller.RegexController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.regex.*;

public class RegexPanel extends JPanel
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
	private JLabel firstTrue;
	private JLabel lastTrue;
	private JLabel phoneTrue;
	private JLabel emailTrue;
	private JButton submit;
	
	public RegexPanel (RegexController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.firstName = new JTextField(5);
		this.lastName = new JTextField(5);
		this.phoneNumber = new JTextField(10);
		this.emailAddress = new JTextField(10);
		this.firstNameLabel = new JLabel("First: ");
		this.lastNameLabel = new JLabel("Last: ");
		this.phoneLabel = new JLabel("Phone Number: ");
		this.emailLabel = new JLabel("Email: ");
		this.firstTrue = new JLabel("False");
		this.lastTrue = new JLabel("False");
		this.phoneTrue = new JLabel("False");
		this.emailTrue = new JLabel("False");
		this.submit = new JButton("Submit");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.CYAN);
		this.add(firstName);
		this.add(lastName);
		this.add(phoneNumber);
		this.add(emailAddress);
		this.add(firstNameLabel);
		this.add(lastNameLabel);
		this.add(phoneLabel);
		this.add(emailLabel);
		this.add(firstTrue);
		this.add(lastTrue);
		this.add(phoneTrue);
		this.add(emailTrue);
		this.add(submit);
		
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, lastName, 0, SpringLayout.EAST, firstName);
		baseLayout.putConstraint(SpringLayout.NORTH, firstNameLabel, 37, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstNameLabel, -398, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstName, -5, SpringLayout.NORTH, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, firstName, 6, SpringLayout.EAST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, lastName, -5, SpringLayout.NORTH, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, lastNameLabel, 0, SpringLayout.WEST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneNumber, -5, SpringLayout.NORTH, phoneLabel);
		baseLayout.putConstraint(SpringLayout.WEST, phoneNumber, 6, SpringLayout.EAST, phoneLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneLabel, 24, SpringLayout.SOUTH, emailAddress);
		baseLayout.putConstraint(SpringLayout.WEST, phoneLabel, 0, SpringLayout.WEST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, emailLabel, 129, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, emailAddress, -5, SpringLayout.NORTH, emailLabel);
		baseLayout.putConstraint(SpringLayout.WEST, emailAddress, 6, SpringLayout.EAST, emailLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, lastNameLabel, -34, SpringLayout.NORTH, emailLabel);
		baseLayout.putConstraint(SpringLayout.WEST, emailLabel, 0, SpringLayout.WEST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTrue, 5, SpringLayout.NORTH, firstName);
		baseLayout.putConstraint(SpringLayout.EAST, firstTrue, -273, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, lastTrue, 5, SpringLayout.NORTH, lastName);
		baseLayout.putConstraint(SpringLayout.EAST, lastTrue, 0, SpringLayout.EAST, firstTrue);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneTrue, 5, SpringLayout.NORTH, phoneNumber);
		baseLayout.putConstraint(SpringLayout.WEST, phoneTrue, 14, SpringLayout.EAST, phoneNumber);
		baseLayout.putConstraint(SpringLayout.NORTH, emailTrue, 5, SpringLayout.NORTH, emailAddress);
		baseLayout.putConstraint(SpringLayout.WEST, emailTrue, 16, SpringLayout.EAST, emailAddress);
		baseLayout.putConstraint(SpringLayout.NORTH, submit, 25, SpringLayout.SOUTH, phoneLabel);
		baseLayout.putConstraint(SpringLayout.WEST, submit, 10, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		submit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String validFirstName = firstName.getText();
				String validLastName = lastName.getText();
				String validNumber = phoneNumber.getText();
				String validEmail = emailAddress.getText();
				
				if (validFirstName.matches("[a-zA-z]{2,30}"))
				{
					firstTrue.setText("true");
				}
				else
				{
					firstTrue.setText("false");
				}
				
				if (validLastName.matches("[a-zA-z.,'-]{2,40}"))
				{
					lastTrue.setText("true");
				}
				else
				{
					lastTrue.setText("false");
				}
				
				
				if (validNumber.matches("[0-9]{10}"))
				{
					phoneTrue.setText("true");
				}
				else
				{
					phoneTrue.setText("false");
				}
				
				if (validEmail.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,}$"))
				{
					emailTrue.setText("true");
				}
				else
				{
					emailTrue.setText("false");
				}
				
			}
		});
	}
}
