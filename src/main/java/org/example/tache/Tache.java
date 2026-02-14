package org.example.tache;

public class Tache {
    private boolean done;
    private String description;


    /**
     * Constructeur par défaut d'une tache
     * Set le status de la tache a false par défaut ( la tache n'est pas réalisé)
     * @param description la description de la tache
     */
    public Tache(String description) {
        this.done = false;
        this.description = description;
    }

    /**
     * Inverse le status de la tache (comme une case à cocher)
     */
    public void setDoneStatus() {
        this.done = !done;
    }

    /**
     * Mettre à jour la description
     * @param description la nouvelle description de la tache
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getDoneStatus() {
        return this.done;
    }

    public String getDescription() {
        return this.description;
    }

    /**
     * Affichage console d'une tache
     * @return affichage console d'une tache avec un formatage
     */
    @Override
    public String toString() {
        return(this.description +  " - Done : " + this.done);
    }
}
