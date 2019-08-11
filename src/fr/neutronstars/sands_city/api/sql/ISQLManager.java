package fr.neutronstars.sands_city.api.sql;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 * Cette class permet d'effectuer divers action avec la base de donnée.
 */
public interface ISQLManager
{
    /**
     * Ce connecter à la base de donnée.
     * @return boolean
     */
    boolean connect();

    /**
     * Ce déconnecter à la base de donnée.
     */
    void disconnect();

    /**
     * Ce reconnecter à la base de donnée.
     */
    void reconnect();
    
    /**
     * Récuperer une donnée stocké dans la base de donnée.
     * @param query
     * @param objects
     * @return resultSet
     */
    ResultSet getResult(String query, Object... objects);

    /**
     * Récupère les colonnes ou autre donnée interne d'une table.
     * @param tableName
     * @return
     */
    ResultSetMetaData getResultMetaData(String tableName);

    /**
     * Mets a jour la base de donnée.
     * @param query
     * @param objects
     */
    void execute(String query, Object... objects);

    /**
     * Libere la resources du thread SQL en fermant les donnée récupéré.
     * @param resultSet
     */
    void close(ResultSet resultSet);

    /**
     * Charge une table dans la base de donnée en la créant s'il n'existe pas ou bien en la met à jour.
     * @param table
     */
    void loadTable(ITable table);
}
