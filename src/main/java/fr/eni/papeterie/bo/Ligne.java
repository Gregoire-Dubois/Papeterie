package fr.eni.papeterie.bo;

public class Ligne {
    protected int qte;
    protected  Article article;

    public Ligne(){

    }

    public Ligne(int qte, Article article) {
        this.qte = qte;
        this.article = article;
    }


    public Article getArticle(){
        return this.article;
    }

    public void setQte(int qte){
        this.qte = qte;
    }

    @Override
    public String toString() {
        return "Ligne{" +
                "qte=" + qte +
                ", article=" + article +
                '}';
    }
}
