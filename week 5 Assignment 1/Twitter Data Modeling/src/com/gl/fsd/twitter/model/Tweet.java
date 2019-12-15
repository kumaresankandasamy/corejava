package com.gl.fsd.twitter.model;

import java.util.Date;
import java.util.List;

public class Tweet {
private final long id;
private String tweeetmessage;
private List<Media> medialurl;
private final Date createdDate;
private static  int idCounter = 50;

class Stats{
	private int likes;
	private int comments;
	private int retweets;
	
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getComments() {
		return comments;
	}
	public void setComments(int comments) {
		this.comments = comments;
	}
	public int getRetweets() {
		return retweets;
	}
	public void setRetweets(int retweets) {
		this.retweets = retweets;
	}
	@Override
	public String toString() {
		return "Stats [likes=" + likes + ", comments=" + comments + ", retweets=" + retweets + "]";
	}
	
}
public Tweet(String tweeetmessage, List<Media> medialurl) {
	super();
	this.id = ++idCounter;
	this.tweeetmessage = tweeetmessage;
	this.medialurl = medialurl;
	this.createdDate = new Date();
}
public String getTweeetmessage() {
	return tweeetmessage;
}
public void setTweeetmessage(String tweeetmessage) {
	this.tweeetmessage = tweeetmessage;
}
public static int getIdCounter() {
	return idCounter;
}
public static void setIdCounter(int idCounter) {
	Tweet.idCounter = idCounter;
}
public long getId() {
	return id;
}
public List<Media>  getMedialurl() {
	return medialurl;
}
public Date getCreatedDate() {
	return createdDate;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result + ((medialurl == null) ? 0 : medialurl.hashCode());
	result = prime * result + ((tweeetmessage == null) ? 0 : tweeetmessage.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Tweet other = (Tweet) obj;
	if (createdDate == null) {
		if (other.createdDate != null)
			return false;
	} else if (!createdDate.equals(other.createdDate))
		return false;
	if (id != other.id)
		return false;
	if (medialurl == null) {
		if (other.medialurl != null)
			return false;
	} else if (!medialurl.equals(other.medialurl))
		return false;
	if (tweeetmessage == null) {
		if (other.tweeetmessage != null)
			return false;
	} else if (!tweeetmessage.equals(other.tweeetmessage))
		return false;
	return true;
}
@Override
public String toString() {
	return "Tweet [id=" + id + ", tweeetmessage=" + tweeetmessage + ", medialurl=" + medialurl + ", createdDate="
			+ createdDate + "]";
}

public int compareTo(Tweet tweet) {
	return this.tweeetmessage.compareTo(tweet.tweeetmessage);
	
}

class Media{
	private MediaType mediaType;
	private String url;
	public Media(MediaType mediaType, String url) {
		super();
		this.mediaType = mediaType;
		this.url = url;
	}
	
	
}
public long getTweet() {
	// TODO Auto-generated method stub
	return this.getTweet();
}
public int getlikes() {
	// TODO Auto-generated method stub
	return this.getlikes();
}
public void setlikes(int i) {
	// TODO Auto-generated method stub
	this.idCounter = i;
}




}
