package Network;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
public class Network {
		private final String USER_AGENT = "Macbook";
	
	public static void main(String[] args) throws Exception {
		Network http = new Network();
		System.out.println("Test 1");
		http.sendGet();
		
	}

	

	private void sendGet() throws Exception {
		
		// TODO Auto-generated method stub
		String url = "http://10.2.217:5000/bored";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
	int responseCode = con.getResponseCode();
	System.out.println("\nSending 'GET' request to URL : " + url);
	System.out.println("Response Code : " + responseCode);
	BufferedReader in = new BufferedReader(
	        new InputStreamReader(con.getInputStream()));
	String inputLine;
	StringBuffer response = new StringBuffer();

	while ((inputLine = in.readLine()) != null) {
		response.append(inputLine);
		in.close();

		//print result
		System.out.println(response.toString());
	}
	
	}
}		 


