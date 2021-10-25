package com.pruebas.swaglabs.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Navegacion {

    public static Target CAMPO_USUARIO= Target.the("Ingresar usuario en").located(By.xpath("//*[@id=\"user-name\"]"));
    public static Target CAMPO_CONTRSENA= Target.the("Ingrese contraseña en:").located(By.xpath("//*[@id=\"password\"]"));

    public static Target AGREGAR_PRODUCTO= Target.the("Primer producto").located(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
    public static Target MENU=Target.the("Ir al menú").located(By.xpath("//*[@id=\"react-burger-menu-btn\"]"));

    public static Target ALLITEMS= Target.the("Todos los productos").located(By.xpath("//*[@id=\"inventory_sidebar_link\"]"));
    public static Target ABOUT= Target.the("Conocer informacion sobre la pagina").located(By.xpath("//*[@id=\"about_sidebar_link\"]"));
    public static Target LOGOUT=Target.the("Cerrar sesión").located(By.xpath("//*[@id=\"logout_sidebar_link\"]"));




}
