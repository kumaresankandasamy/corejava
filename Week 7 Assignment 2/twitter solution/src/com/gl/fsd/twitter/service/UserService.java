package com.gl.fsd.twitter.service;

import java.util.Set;

import com.gl.fsd.twitter.model.Tweet;
import com.gl.fsd.twitter.model.User;


public interface UserService {
	
	Set<User> createUser(String username,String firstName,String lastName,String email);
	User createUser(String userName, String firstName, String lastName, String profileImageUrl, String coverImageUrl,
			String email);
	User updateUser(long userId, User user);
	User findById(long userId);
	void authenticateUser(String userName,String password) throws Throwable;
	Set<Tweet> fetchTweetsByUser(long userId) throws Throwable;
	Set<User> suggestUsers(long userId) throws Throwable;
	Set<User> fetchFollowersByUserId(long userId) throws Throwable;
	User findUserByUserName(String userName);
	Set<Tweet> fetchTweetsByFollowers(long userId) throws Throwable;
	void follow(User user,User follower);
	void unFollow(User user,User follower);
	void addTweet(long userId,Tweet tweet);
	void removeTweet(User user,Tweet tweet);
	Set<Tweet> viewFeed(User user);
	int likes(long tweetid) throws Throwable;
	int comments(long tweetid);
	int shares(long tweetid);
	
	

}
