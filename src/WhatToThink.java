import java.util.ArrayList;

/**
 * Main class of the application
 * 
 * @author FONSECA Patrick
 *
 */

public class WhatToThink {

	public static void main(String[] args) {
		String topic = "ICCT20WC";
		ArrayList<String> tweets = TweetManager.getTweets(topic);
		NLP.init();
		for(String tweet : tweets) {
			System.out.println(tweet + " : " + NLP.findSentiment(tweet));
		}
	}
}