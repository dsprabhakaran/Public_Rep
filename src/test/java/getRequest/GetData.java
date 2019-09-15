package getRequest;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetData {

	@Test	
	public void testResponseCode()
	{
		Response resp = get("https://samples.openweathermap.org/data/2.5/weather?q=Baton%20Rouge,US&appid=b6907d289e10d714a6e88b30761fae22");
		int code = resp.getStatusCode();
		System.out.println("Status code is "+code);
		Assert.assertEquals(code, 200);
	}

	@Test	
	public void testResponseData()
	{
		Response resp = get("https://samples.openweathermap.org/data/2.5/weather?q=Baton%20Rouge,US&appid=b6907d289e10d714a6e88b30761fae22");
		String data = resp.asString();
		System.out.println("Data is "+data);
		System.out.println("Response time "+resp.getTime());
	}
}
