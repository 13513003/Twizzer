/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * All code and works here are created by Satria Priambada and team
 * You are free to use and distribute the code
 * We do not take responsibilities for any damage caused by using this code
 */
package tiofortwitter;

import java.io.FileWriter;
import java.io.IOException;
import twitter4j.*;

import java.util.List;
import java.util.Scanner;
import sun.rmi.runtime.Log;
import twitter4j.auth.RequestToken;
import twitter4j.conf.ConfigurationBuilder;
/**
 *
 * @author Satria
 */
public class TioForTwitter {
    private final static Scanner scanner = new Scanner(System.in);


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JSONException, IOException {
        
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("Gkr9iZwYDALZ16OdxMp5rubBH")
                .setOAuthConsumerSecret("nhEwYFfiX5qp90sLLwO2eeYMxLwb3WC120lgihrocZDPWRNcUK")
                .setOAuthAccessToken("94107100-572UpcOkkz9kMWGaJS8YFsIGdlmJAd2cDw8y9rOnA")
                .setOAuthAccessTokenSecret("ST0XtXUjYgYWKHryL2feNM0VcDQQAgrov2V7nB7hq1xBC");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        JSONObject obj = new JSONObject();
        int counterTweet = 0;
        FileWriter file = new FileWriter("Users\\user\\IdeaProjects\\TwitterStringMatching\\input.txt");
        file.flush();        
        try {
            Query query = new Query("Satria");
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    counterTweet++;
                    System.out.println("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                    obj.put("user",tweet.getUser().getScreenName()  );
                    obj.put("tweets", tweet.getText()  );
                    
                    //Tulis file ke dalam txt
                    
                    try {
                        file.write( obj.toString());
                        System.out.println("Successfully Copied JSON Object to File...");
                        System.out.println("\nJSON Object: " + obj);

                    } catch (IOException e) {
                        e.printStackTrace();

                    }
                }
            } while (counterTweet < 1000);

            file.close();
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
            System.exit(-1);
        }
        System.exit(0);
    }
}
