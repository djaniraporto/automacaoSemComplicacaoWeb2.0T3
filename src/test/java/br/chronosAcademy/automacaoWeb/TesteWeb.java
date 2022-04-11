package br.chronosAcademy.automacaoWeb;

import br.chronosAcademy.core.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class TesteWeb {

    WebDriver driver;

    Driver driverWeb;

    @Before
    public void inicializaTeste() {

        driverWeb = new Driver("chrome");

        driver = driverWeb.getDriver();

        driver.get("http://www.chronosacademy.com.br");
    }


    @Test
    public void primeiroTeste() {
        //section[2]/div[3]/div/div/div/div/div[1]/div/h4
        String xpathTitulo = "//section[2]//h4";

        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento", titulo);

    }

    @After
    public void finalizaTeste() {
        driver.quit();
    }
}
