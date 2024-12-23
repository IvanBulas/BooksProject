/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ibulas
 */
import java.util.Objects;
public class Users {
    private int userId;
    private String username;
    private char[] password;
   
    public Users(int userId,String username,char[] password)
    {
        this.userId=userId;
        this.username=username;
        this.password=password;
    }
    
    public int getId()
    {
        return userId;
    }
    public void setId(int userId)
    {
        this.userId=userId;
    }
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username=username;
    }
    public char[] getPassword()
    {
        return password;
    }
    public void setPassword(char[] password)
    {
        this.password=password;
    }
            
     @Override
    public boolean equals(Object obj)
    {
        if (this==obj) return true;
        if (obj==null || getClass() != obj.getClass()) return false;
        Users user=(Users)obj;
        return userId == user.userId;
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(userId);
    }
    @Override
    public String toString()
    {
        return "Username  :"+ username + " (ID: " + userId + ")";
    }
    
 }
