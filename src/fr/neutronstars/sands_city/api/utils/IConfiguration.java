package fr.neutronstars.sands_city.api.utils;

/**
 * Systeme de configuration en JSON.
 */
public interface IConfiguration
{
    /**
     * Check si le path existe.
     * @param path
     * @return exist
     */
    boolean has(String path);

    /**
     * Recupère la valeur du path.
     * @param path
     * @param <T>
     * @return T
     */
    <T> T get(String path);

    /**
     * Récupère la valeur d'une clef et si celle ci n'est pas trouvé alors value est donné par default.
     * @param path
     * @param value
     * @param <T>
     * @return T ou value
     */
    <T> T getOrSet(String path, T value);

    /**
     * Donner une valeur au path
     * @param path
     * @param value
     */
    void set(String path, Object value);

    /**
     * Sauvegarde la configuration.
     */
    void save();
}
