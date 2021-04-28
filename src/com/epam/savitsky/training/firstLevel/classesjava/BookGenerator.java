package com.epam.savitsky.training.firstLevel.classesjava;

public class BookGenerator{

    public Book[] getCatalogBook() {
    Book[] arrayBook = new Book[20];
    arrayBook[0]= new Book(1, "War and peace", "Tolstoi", "Classic", 1980, 900, 400, "Hard");
    arrayBook[1] = new Book(2, "The Master and Margarita", "Bylgakov", "Classic", 1998, 500, 230, "Hard");
    arrayBook[2] = new Book(3, "Pugachev", "Esenin", "USSRIzdat", 1984, 230, 120, "Soft");
    arrayBook[3] = new Book(4, "451 degrees Fahrenheit", "Chehov", "MoskoyIzdat", 2009, 290, 210, "Hard");
    arrayBook[4] = new Book(5, "Anna Karenina", "Tolstoi", "Classic", 1984, 340, 236, "Hard");
    arrayBook[5] = new Book(6, "Borodino", "Lermontov", "MoskoyIzdat", 2006, 70, 27, "Soft");
    arrayBook[6] = new Book(7, "Poems", "Lermontov", "ClassicPoems", 1982, 250, 189, "Hard");
    arrayBook[7] = new Book(8,"Dog's heart", "Bylgakov", "USSRIzdat", 2010, 270, 139, "Soft");
    arrayBook[8] = new Book(9, "The Martian Chronicles", "Bredberi", "MoskoyIzdat", 2009, 340, 254, "Hard");
    arrayBook[9] = new Book(10, "Stories", "Chehov", "Classics", 1988, 280, 298, "Hard");
    arrayBook[10] = new Book(11, "Cossacks", "Tolstoi", "MoskoyIzdat", 2005, 300, 100, "Soft");
    arrayBook[11] = new Book(12, "Ward №6", "Chehov", "USSRIzdat", 1983, 239, 176, "Soft");
    arrayBook[12] = new Book(13, "Poems", "Esenin", "ClassicPoems", 2005, 97, 55, "Soft");
    arrayBook[13] = new Book(14, "Plays", "Chehov", "Patriot", 2004, 395, 275, "Hard");
    arrayBook[14] = new Book(15, "Dandelion Wine", "Bredberi", "MoskoyIzdat", 2014, 255, 196, "Hard");
    arrayBook[15] = new Book(16, "Сhestnut", "Chehov", "Patriot", 2001, 211, 159, "Soft");
    arrayBook[16] = new Book(17, "Confession", "Tolstoi", "Patriot", 1985, 250, 80, "Hard");
    arrayBook[17] = new Book(18, "About love","Chehov", "USSRIzdat", 1985, 329, 249, "Hard");
    arrayBook[18] = new Book(19, "Angel", "Lermontov", "ClassicPoems", 1999, 80, 33, "SOft");
    arrayBook[19] = new Book(20, "Poems and prose","Esenin", "ClassicPoems", 2001, 260, 198, "Hard");
        return arrayBook;
    }

}
