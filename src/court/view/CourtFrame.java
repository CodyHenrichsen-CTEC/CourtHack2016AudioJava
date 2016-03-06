package court.view;

import javax.swing.JFrame;

import court.controller.CourtSoundController;

/**
 * @author Cody Henrichsen
 * @version 0.x Mar 5, 2016
 */
public class CourtFrame extends JFrame
{

	private CourtSoundController baseController;
	private CourtPanel basePanel;
	
	public CourtFrame(CourtSoundController baseController)
	{
		this.baseController = baseController;
		basePanel = new CourtPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setTitle("Court Audio");
		this.setSize(500, 500);
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setVisible(true);
	}
}
