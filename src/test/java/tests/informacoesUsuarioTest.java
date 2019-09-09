package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class informacoesUsuarioTest {
    @Test
    public void testAdicionarUmaInformacaoDoUsuario(){
        System.setProperty("webdriver.chrome.driver","C:\\Tools\\selenium\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.get("http://www.juliodelima.com.br/taskit");
        assertEquals(1,1);
    }
}