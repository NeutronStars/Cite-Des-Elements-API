package fr.neutronstars.sands_city.api.entities;

import fr.neutronstars.sands_city.api.inventory.IInventory;
import fr.neutronstars.sands_city.api.team.ITeam;
import fr.neutronstars.sands_city.api.zone.House;
import fr.neutronstars.sands_city.api.zone.ZoneArea;

import java.util.Optional;
import java.util.UUID;

/**
 * Permet de stoquer les donnée du joueur et d'interagir avec.
 */
public interface ICustomPlayer
{
    /**
     * Récupère l'identifiant unique d'un joueur.
     * @return uuid
     */
    UUID getUniqueId();

    /**
     * Récupere le nom du joueur.
     * @return name
     */
    String getName();

    /**
     * Récupère la team du joueur.
     *
     * @return iTeam
     */
    ITeam getTeam();

    Optional<ZoneArea> getZoneArea();

    void setZoneArea(ZoneArea zoneArea);

    Optional<House> getHouse();

    void setHouse(House house);

    Optional<IInventory> getInventory();

    void setInventory(IInventory inventory);

    /**
     * Sauvegarder les données du joueur dans la base de donnée.
     */

    boolean hasCyberNeutronSecurity();

    void setCyberNeutronSecurity(boolean cyberNeutronSecurity);

    void save();
}
