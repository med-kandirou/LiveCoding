package dto;

public class book {
    private String isbn;
    private String titre;
    private String auteur;

    private static book instance;

    private book(){}


    public static book getInstance(){
        if(instance==null)
        {
            instance = new book();
        }
        return instance;
    }
    private book(String isbn,String titre, String auteur){
        this.isbn=isbn;
        this.titre=titre;
        this.auteur=auteur;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
}
