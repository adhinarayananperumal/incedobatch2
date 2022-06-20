package com.ibanking.java8concept.functionalinterfaceexp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

class User
{
    String name, role;
    User(String a, String b) {
        name = a;
        role = b;
    }
    String getRole() { return role; }
    String getName() { return name; }    
    public String toString() {
       return "User Name : " + name + ", Role :" + role;
    }
  
    public static void main(String args[])
    {      
        List<User> users = new ArrayList<User>();
        users.add(new User("John", "admin"));
        users.add(new User("Peter", "member"));
        List admins = process(users, (User u) -> u.getRole().equals("admin"));
        System.out.println(admins);
        
        List userList = process(users, (User u) -> u.getName().equals("John"));
        System.out.println(users);
        
        List userListnr = process(users, (User u) -> u.getName().equals("John") && u.getRole().equals("admin"));
        System.out.println(userListnr);
        
        Supplier<Integer> supplier = () -> new Integer((int) (Math.random() * 1000D));

        System.out.println(supplier.get());
    }
  
    public static List<User> process(List<User> users, 
                            Predicate<User> predicate)
    {
        List<User> result = new ArrayList<User>();
        for (User user: users)        
            if (predicate.test(user))            
                result.add(user);
        return result;
    }
    
    
    
    

    
    
    List<User> finduser(List<User> users, String rolename , String userName){
		return users;
    }
    

    
    
}
