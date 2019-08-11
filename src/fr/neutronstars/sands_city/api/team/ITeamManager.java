package fr.neutronstars.sands_city.api.team;

import fr.neutronstars.sands_city.api.entities.ICustomPlayer;
import org.bukkit.scoreboard.Scoreboard;

import java.util.Collection;

/**
 * Permet de gérer la liste des teams.
 */
public interface ITeamManager
{
    /**
     * Recupère le scoreboard spécial.
     * @return scoreboard
     */
    Scoreboard getScoreboard();

    /**
     * Recupère la liste des teams enregistré
     * @return teams
     */
    Collection<ITeam> getTeams();

    /**
     * Recupère la team.
     * @param teamType
     * @return iTeam
     */
    ITeam getTeam(TeamType teamType);

    /**
     * Récupère la team par defaut.
     * @return
     */
    ITeam getDefaultTeam();

    /**
     * Ajoute un joueur a une team.
     * @param teamType
     * @param player
     */
    public boolean addPlayer(TeamType teamType, ICustomPlayer player);

    /**
     * Retirer un joueur a une team et l'ajoute à la Team par defaut.
     * @param player
     */
    public boolean removePlayer(ICustomPlayer player);
}
