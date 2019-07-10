package com.gl.fsd.twitter.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class User implements Comparable<User>,Serializable{
	private final long id;
	private final String userName;
	private String firstName;
	private String lastName;
	private String password;
	private String profileImageUrl;
	private String coverImageUrl;
	private final UserRole userRole;
	private final String email;
	private static int userIdCount = 50;
	private final Date createdDate;
	private Date updateDate;
	private Set<Tweet> tweets = new HashSet<>();
	private Set<Tweet> following = new HashSet<>();
	private Set<User> followers = new HashSet<>();
	public enum UserRole{
		ADMIN,
		REGULAR_USER
	}
	public User(String userName, String firstName, String lastName, String email) {
		super();
		this.id = ++userIdCount;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userRole = UserRole.REGULAR_USER;
		this.createdDate = new Date();
		this.updateDate = new Date();
	}
	
	public User(String userName, String firstName, String lastName, String profileImageUrl, String coverImageUrl,
			String email) {
		super();
		this.id = ++userIdCount;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profileImageUrl = profileImageUrl;
		this.coverImageUrl = coverImageUrl;
		this.email = email;
		this.userRole = UserRole.REGULAR_USER;
		this.createdDate = new Date();
		this.updateDate = new Date();
	}

	public User(long id, String userName, String firstName, String lastName, String password, String profileImageUrl,
			String coverImageUrl, String userRole, String email, Date createdDate, Date updateDate) {
		super();
		this.id = ++userIdCount;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.profileImageUrl = profileImageUrl;
		this.coverImageUrl = coverImageUrl;
		this.userRole = UserRole.REGULAR_USER;
		this.email = email;
		this.createdDate = new Date();
		this.updateDate = new Date();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfileImageUrl() {
		return profileImageUrl;
	}
	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}
	public String getCoverImageUrl() {
		return coverImageUrl;
	}
	public void setCoverImageUrl(String coverImageUrl) {
		this.coverImageUrl = coverImageUrl;
	}
	public static int getUserIdCount() {
		return userIdCount;
	}
	public static void setUserIdCount(int userIdCount) {
		User.userIdCount = userIdCount;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public long getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public UserRole getUserRole() {
		return userRole;
	}
	public String getEmail() {
		return email;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		User other = (User) obj;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", profileImageUrl=" + profileImageUrl + ", coverImageUrl=" + coverImageUrl
				+ ", userRole=" + userRole + ", email=" + email + ", createdDate=" + createdDate + ", updateDate="
				+ updateDate + "]";
	}
	public int compareTo(User user) {
		return Long.valueOf(this.id).compareTo(user.id);
		
	}

	public Set<Tweet> getTweet() {
		// TODO Auto-generated method stub
		return tweets;
	}

	public Set<User> getFollowes() {
		// TODO Auto-generated method stub
		return followers;
	}

	public void addTweet(Tweet userId) {
		// TODO Auto-generated method stub
		this.tweets.add(userId);
	}

	public void removeTweet(Tweet tweet) {
		// TODO Auto-generated method stub
		this.tweets.remove(tweet);
	}

	public void addFollower(User follower) {
		// TODO Auto-generated method stub
		this.followers.add(follower);
		
	}
	public void removeFollower(User follower) {
		this.followers.remove(follower);
	}

	public int likes() {
		// TODO Auto-generated method stub
		return this.likes();
	}

	public int getcomments() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
