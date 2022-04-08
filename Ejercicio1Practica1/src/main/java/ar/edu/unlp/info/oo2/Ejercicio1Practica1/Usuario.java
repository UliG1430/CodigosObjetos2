package ar.edu.unlp.info.oo2.Ejercicio1Practica1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private List <Tweet> tweets=new ArrayList<Tweet>();
	private String screenName;
	
	public void tweetear (Tweet tweet) {
		if ((tweet.getChars()>0)&&(tweet.getChars()<=140)){
			tweets.add(tweet);
		}
	}
	
	public void retweetear(Tweet tweet) {
		Retweet retweet=new Retweet(tweet);
		tweets.add(retweet);
	}

	public List<Tweet> getTweets() {
		return tweets;
	}

	public void setTweets(List<Tweet> tweets) {
		this.tweets = tweets;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public void eliminarTweets() {
		tweets.removeAll(tweets);
	}
}

	
