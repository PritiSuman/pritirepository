package cucumber;

import managers.PageObjectManagers;
import managers.WebDriverManager;

public class TestContext {
	
	private WebDriverManager webDriverManager;
	private PageObjectManagers pageObjectManager;
	public ScenarioContext scenarioContext;
	
	public TestContext()
	{
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManagers(webDriverManager.getDriver());
		scenarioContext = new ScenarioContext();
	}
	
	public WebDriverManager getWebDriverManager()
	{
		return webDriverManager;
	}

	
	public PageObjectManagers getPageObjectManagers()
	{
		return pageObjectManager;
	}
	
	public ScenarioContext getScenarioContext()
	{
		return scenarioContext;
	}
}
