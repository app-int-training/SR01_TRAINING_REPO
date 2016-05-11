package artistservicev1;

import static org.junit.Assert.*;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class ArtistServiceTest extends FunctionalTestCase {

	@Override
	protected String getConfigFile() {
		return "artist.xml";
	}
	@Test
	public void testArtistForValidInput() throws Exception 
	{
		String serverURL = "http://localhost:9092/api/123456";
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(serverURL);
		httpGet.addHeader("User-Agent", "Mozilla/ 5.0");
		CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
		System.out.println("GET Response Status:: "
				+ httpResponse.getStatusLine().getStatusCode());
		int httpResponseStatus = httpResponse.getStatusLine().getStatusCode();
		assertEquals(200,httpResponseStatus);
		System.out.println("Got successful response from Server, proceeding to assert response data...");
        HttpEntity entity = httpResponse.getEntity();
        String actualoutput = EntityUtils.toString(entity);
        System.out.println("Actual is: "+actualoutput);
        System.out.println("Entity:"+entity); 
        //InputStream is = entity.getContent();
        //String jsonObject = new String(httpResponse.toString());	
	    String expected = "{\"artistId\":\"123456\",\"firstName\":\"Sam\",\"lastName\":\"\",\"artistName\":\"Cooke\",\"receivedDate\":\"2011-05-0611:04:52.0\"}";
	    System.out.println("expected is: "+expected);
	    assertEquals(expected,actualoutput);
	}
}

	