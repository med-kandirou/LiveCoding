import dto.book;
import implimentation.bookImp;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        book b=book.getInstance(); //DTO
        bookImp bookImp= new bookImp(); //DAO

        System.out.print("ISBN :");
        b.setIsbn(scanner.next());
        System.out.print("titre :");
        b.setTitre(scanner.next());
        System.out.print("Auteur :");
        b.setAuteur(scanner.next());

        bookImp.add(b);


    }
}