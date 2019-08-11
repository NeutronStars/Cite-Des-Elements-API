package fr.neutronstars.sands_city.api.team;

import fr.neutronstars.sands_city.api.entities.ICustomPlayer;
import fr.neutronstars.sands_city.api.utils.MessageBuilder;

import java.util.List;

/**
 * Gestion des teams de la cité.
 */
public interface ITeam
{
    /**
     * Recupère le type de la team.
     * @return teamType
     */
    TeamType getType();

    /**
     * Nom de la team
     * @return name
     */
    String getName();

    /**
     * Les emeraudes enregistrer a la team.
     * @return
     */
    long getMoney();

    /**
     * Retourne le nombre rééle de joueur dans la team.
     */
    int getSize();

    /**
     * Prefix de la team.
     * @return prefix
     */
    String getPrefix();

    /**
     * Suffix de la team
     * @return suffix
     */
    String getSuffix();

    /**
     * Liste des joueurs dans la team.
     * @return list
     */
    List<ICustomPlayer> getPlayersOnline();

    /**
     * Nombre de joueur dans la team.
     * @return count
     */
    int getPlayerCount();

    /**
     * Check si le joueur fait partie de la team.
     * @param player
     * @return boolean
     */
    boolean hasPlayer(ICustomPlayer player);

    /**
     * Check si la team est une team de joueur.
     * @return boolean
     */
    boolean isPlayerTeam();

    void sendMessage(MessageBuilder messageBuilder);
}
