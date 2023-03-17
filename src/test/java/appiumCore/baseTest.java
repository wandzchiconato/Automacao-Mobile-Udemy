package appiumCore;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class baseTest {
//Classe para finalizar o Driver do Appium

    @Rule
    public TestName testname = new TestName();

    @AfterClass
    public static void finalizaClasse() {
        driverFactory.killDriver();
    }

    @After
    public void tearDown() throws IOException {
        gerarScreenShot();
        driverFactory.getDriver().resetApp();

    }

    public void esperar(long tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void gerarScreenShot() throws IOException {
        File imagem = ((TakesScreenshot) driverFactory.getDriver()).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(imagem, new File("resources/screenshots/"+testname.getMethodName()+".png"));

        }


    }




