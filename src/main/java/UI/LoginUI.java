package UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://lab-takami-tesla.validsolutions.com.br/#/auth/login") //URL de la pagina WEB

//Clase UI DEL LOGIN
public class LoginUI extends PageObject {

    public static final Target CAJA_USUARIO = Target.the("Caja de texto para el nombre de usuario").located(By.id("username"));
    public static final Target CAJA_CLAVE = Target.the("Caja de texto para el la clave de usuario").located(By.id("password"));
    public static final Target BOTON_INGRESO = Target.the("Boton para el ingreso al portal").located(By.xpath("/html/body/app-root/app-auth-layout/blockable-div/div/div/div/div/div[2]/app-login/div/form/div[3]/div/div[1]/button"));





}
