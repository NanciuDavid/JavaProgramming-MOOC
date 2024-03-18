
public class Books {
private String name = " ";
private int numberOfPages = 0 ;
private int publicationYear = 0 ; 

public Books(String name, int numberOfPages, int publicationYear) {
    this.name = name;
    this.numberOfPages = numberOfPages ;
    this.publicationYear = publicationYear;
}


public String getName() { 
    return this.name;
}

public int numberOfPages (){ 
    return this.numberOfPages;
}

public int publicationYear() {
    return this.publicationYear;
}



}
