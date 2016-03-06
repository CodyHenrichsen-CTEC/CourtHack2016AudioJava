package court.controller;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;

import court.model.CourtSound;
import court.view.CourtFrame;

/**
 * @author Cody Henrichsen
 * @version 0.x Mar 5, 2016
 */
public class CourtSoundController
{
	private CourtFrame baseFrame;
	private String[] courtSounds;
	private String[] courtLabels;
	
	public CourtSoundController()
	{
		buildArray();
		baseFrame = new CourtFrame(this);
		
	}
	
	public void getAudio()
	{
		TargetDataLine line;
		AudioFormat format=null;
		DataLine.Info info = new DataLine.Info(TargetDataLine.class, format); // format is an AudioFormat object
		if (!AudioSystem.isLineSupported(info)) {
		    // Handle the error ... 

		}
		// Obtain and open the line.
		try {
		    line = (TargetDataLine) AudioSystem.getLine(info);
		    line.open(format);
		} catch (LineUnavailableException ex) {
		    // Handle the error ... 
		}
	}
	
	public void start()
	{
		
	}

	private void buildArray()
	{
		courtLabels = new String[]{
				"Case: 113.123: 3/4/16 8:35.23",
				"Case: 113.123: 3/4/16 8:45.42",
				"Case: 113.123: 3/4/16 8:51.03",
				"Case: 113.123: 3/4/16 9:12.02",
				"Case: 113.123: 3/4/16 9:14.23",
				"Case: 113.123: 3/4/16 9:23.23",
				"Case: 113.123: 3/4/16 9:35.23"
		};
	}
	
	
	

	/**
	 * @return the baseFrame
	 */
	public CourtFrame getBaseFrame()
	{
		return baseFrame;
	}
	
	/**
	 * @return the courtSounds
	 */
	public String[] getCourtSounds()
	{
		return null;
	}
	
	public String[] getCourtLabels()
	{
		return courtLabels;
	}
}
