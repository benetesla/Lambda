package br.com.statics;

public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("John");
        Friend friend2 = new Friend("Mary");
        Friend friend3 = new Friend("Peter");
        System.out.println(Friend.numberOfFriends);
        System.out.println(friend1 +  " " + friend2 + " " + friend3);
    }
}
