package com.gl.fsd.twitter.service;
import com.gl.fsd.twitter.model.Tweet;
import com.gl.fsd.twitter.model.User;
import com.gl.fsd.twitter.service.UserService;
import java.util.*;
import java.util.Map.Entry;

public class UserServiceImplements implements UserService{
	private static Map<Long,User> users = new HashMap<>();
	private static UserServiceImplements userService = new UserServiceImplements();
    public static UserServiceImplements getresult() {
    	return userService;
    }

	private Entry<Long, User> entry;
	private Set<User> userId;
	@Override
	public Set<User> createUser(String username, String firstName, String lastName, String email) {
		// TODO Auto-generated method stub
		User user = new User(username,firstName,lastName,email);
		users.put(user.getId(), user);
		return this.userId;
	}

	@Override
	public User createUser(String userName, String firstName, String lastName, String profileImageUrl,
			String coverImageUrl, String email) {
		// TODO Auto-generated method stub
		User user = new User(userName,firstName,lastName,profileImageUrl,coverImageUrl,email);
		users.put(user.getId(), user);
		return null;
	}

	@Override
	public User updateUser(long userId, User user) {
		// TODO Auto-generated method stub
		User updateduser = findById(userId);
		if(updateduser != null) {
			user.setUpdateDate(new Date());
			users.put(userId, user);
			
			
		}
		
		return updateduser;
	}

	@Override
	public User findById(long userId) {
		// TODO Auto-generated method stub
		return users.get(userId);
	}

	@Override
	public void authenticateUser(String userName, String password) throws Throwable  {
		// TODO Auto-generated method stub
		User user = findUserByUserName(userName);
		try {
			if(user == null) {
				throw new Exception("user does not exist");
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(!password.equals(user.getPassword())){
				throw new Exception("username/password does not match please check");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Set<Tweet> fetchTweetsByUser(long userId) throws Throwable {
		// TODO Auto-generated method stub
		User user = findById(userId);
		if(user == null) {
			throw new Exception("Invalid user");
		}
		return user.getTweet();
	}

	@Override
	public Set<User> suggestUsers(long userId) throws Throwable   {
		// TODO Auto-generated method stub
		if(findById(userId) == null) {
			throw new Exception("Invalid userId ");
		}
		Set<Map.Entry<Long,User>> entries = users.entrySet();
		Set<User> suggestedUsers = new HashSet<>();
		Iterator<Map.Entry<Long, User>> iterator = entries.iterator();		
		User selectedusers = null;
		while(iterator.hasNext()) {
			Map.Entry<Long, User> entry = iterator.next();
			long currentUserId = entry.getKey();
			if(userId == currentUserId)
				continue;
			}
		suggestedUsers.add(entry.getValue());
		
		return suggestedUsers;
	}

	@Override
	public Set<User> fetchFollowersByUserId(long userId) throws Throwable {
		// TODO Auto-generated method stub
		User user = findById(userId);
		if(user == null) {
			throw new Exception("user does not exist");
		}
		
		return user.getFollowes();
	}

	@Override
	public User findUserByUserName(String userName) {
		// TODO Auto-generated method stub
		Set<Map.Entry<Long, User>> entries = users.entrySet();
		Iterator<Map.Entry<Long, User>> iterator = entries.iterator();
		User selectUser = null;
		while(iterator.hasNext()) {
			Map.Entry<Long, User> entry = iterator.next();
			User user = entry.getValue();
			if(user.getUserName().equals(userName)) {
				selectUser = user;
				break;
			}
		}
		return selectUser;
	}

	@Override
	public Set<Tweet> fetchTweetsByFollowers(long userId) throws Throwable {
		// TODO Auto-generated method stub
		User fetchedUser = findById(userId);
		Set<Tweet> tweetByFollowers = new HashSet<>();
		if(fetchedUser == null) {
			throw new Exception("user does fetch followers");
		}
		Set<User> followers = fetchedUser.getFollowes();
		if(!followers.isEmpty()) {
			Iterator<User> followersAre = followers.iterator();
			while(followersAre.hasNext()) {
				User user = followersAre.next();
			    tweetByFollowers.addAll(user.getTweet());	
			}
			
		}
		return tweetByFollowers;
	}

	@Override
	public void follow(User user, User follower) {
		// TODO Auto-generated method stub
		user.addFollower(follower);
	}

	@Override
	public void unFollow(User user, User follower) {
		// TODO Auto-generated method stub
		user.removeFollower(follower);
	}

	@Override
	public void addTweet(long userId, Tweet tweet) {
		// TODO Auto-generated method stub
		User user = findById(userId);
		user.addTweet(tweet);
		
		
		
	}

	@Override
	public void removeTweet(User user, Tweet tweet) {
		// TODO Auto-generated method stub
		User user1 = findById(user.getId());
		user1.removeTweet(tweet);
		
		
		
	}

	@Override
	public Set<Tweet> viewFeed(User user) {
		// TODO Auto-generated method stub
	    User user2 = findById(user.getId());
	    
		return user.getTweet();
	}

	@Override
	public int likes(long tweetid) throws Throwable {
		// TODO Auto-generated method stub
		Set<Map.Entry<Long, User>> entries = users.entrySet();
		Iterator<Map.Entry<Long, User>> iterator = entries.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Long, User> entry = iterator.next();
			User user = entry.getValue();
			Set<Tweet> tweet = user.getTweet();
			Iterator<Tweet> itr = tweet.iterator();
			while(itr.hasNext()){
				Tweet likes =itr.next();
				if(likes.getTweet() == tweetid) {
					likes.setlikes(likes.getlikes()+1);
					return likes.getlikes();
				}
			}
		}
		throw new Exception("tweet id already match");
	}
	

	@Override
	public int comments(long tweetid) {
		
		// TODO Auto-generated method stub
		Set<Map.Entry<Long, User>> entries = users.entrySet();
		Iterator<Map.Entry<Long, User>> iterator = entries.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Long, User> entry = iterator.next();
			User user = entry.getValue();
			Set<Tweet> tweet = user.getTweet();
			Iterator<Tweet> itr = tweet.iterator();
			while(itr.hasNext()){
				Tweet comments =itr.next();
				if(comments.getTweet() == tweetid) {
					comments.setlikes(comments.getlikes()+1);
					return comments.getlikes();
				}
			}
		}
		
	 return 0;	
		
	}

	@Override
	public int shares(long tweetid) {
		// TODO Auto-generated method stub
		Set<Map.Entry<Long, User>> entries = users.entrySet();
		Iterator<Map.Entry<Long, User>> iterator = entries.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Long, User> entry = iterator.next();
			User user = entry.getValue();
			Set<Tweet> tweet = user.getTweet();
			Iterator<Tweet> itr = tweet.iterator();
			while(itr.hasNext()){
				Tweet shares =itr.next();
				if(shares.getTweet() == tweetid) {
					shares.setlikes(shares.getlikes()+1);
					return shares.getlikes();
				}
			}
		}
		
		return 0;
	}

}
