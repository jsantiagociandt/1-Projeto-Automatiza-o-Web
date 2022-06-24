import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomacaoWeb {
    @Test
    //criando o método
    public void pesquisarGoogle() {
        System.setProperty("webdriver.chrome.driver", "src/drive/chromedriver");
        //instanciando o navegador
        WebDriver navegar = new ChromeDriver();

        //indicando onde quer que ele navegue
        navegar.get("https://google.com");

        //para poder pesquisar no Google
        navegar.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).click();

        //para que ele digite o que eu quero pesquisar
        navegar.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("imagens de filhotes de beagles", Keys.ENTER);
    }
}
