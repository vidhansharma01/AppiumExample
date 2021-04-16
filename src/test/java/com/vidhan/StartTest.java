package com.vidhan;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class StartTest extends ExampleTest {
    public static void main(String args[]) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /*
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        /*
        *AndroidUIAutomator = attribute(value)
        int val = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
        System.out.print(val);
        */
        /*
        TouchAction t = new TouchAction(driver);
        WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
        t.tap(TapOptions.tapOptions().withElement(ElementOption.element(expandList))).perform();
        driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();

        WebElement pn = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
        t.longPress(LongPressOptions.longPressOptions()
                .withElement(ElementOption.element(pn))
                .withDuration(Duration.ofSeconds(2))).release().perform();

        System.out.println(driver.findElementById("android:id/title").isDisplayed());

        /*
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementById("android:id/edit").sendKeys("Hello");
        driver.findElementById("android:id/button1").click();
        */
    }
}
