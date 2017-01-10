

/**
 * Write a description of class Friend here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Friends
{
    public static void main (String args[])
    {
        //makes profiles
        Person pers1 = new Person("Steve", "151-461-3451");
        Person pers2 = new Person("Kevin", "272-679-0978");
        Person pers3 = new Person("Alex", "334-124-8927");
        Person pers4 = new Person("Nick", "398-063-9372");
        Person pers5 = new Person("Matt", "789-237-3489");
        Person pers6 = new Person("Sam", "389-066-9565");
        Person pers7 = new Person("Ham", "534-674-6993");
        
        //adds the people to friends lsit
        pers1.befriend(pers2);
        
        pers1.befriend(pers3);
        
        pers1.befriend(pers4);
        
        pers1.befriend(pers5);
        
        pers1.befriend(pers6);
        
        pers1.befriend(pers7);
        
        //unfriends the las person rip :'(
        pers1.unfriend(pers7);
       
        //checks to see if a person is on your friends list and displays their info
        Person pers8 = pers1.getFriend("Bob");
        
        System.out.println("\nFriend Name: " + pers8.name);
        System.out.println("\nNumber: " + pers8.number + "\n");
        
        //displays person1's info
        System.out.println(pers1);
    }
}