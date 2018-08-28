package helper;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CommonFunction 
{
	public static void takeScreenshot(String name, TakesScreenshot camera) throws IOException
	{
		byte[] imageBytes = camera.getScreenshotAs(OutputType.BYTES);
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(name));
		out.write(imageBytes);
		out.close();
	}
}
