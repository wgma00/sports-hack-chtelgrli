package com.fantasybuddy.user.fuudi;

import java.util.ArrayList;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterUpdates {
	public static String htmlFilePath;
	public static Twitter twitter;
	public static RequestToken requestToken = null;
	public static AccessToken accessToken = null;
	public static String pin;
	public static ConfigurationBuilder cb = new ConfigurationBuilder();
	
	public TwitterUpdates(){
		initTwitter();
	}
	
	public ArrayList<String> returnTweets(String nameToSearch){
		String name = nameToSearch;
		ArrayList<String> tweets = new ArrayList<>();
		try {
			Query query = new Query(name);
		    QueryResult result = twitter.search(query);
		    for (Status status : result.getTweets()) {
		    	tweets.add("@" + status.getUser().getScreenName() 
				       + ": \n" + status.getText());
		    }
		}
		catch (TwitterException te) {
			te.printStackTrace();
		}
		return tweets;
	}
	
	public static void initTwitter(){
		cb.setDebugEnabled(true)
		.setOAuthConsumerKey("nQZ4c9w1beTSPR4fT7HaJ1hGN")
		.setOAuthConsumerSecret(
				"dMXkSXV0FZDGTyQdBOypHxii8Xty8r0QqqGUjwBfozpoSU7m6q")
		.setOAuthAccessToken(
				"3192494632-s3SRp7ZEKLjbgJE3c5eYap8TUyxEOy4mHRFMdJO")
		.setOAuthAccessTokenSecret(
				"6mODPqDKXvOtvSrNNYbaQFGN3MSKR3cmCVAElAI9ZUSZp");
		twitter = new TwitterFactory(cb.build()).getInstance();
	}
}
