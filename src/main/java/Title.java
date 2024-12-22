/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ibulas
 */
import java.util.Objects;
public class Title {
    private String titlename;
    private int titleId;
    
    public Title(String titlename,int titleId)
    {
    this.titlename= titlename;
    this.titleId= titleId;
    }
    public int getTitleId()
    {
       return titleId;
    }
    public void setTitleId(int titleId)
    {
        this.titleId = titleId;
    }
    public String getTitleName()
    {
        return titlename;
    }
    public void setTitleName(String titlename)
    {
        this.titlename=titlename;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this==obj) return true;
        if (obj==null || getClass() != obj.getClass()) return false;
        Title title=(Title)obj;
        return titleId == title.titleId;
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(titleId);
    }
    @Override
    public String toString()
    {
        return "Title :"+ titlename + " (ID: " + titleId + ")";
    }
}
