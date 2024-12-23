/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ibulas
 */
import java.util.Objects;
public class Author {
    private int authorId;
    private String authorName;
    private int birthYear;
    private String nationality;
    public Author(int authorId,String authorName,int birthYear,String nationality)
    {
        this.authorId = authorId;
        this.authorName=authorName;
        this.birthYear=birthYear;
        this.nationality=nationality;
    }
    public int getAuthorId()
    {
        return authorId;
    }
    public void setAuthorId(int authorId)
    {
        this.authorId=authorId;
    }
    public String getAuthorName()
    {
        return authorName;
    }
    public void setAuthorName(String authorName)
    {
        this.authorName=authorName;
    }
    public int getbirthYear()
    {
        return birthYear;
    }
    public void setbirthYear(int birthYear)
    {
        this.birthYear=birthYear;
    }
    public String getNationality()
    {
        return nationality;
    }
    public void setNationality(String nationality)
    {
        this.nationality=nationality;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this==obj) return true;
        if (obj==null || getClass() != obj.getClass()) return false;
        Author author=(Author)obj;
        return authorId == author.authorId;
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(authorId);
    }
    @Override
    public String toString()
    {
        return "Author name :"+ authorName +"Birth year: "+ birthYear +"Nationality : "+ nationality+ "(ID: " + authorId + ")";
    }
}

