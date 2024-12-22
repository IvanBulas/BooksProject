/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ibulas
 */
import java.util.Objects;
public class MainCharacter {
    private int maincharacterId;
    private String maincharacterAlias;
    
    public MainCharacter(int maincharacterId,String maincharacterAlias)
    {
        this.maincharacterId=maincharacterId;
        this.maincharacterAlias=maincharacterAlias;
    }
    public int getmaincharacterId()
    {
        return maincharacterId;
    }
    public void setmainCharacterId(int maincharacterId)
    {
        this.maincharacterId= maincharacterId;
    }
    public String getmaincharacterAlias()
    {
        return maincharacterAlias;
    }
    public void setmaincharacterAlias(String maincharacterAlias)
    {
        this.maincharacterAlias=maincharacterAlias;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this==obj) return true;
        if (obj==null || getClass() != obj.getClass()) return false;
        MainCharacter maincharacter=(MainCharacter)obj;
        return maincharacterId == maincharacter.maincharacterId;
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(maincharacterId);
    }
    @Override
    public String toString()
    {
        return "Main character :"+ maincharacterAlias + " (ID: " + maincharacterId + ")";
    }
}
