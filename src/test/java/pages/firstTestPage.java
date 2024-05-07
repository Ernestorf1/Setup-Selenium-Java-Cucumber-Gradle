package pages;



public class firstTestPage extends BasePage {
	private String searchField = "//textarea[@id='APjFqb']";
	private String searchBtn = "//div[@class='lJ9FBc']//input[@name='btnK']";
    private String textToWrite = "Tipo de Cambio";
	private String criteriaMatch = "//*[@id=\"knowledge-currency__updatable-data-column\"]/div[1]/div[1]/div[1]";

    public firstTestPage() {
		super(driver);
	}

	public void navigateToGoogle() {
		navigateTo("https://www.google.com");
	}
    public void searchCriteria() {
		write(searchField, textToWrite, "xpath");
		clickElement(searchBtn);
        
    }

    public void matchResults() {
		elementIsDisplayed(criteriaMatch, "xpath");
	} 
}
