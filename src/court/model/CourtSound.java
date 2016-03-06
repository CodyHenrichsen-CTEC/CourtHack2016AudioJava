package court.model;

/**
 * @author Cody Henrichsen
 * @version 0.x Mar 5, 2016
 */
public class CourtSound
{

	private String title;
	private String filePath;
	
	public CourtSound()
	{
		
	}

	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * @return the filePath
	 */
	public String getFilePath()
	{
		return filePath;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath)
	{
		this.filePath = filePath;
	}
}
