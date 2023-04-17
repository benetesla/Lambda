package br.com.statics;

public class Friend {
    private String name;
    static int numberOfFriends;
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }
    @Override
    public String toString() {
        return "Friend [name=" + name + "]";
    }

}
