package br.chronosAcademy.automacaoWeb;

import br.chronosAcademy.core.Driver;
import br.chronosAcademy.pages.CursoPage;
import br.chronosAcademy.pages.PrincipalPage;
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
    PrincipalPage principalpage;
    CursoPage cursoPage;

    @Before
    public void inicializaTeste() {

        driverWeb = new Driver("chrome");

        driver = driverWeb.getDriver();

        driver.get("http://www.chronosacademy.com.br");

        principalpage = new PrincipalPage(driver);


    }


    @Test
    public void primeiroTeste() {
        //section[2]/div[3]/div/div/div/div/div[1]/div/h4

        assertEquals("Porque Tempo É Conhecimento", principalpage.getTitulo());

    }


    @Test

    public void segundoTest() {
        cursoPage = new CursoPage(driver);

        principalpage.clickBotao();

        assertEquals("Conheça todos os nossos cursos", cursoPage.getTitulo2());



    }

    @After
    public void finalizaTeste() {
        driver.quit();
    }
}
