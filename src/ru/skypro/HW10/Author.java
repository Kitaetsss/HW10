package ru.skypro.HW10;

import java.util.Objects;

public class Author{
    private final String AuthorName;
    public Author(String AuthorName){
        this.AuthorName = AuthorName;
    }
    public String getAuthorName(){
        return AuthorName;
    }
    public String toString(){
        return "Автор " + this.AuthorName;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(AuthorName, author.AuthorName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(AuthorName);
    }
}
