package fr.neutronstars.sands_city.api.sql;

/**
 * Les information d'une colonne.
 */
public interface IColumn
{
    /**
     * Nom de la colonne.
     * @return name
     */
    String getName();

    /**
     * La commande sql complete pour créer la colonne.
     * @return
     */
    String getCommand();

    /**
     * Le nom de sa table.
     * @return
     */
    String getTableName();

    /**
     * true si la colonne a la clef primaire.
     * @return primary
     */
    boolean isPrimary();
}
