/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ibulas
 */
import java.util.Objects;
public class Genre {
    private int genreId;
    private String genreType;
    
    public Genre(int genreId,String genreType)
    {
        this.genreId=genreId;
        this.genreType=genreType;
    }
    public int getgenreId()
    {
        return genreId;
    }
    public void setgenreId(int genreId)
    {
        this.genreId=genreId;
    }
    public String getgenreType()
    {
        return genreType;
    }
    public void setgenreType(String genreType)
    {
        this.genreType=genreType;
    }
     @Override
    public boolean equals(Object obj)
    {
        if (this==obj) return true;
        if (obj==null || getClass() != obj.getClass()) return false;
        Genre genre=(Genre)obj;
        return genreId == genre.genreId;
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(genreId);
    }
    @Override
    public String toString()
    {
        return "Genre type :"+ genreType + " (ID: " + genreId + ")";
    }
}
