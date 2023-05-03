package fr.eni.papeterie.bo;

public abstract class Article {

    private int idArticle;
    private String reference;
    private String marque;
    private String designation;
    private Float prixUnitaire;
    private int qteStock;

    // constructeurs

    public Article(){

    }
    public Article(int idArticle, String reference, String marque, String designation, Float prixUnitaire, int qteStock) {
        this.idArticle = idArticle;
        this.reference = reference;
        this.marque = marque;
        this.designation = designation;
        this.prixUnitaire = prixUnitaire;
        this.qteStock = qteStock;
    }

    public Article(String reference, String marque, String designation, Float prixUnitaire, int qteStock) {
        this.reference = reference;
        this.marque = marque;
        this.designation = designation;
        this.prixUnitaire = prixUnitaire;
        this.qteStock = qteStock;
    }

    // Getter

    public int getIdArticle() {
        return idArticle;
    }

    public String getReference() {
        return reference;
    }

    public String getMarque() {
        return marque;
    }

    public String getDesignation() {
        return designation;
    }

    public Float getPrixUnitaire() {
        return prixUnitaire;
    }

    public int getQteStock() {
        return qteStock;
    }


    // setter


    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrixUnitaire(Float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }

    @Override
    public String toString() {
        return "Article{" +
                "idArticle=" + idArticle +
                ", reference='" + reference + '\'' +
                ", marque='" + marque + '\'' +
                ", designation='" + designation + '\'' +
                ", prixUnitaire=" + prixUnitaire +
                ", qteStock=" + qteStock +
                '}';
    }
}
