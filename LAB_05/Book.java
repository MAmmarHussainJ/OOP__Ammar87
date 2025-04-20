class Book{
String title;
String author;
boolean isAvailable=true;

Book(String title, String author){
this.title=title;
this.author=author;
}
void check(){
System.out.println("check if book is Available or not: "+ isAvailable);
}

void borrowBook(){
if (isAvailable){
isAvailable=false;
System.out.println("Book is Borrowed");
System.out.println("Status: "+ isAvailable);
} 
else{
System.out.println("Book is not Available");
}

}
void returnbook(){
isAvailable=true;
System.out.println("Status: "+ isAvailable);
}
void bookdetails(){
System.out.println("Name of book: "+ title);
System.out.println("Name of Author: "+ author);
}

public static void main(String[] args){
Book b1 = new Book("Do it Today","Dorous forux");
b1.check();
b1.borrowBook();
b1.borrowBook();
b1.returnbook();
b1.check();
b1.bookdetails();
}

}