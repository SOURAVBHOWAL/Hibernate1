package SocialMediaPlatform;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class User implements Comparable<User>{
	public Integer id;
	public String name;
	TreeSet<User> followers;
	TreeSet<User> followings;
	User(int id,String name){
		this.id=id;
		this.name=name;
		followers=new TreeSet<>();
		followings=new TreeSet<>();
	}
	@Override
	public int compareTo(User user) {
		return this.id.compareTo(user.id);
	}
	public void update(String message,User followee) {
		System.out.println(this.name+" received notification: "+followee.name+" posted: \""+message+"\".");
	}
	public void addFollower(User user) {
		if(!this.followers.contains(user))
			this.followers.add(user);
	}
	public void removeFollower(User user) {
		if(this.followers.contains(user))
			this.followers.remove(user);
	}
	public void notifyFollowers(String message) {
		for(User user:this.followers) {
			user.update(message,this);
		}
	}
	public void post(String content) {
		System.out.println(this.name+" posted: \""+content+"\".");
	}
	public void follow(User user) {
		user.addFollower(this);
	}
	public void unfollow(User user)
	{
		user.removeFollower(this);
	}
}

class Platform{
	HashMap<Integer,User> users=new HashMap<>();
	public void addUser(Integer id, String name) {
		users.put(id,new User(id,name));
		System.out.println(name+" added successfully.");
	}
	public void follow(Integer followerId, Integer followeeId) {
		User follower=users.get(followerId);
		User followee=users.get(followeeId);
		followee.addFollower(follower);
		System.out.println(follower.name+" is now following "+followee.name+".");
		
	}
	public void unfollow(Integer followerId, Integer followeeId) {
		User follower=users.get(followerId);
		User followee=users.get(followeeId);
		followee.removeFollower(follower);
		System.out.println(follower.name+" is now unfollowing "+followee.name+".");
	}
	public void post(Integer userId, String content) {
		User user=users.get(userId);
		user.post(content);
		user.notifyFollowers(content);
	}
}

public class SocialMedia {
	public static void main(String[] args) {
        Platform platform = new Platform();
        // Simulating Sample Input 0 from your photo
        platform.addUser(0, "Alexander");
        platform.addUser(1, "Isabella");
        platform.addUser(2, "Emma");
        
        platform.follow(1, 0); // Isabella follows Alexander
        platform.post(0, "Hiking in the mountains.");// Should print post but no notifications
        platform.follow(2, 0); // Emma follows Alexander
        platform.post(0, "Enjoying a beautiful day!");
        
        platform.unfollow(1, 0);
            }
}
