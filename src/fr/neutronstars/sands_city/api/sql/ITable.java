package fr.neutronstars.sands_city.api.sql;

import java.util.List;

/**
 * Information d'une table de la base de donnée.
 */
public interface ITable
{
    /**
     * Le nom de la table.
     * @return
     */
    String getName();

    /**
     * Le type de moteur de la table. INNODB est conseillé.
     * @return
     */
    String getEngine();


    /**
     * La clef primaire de la table.
     * @return
     */
    IColumn getPrimaryKey();

    /**
     * La list des colonne.
     * @return List<IColumn>
     */
    List<IColumn> getColumns();

    /**
     * Ajoute une nouvelle colonne a la table. (N'oubliez pas de mettre a jour la table avec la methode 'loadTable(ITable table) de ISQLManager !)
     * @param column
     */
    void addColumn(IColumn column);
}
