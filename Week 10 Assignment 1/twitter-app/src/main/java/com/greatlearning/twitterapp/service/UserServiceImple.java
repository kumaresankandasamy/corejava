package com.greatlearning.twitterapp.service;



import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.twitterapp.model.Tweet;
import com.greatlearning.twitterapp.model.User;
import com.greatlearning.twitterapp.repository.TweetRepository;
import com.greatlearning.twitterapp.repository.UserRepository;

@Service
@Transactional
public class UserServiceImple implements UserService{
    @Autowired
    UserRepository userRepository;
    @Autowired
    TweetRepository tweetRepository;
	@Override
	public User create(User user) {
		
		return (User) this.userRepository.save(user);
	}

	@Override
	public User save(User user) {
		
		return (User) this.userRepository.save(user);
	}

	@Override
	public User delete(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUser(long userId) {
		Optional<User> optionalUser = this.userRepository.findById(userId);
		if(optionalUser.isPresent()) {
			return optionalUser.get();
		}
		return null;
	}

	@Override
	public Tweet addTweet(long userId, Tweet tweet) {
		
		Optional<User> userOptional = this.userRepository.findById(userId);
        if(userOptional.isPresent()){
            User user = userOptional.get();
             user.addTweet(tweet);
        }
		return tweet;
		
	}

	@Override
	public Tweet deleteTweet(Tweet tweet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Tweet> getAllTweets(long userId) {
		Optional<User> userOptional = this.userRepository.findById(userId);
        if(userOptional.isPresent()){
            User user = userOptional.get();
            return user.getTweets();
        }
        return null;
	}

	@Override
	public User follow(long userId, long followingId) {
		return null;
	}

	@Override
	public Set<User> getAllFollowings(long userId) {
		Optional<User> userOptional = this.userRepository.findById(userId);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return user.getFollowings();
        }
        return null;
	}

	@Override
	public User unFollow(long UserId, long followingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<User> getAllFollowers(long userId) {
		 Optional<User> userOptional = this.userRepository.findById(userId);
	        if (userOptional.isPresent()) {
	            User user = userOptional.get();
	            return user.getFollowers();
	        }
	        return null;

	}
	@Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

	@Override
	public User updateUser(User user){
	   this.userRepository.save(user);
	   return user;
	}

	@Override
	public User delete(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
