package com.gl.fsd.twitter.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.gl.fsd.twitter.model.Tweet;
import com.gl.fsd.twitter.model.MediaType;
import com.gl.fsd.twitter.model.User;
import com.gl.fsd.twitter.service.UserService;
import com.gl.fsd.twitter.service.UserServiceImplements;

public class Client {
	private static final Scanner sc = null;
	private static final UserService userServiceImplements = null;
	private static User user;
	private static Tweet tweet;



	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/twitter","root","admin");
		PreparedStatement ps=con.prepareStatement("insert into user(id,name) values(?,?)"); 

        
		try {
			ps = con.prepareStatement("insert into user(id,name) values(?,?)");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
			ResultSet rs=ps.executeQuery("select * from emp");
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		 
		
		
	UserService userService = UserServiceImplements.getresult();
	Set<User> userSet = new HashSet<>();
	User user1 =  (User) userService.createUser("@Ram", "Ramkumar", "Bala", "Ram@gmail.com");
	userSet.add(user1);
	Scanner sc = new Scanner(System.in);
	System.out.println("=========== Tweet Interface ==========\r\n" + 
			"1 => Post a Tweet\r\n" + 
			"2 => View external tweet feed\r\n" + 
			"3 => View my Tweets\r\n" + 
			"4 => Like a Tweet\r\n" + 
			"5 => Comment on a tweet\r\n" + 
			"==================================================== ");
	int option = sc.nextInt();
	switch(option){
	case 1:
	{
		Tweet postTweet = posttweet();
		System.out.println("post tweet");
		break;
	}
	case 2:
	{
		Set<Tweet> tweetFeed = externaltweetFeed();
		System.out.println("view tweet feed");
		break;
	}
	case 3:
	{
		Set<Tweet> tweet = viewTweets();
		System.out.println("view tweets");
		break;
	}
	case 4:{
		int likes = tweetlikes();
		System.out.println("like a tweets");
		break;
	}
	case 5:{
		int comments = tweetcomments();
		System.out.println("tweet comments");
		break;
	}
	default:
	{
		System.out.println("please select any options");
	}
	}
	
	
	
	}

	private static int tweetcomments() {
		Object userService = null;
		Object tweetId;
		// TODO Auto-generated method stub
		return ((User) userService).getcomments();
		
	}

	private static int tweetlikes() {
		Object userService = null;
		// TODO Auto-generated method stub
		return ((User) userService).likes();
		
	}

	private static Set<Tweet> viewTweets() {
		// TODO Auto-generated method stub
		UserService userService = null;
		return userService.viewFeed(user);
	}

	private static Set<Tweet> externaltweetFeed() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the username");
		UserService userService = null;
		try {
		return userService.viewFeed(user);}
		catch(Exception e) {
			System.out.println("external feed");
		}
		return null;
	}

	

	private static Tweet posttweet() {
		// TODO Auto-generated method stub
		System.out.println("Please write your tweet");
        try {
		String tweetString = sc.next(); 

		Tweet tweet = new Tweet(tweetString, null);}
        catch(Exception e) {
        	System.out.println("post tweets");
        }
		user.addTweet(tweet);
		return tweet ;
		
	}
	
	
}
