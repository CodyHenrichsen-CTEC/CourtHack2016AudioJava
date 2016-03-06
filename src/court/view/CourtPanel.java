package court.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import court.controller.CourtSoundController;

/**
 * @author Cody Henrichsen
 * @version 0.x Mar 5, 2016
 */
public class CourtPanel extends JPanel
{
	private CourtSoundController baseController;
	private JScrollPane listPane;
	private SpringLayout baseLayout;
	private JList<String> audioFileList;
	private JButton recordButton;
	private JButton endButton;
	private JButton clearButton;

	public CourtPanel(CourtSoundController baseController)
	{
		this.baseController = baseController;

		baseLayout = new SpringLayout();
		recordButton = new JButton("Start recording");
		endButton = new JButton("End recording");
		clearButton = new JButton("clear");
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPane()
	{
		audioFileList = new JList<String>(baseController.getCourtLabels());
		listPane = new JScrollPane(audioFileList);

	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(500, 500));
		this.setBackground(Color.GREEN);
		this.add(clearButton);
		this.add(endButton);
		this.add(recordButton);
		this.add(listPane);
	}

	private void setupListeners()
	{

	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, recordButton, 0, SpringLayout.WEST, clearButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, recordButton, -16, SpringLayout.NORTH, clearButton);
		baseLayout.putConstraint(SpringLayout.NORTH, endButton, 14, SpringLayout.SOUTH, clearButton);
		baseLayout.putConstraint(SpringLayout.WEST, endButton, 0, SpringLayout.WEST, clearButton);
		baseLayout.putConstraint(SpringLayout.WEST, clearButton, 27, SpringLayout.WEST, this);

		baseLayout.putConstraint(SpringLayout.NORTH, clearButton, 77, SpringLayout.SOUTH, listPane);
		baseLayout.putConstraint(SpringLayout.NORTH, listPane, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, listPane, 25, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, listPane, 300, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, listPane, -25, SpringLayout.EAST, this);
	}

}
