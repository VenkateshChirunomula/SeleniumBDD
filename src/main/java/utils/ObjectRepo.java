package utils;

import org.openqa.selenium.By;

public class ObjectRepo {

    public static class LoginPage{
        public static final By userNameField= By.xpath("//*[@name='username']");
        public static final By passwordField= By.xpath("//*[@name='password']");
        public static final By buttonLogin = By.xpath("//button[@type='submit']");
    }
    public static class HomePage{
        public static final By dashBoardText = By.xpath("//h6");
        public static final By linkAdmin = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
        public static final By profileDropdown = By.className("oxd-userdropdown-name");
        public static final By logoutLink = By.xpath("//a[@href='/web/index.php/auth/logout']");
    }
    public static class AdminPage{
        public static final By buttonAdd = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
    }
}
