package managers;
import dataProviders.ConfigFileReader;

public class FileReaderManager {
	
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader confiFileReader;
	
	private FileReaderManager()
	{
		
	}
	
	public static FileReaderManager getInstance()
	{
		return fileReaderManager;
	}
	
	public ConfigFileReader getConfiFileReader()
	{
		return (confiFileReader == null)? new ConfigFileReader(): confiFileReader;
	}

}
