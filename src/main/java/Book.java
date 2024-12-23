/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ibulas
 */
import java.util.Objects;
//implements Comparable<Book> add to class
public class Book implements Comparable<Book>{
    private Title title;
    private Author author;
    private Genre genre;
    private MainCharacter mainCharacter;
    private int yearPublished; 
    private int bookId;
  
    public Book(Title title,Author author,Genre genre,MainCharacter mainCharacter,int yearPublished,int bookId)
  {
      this.title=title;
      this.author=author;
      this.genre=genre;
      this.mainCharacter=mainCharacter;
      this.yearPublished=yearPublished;
  }  
  public Title getTitle()
  {
      return title;
  }
  public void setTitle(Title title) 
  {
        this.title = title;
  }
  public Author getAuthor()
  {
      return author;
  }
  public void setAuthor(Author author)
  {
      this.author=author;
  }
  public Genre getGenre()
  {
      return genre;
  }
  public void setGenre(Genre genre)
  {
      this.genre=genre;
  }
  public MainCharacter getmainCharacter()
  {
      return mainCharacter;
  }
  public void setmainCharacter(MainCharacter mainCharacter)
  {
      this.mainCharacter=mainCharacter;
  }
  public int getyearPublished()
  {
      return yearPublished;
  }
  public void setyearPublished(int yearPublished)
  {
      this.yearPublished=yearPublished;
  }
  public int getbookId()
  {
      return bookId;
  }
  
  @Override
    public boolean equals(Object obj)
    {
        if (this==obj) return true;
        if (obj==null || getClass() != obj.getClass()) return false;
        Book book=(Book)obj;
        return bookId == book.bookId;
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(bookId);
    }
    @Override
    public String toString()
    {
        return "Title  :"+ title + "Author : "+ author + "(ID: " + bookId + ")";
    }

    @Override
    public int compareTo(Book o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
