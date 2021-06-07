package Static;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{

WebDriver driver;
	
    public HomePage(WebDriver ldriver)
			{
			this.driver =ldriver;
			}

		
			@FindBy(how=How.XPATH,using="//input[@placeholder='Primary School Name']")
			private WebElement Primary_School;

		   @FindBy(xpath="//input[@placeholder='Secondary School Name']")
		   private   WebElement Secondary_School;

		   @FindBy(xpath = "//input[@placeholder='Intermediate College Name']")
		   private WebElement Intermediate;

		   @FindBy(xpath = "//input[@placeholder='Engineering College Name']")
		   private WebElement Engineering;

		   @FindBy(xpath = "//input[@placeholder='University Name']")
		   private WebElement University;

		   @FindBy(xpath = "//input[@placeholder='Intermediate Percentage']")
		   private WebElement Intermediate_Percentage;
		   

		   @FindBy(xpath ="//input[@id='profession-0']")
		   private  WebElement Gender;




		   
		   
		   
     public void Primary(String primary_School) 
     
     {
		Primary_School.sendKeys(primary_School);
		
     }
			
     public void Secondary(String secondary_School) 
			
     {
				
    	 Secondary_School.sendKeys(secondary_School);
				
			
     }	  
	

	public  void Intermediate(String intermediate)

	{
	
		Intermediate.sendKeys(intermediate);
   
		
	}
		public  void Engineering(String engineering) throws InterruptedException
		{
			
			Engineering.sendKeys(engineering);
			   
			    }
		public  void University(String university) throws InterruptedException

		{
			University.sendKeys(university);

			
		}			
    			
		public  void Intermediate_Percentage(String intermediate_Percentage) throws InterruptedException

		{
			Intermediate_Percentage.sendKeys(intermediate_Percentage);

			
		}
		

		public  void Gender(String gender) throws InterruptedException

		{
			Gender.click();


		}
	
	}
	