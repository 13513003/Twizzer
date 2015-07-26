package StringMatching;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class GetTweet {
    private final static Scanner scanner = new Scanner(System.in);

    public void Run(String search) throws JSONException, IOException {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("Gkr9iZwYDALZ16OdxMp5rubBH")
                .setOAuthConsumerSecret("nhEwYFfiX5qp90sLLwO2eeYMxLwb3WC120lgihrocZDPWRNcUK")
                .setOAuthAccessToken("94107100-572UpcOkkz9kMWGaJS8YFsIGdlmJAd2cDw8y9rOnA")
                .setOAuthAccessTokenSecret("ST0XtXUjYgYWKHryL2feNM0VcDQQAgrov2V7nB7hq1xBC");
        /*.setHttpProxyHost("cache.itb.ac.id")
        .setHttpProxyPort(8080)
        .setHttpProxyUser("jonathan.benedict")
        .setHttpProxyPassword("rollingonthefloor");*/
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        JSONObject obj = new JSONObject();
        int counterTweet = 0;
        FileWriter file = new FileWriter("C:\\bin\\input.txt");
        file.flush();
       
        try {
            Query query = new Query(search.toLowerCase()).lang("en").lang("id");
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    counterTweet++;
                    //System.out.println("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                    obj.put("tweets", tweet.getText()  );
                    obj.put("user",tweet.getUser().getScreenName()  );
                    
                    //Tulis file ke dalam txt

                    try {
                        file.write( obj.toString());
                        //System.out.println("Successfully Copied JSON Object to File...");
                        //System.out.println("\nJSON Object: " + obj);

                    } catch (IOException e) {
                        e.printStackTrace();

                    }
                }
            } while (counterTweet < 85);

            file.close();
        } catch (TwitterException te) {
            te.printStackTrace();
            //System.out.println("Failed to search tweets: " + te.getMessage());
        }
    }    
}
