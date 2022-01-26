import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 * This class creates and displays the message of the day.
 * @author Bryony Hughes
 * @version 1.4
 */
public class MessageOfTheDay {

	public static String response; //The encrypted string

	/**
	 * The main method is used to call the class and
	 * call the methods within the class.
	 */
    public static void main(String args[]) {

        try {
            String response = sendGet("http://cswebcat.swan.ac.uk/puzzle");
            System.out.println(response);
            String result = decrypt(response);
            System.out.println(result);
            String finalResult = sendGet("http://cswebcat.swan.ac.uk/message?solution="+result);
            System.out.println(finalResult);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * This class will retrieve an encrypted string from a URL.
     * @param url - The URL of the website.
     * @return The encrypted string
     */
    public static String sendGet(String url) throws Exception {

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        BufferedReader in = new BufferedReader(
            new InputStreamReader(con.getInputStream()));

        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }

        in.close();
        return response.toString();

    }

    /**
     * This method will decrypt the encrypted string.
     * @param response - The encrypted string
     * @return The decrypted string
     */
    public  static String decrypt(String response) {

        List<String> letterList = Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
        String s = "";
        int len = response.length();
        for(int x = 0; x < len; x++){
            String c = Character.toString(response.charAt(x));
            int index = letterList.indexOf(c);
            if(x % 2 == 0) {
                if (index == 25) {
                    index = 0;
                } else {
                    index += 1;
                }
                s += letterList.get(index);
            } else {
                if (index == 0) {
                    index = 25;
                } else {
                    index -= 1;
                }
                s += letterList.get(index);
            }
        }

        return s;

    }
}
