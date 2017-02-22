package regex.view;

import javax.swing.JFrame;
import regex.controller.RegexController;
import java.awt.Dimension;

public class RegexFrame extends JFrame
{
	private RegexController baseController;
	private RegexPanel appPanel;
	
	public RegexFrame(RegexController baseController)
	{
		this.baseController = baseController;
		appPanel = new RegexPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Regex");
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
	}

}
