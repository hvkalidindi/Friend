/**
 * Ham Kalidindi
 */
import java.text.NumberFormat;
import java.util.*;

public class Person
{
   //initializes
   public String name, number, friends = "", friendnumbers = "";
   private int unfriended_count = 0;
   
   //class takes a name and phone number to make a new Person object
   public Person (String name, String number)
   {
      this.name = name;
      this.number = number;
   }
   
   //adds someone as a friend
   public void befriend(Person P) 
   {
       friends += P.name + " ";
       friendnumbers += P.number + " ";
       System.out.println("You added " + P.name + " to your friends list. ");
   }
   
   //delets a friend from the name and number lists
   public void unfriend (Person P) 
   {
       friends = friends.replace(" " + P.name + " ", " ");
       friendnumbers = friendnumbers.replace(" " + P.number + " ", " "); 
       unfriended_count += 1;
       System.out.println("You have removed " + P.name + " from your friends list. ");
   }
   
   //returns list of friend names
   public String getFriendNames() 
   {
       return friends;
   }
   
   //returns list of friend numbers
   public String getFriendNumbers() 
   {
       return friendnumbers;
   }
   
   //searches for certain Person as your friend and returns the name + number
   public Person getFriend(String name) 
   {
       int space_count1 = 0, space_count2 = 0, index = 0, position;
       String find = friends, word = "", name1 = "", number = "", number1 = "";
       boolean error1 = true, error2 = true;
       
       //checks for their name in friends
       for (int i = 0 ; i != friends.length()-1 ; i++) 
       {
           char check = friends.charAt(i);
           word += String.valueOf(check);
           if (check == ' ')
           {
               space_count1++;
               if (word.substring(0,word.length()-1).equals(name))
               {
                   name1 = word;
                   error1 = false;
                   break;
               }
               find = friends.substring(i+1);
               word = "";
           }
       }
       
       //finds number
       for (int i = 0 ; i != friendnumbers.length() - 1 ; i++) 
       {
           char check = friendnumbers.charAt(i);
           number += Character.toString(check);
           if (check == ' ')
           {
               space_count2++;
               if (space_count2 == space_count1)
               {
                   number1 = number;
                   error2 = false;
                   break;
               }
               find = friendnumbers.substring(i);
               number = "";
           }     
       }
       
       if (error1 == false && error2 == false)
       {
           return new Person(name1, number1);
       }
       else
       {
           return new Person("Error!", "You have not added " + name + " as a friend yet. ");
       }
   }
   
   //finds the number of friends
   public int getFriendCount()
   {
       int index = 0, friendcount = 0; 
       String find = friends;
       for (; index != -1; friendcount++)
       {
           find = find.substring(index + 1);
           index = find.indexOf(" ");
       }
       friendcount -= unfriended_count;
       return friendcount;
   }
  
   public String toString ()
   {
      return (name + "'s Account: [" + this.getFriendCount() + " friend(s)]" + "\nNames: " + friends + "\nNumbers: " + friendnumbers);
   }
}
