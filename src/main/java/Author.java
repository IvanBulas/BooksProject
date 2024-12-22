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
    
    public Author(int authorId,String authorName)
    {
        this.authorId = authorId;
        this.authorName=authorName;
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
        return "Author name :"+ authorName + " (ID: " + authorId + ")";
    }
}

