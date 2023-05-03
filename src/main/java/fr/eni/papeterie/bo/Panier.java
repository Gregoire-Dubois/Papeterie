package fr.eni.papeterie.bo;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    private float montant;
    private List<Ligne> lignesPanier;

    public Panier(){
        lignesPanier = new ArrayList<Ligne>();
    }

    public Panier(float montant) {
        this.montant = montant;
    }

    public List<Ligne> getLignesPanier() {
        return lignesPanier;
    }

    public float getMontant(){
        return montant;

    }

    public void addLigne(Article article, int qte){
        Ligne ligne = new Ligne(qte, article);
        lignesPanier.add(ligne);
    }

    public Ligne getLigne(int index){
        return lignesPanier.get(index);
    }


    public void updateLigne(int index, int newQte){
        this.getLigne(index).setQte(newQte);
    }

    public void removeLigne(int index){
        this.lignesPanier.get(index);
    }

    @Override
    public String toString() {
        return "Panier{" +
                "montant=" + montant +
                ", lignesPanier=" + lignesPanier +
                '}';
    }
}
