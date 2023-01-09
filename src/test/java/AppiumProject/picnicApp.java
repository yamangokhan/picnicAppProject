package AppiumProject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class picnicApp {

    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_02");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        desiredCapabilities.setCapability("appPackage", "com.google.android.apps.nexuslauncher");
        desiredCapabilities.setCapability("appActivity", "com.google.android.apps.nexuslauncher.NexusLauncherActivity");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        Thread.sleep(10000);

        driver.findElementByAccessibilityId("Picnic Groups").click();
        Thread.sleep(10000);
        driver.findElementByXPath("//android.widget.EditText[@text='Enter your email address']").sendKeys("idliketobeapartofteam@gmail.com");
        Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.EditText[@text='Password']").sendKeys("123456789Pl.");

        driver.findElementByXPath("(//android.view.ViewGroup)[14]").click();
        Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.TextView[@text='Log In']").click();

    


    }
}
