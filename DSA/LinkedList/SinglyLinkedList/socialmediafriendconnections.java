package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

import java.util.ArrayList;
import java.util.HashSet;

class FriendConnectionManager {
    private User head; // Head of the linked list

    // Add user to the network
    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newUser;
        }
    }

    // Find user by User ID
    private User findUserById(int userId) {
        User current = head;
        while (current != null) {
            if (current.userId == userId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Add friend connection between two users
    public void addFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!user1.friendIds.contains(userId2)) {
            user1.friendIds.add(userId2);
        }
        if (!user2.friendIds.contains(userId1)) {
            user2.friendIds.add(userId1);
        }
        System.out.println("Friend connection added between User " + userId1 + " and User " + userId2);
    }

    // Remove friend connection between two users
    public void removeFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        user1.friendIds.remove(Integer.valueOf(userId2));
        user2.friendIds.remove(Integer.valueOf(userId1));

        System.out.println("Friend connection removed between User " + userId1 + " and User " + userId2);
    }

    // Display all friends of a user
    public void displayFriends(int userId) {
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + " (User ID: " + userId + "):");
        if (user.friendIds.isEmpty()) {
            System.out.println("No friends.");
            return;
        }
        for (int friendId : user.friendIds) {
            User friend = findUserById(friendId);
            if (friend != null) {
                System.out.println(" - " + friend.name + " (User ID: " + friend.userId + ")");
            }
        }
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        HashSet<Integer> set = new HashSet<>(user1.friendIds);
        ArrayList<Integer> mutualFriends = new ArrayList<>();

        for (int friendId : user2.friendIds) {
            if (set.contains(friendId)) {
                mutualFriends.add(friendId);
            }
        }

        System.out.println("Mutual friends between User " + userId1 + " and User " + userId2 + ":");
        if (mutualFriends.isEmpty()) {
            System.out.println("No mutual friends.");
        } else {
            for (int friendId : mutualFriends) {
                User friend = findUserById(friendId);
                if (friend != null) {
                    System.out.println(" - " + friend.name + " (User ID: " + friend.userId + ")");
                }
            }
        }
    }

    // Search user by User ID or Name
    public void searchUser(String key) {
        boolean found = false;
        User current = head;
        while (current != null) {
            if (String.valueOf(current.userId).equals(key) || current.name.equalsIgnoreCase(key)) {
                displayUser(current);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("User not found.");
        }
    }

    // Count number of friends for each 
	
    public void countFriends() {
        User current = head;
        while (current != null) {
            System.out.println(current.name + " (User ID: " + current.userId + ") has " + current.friendIds.size() + " friends.");
            current = current.next;
        }
    }

    // Helper method to display user details
    private void displayUser(User user) {
        System.out.println("User ID: " + user.userId);
        System.out.println("Name: " + user.name);
        System.out.println("Age: " + user.age);
        System.out.println("Number of Friends: " + user.friendIds.size());
        System.out.println("-----------------------------------");
    }
}

package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

public class Main {
	public static void main(String[] args) {
        FriendConnectionManager manager = new FriendConnectionManager();

        // Adding sample users
        manager.addUser(1, "Ayush", 25);
        manager.addUser(2, "Anubhav", 28);
        manager.addUser(3, "Divanshu", 22);
        manager.addUser(4, "Prakash", 27);
        manager.addUser(5, "Utkarsh", 24);

        // Adding friend connections
        manager.addFriendConnection(1, 2);
        manager.addFriendConnection(1, 3);
        manager.addFriendConnection(2, 3);
        manager.addFriendConnection(2, 4);
        manager.addFriendConnection(4, 5);

        System.out.println("\nDisplaying Friends of User 2:");
        manager.displayFriends(2);

        System.out.println("\nFinding Mutual Friends between User 1 and User 2:");
        manager.findMutualFriends(1, 2);

        System.out.println("\nSearching for user with name 'Divanshu':");
        manager.searchUser("Divanshu");

        System.out.println("\nCounting number of friends for all users:");
        manager.countFriends();

        System.out.println("\nRemoving Friend Connection between User 2 and User 3:");
        manager.removeFriendConnection(2, 3);
        manager.displayFriends(2);
    }
}

package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

import java.util.ArrayList;

class User {
    int userId;
    String name;
    int age;
    ArrayList<Integer> friendIds; // Stores Friend IDs
    User next; // Pointer to next user in the linked list

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}