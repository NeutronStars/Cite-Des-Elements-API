package fr.neutronstars.sands_city.api.entities;

import org.bukkit.entity.Player;

import java.util.List;
import java.util.function.Consumer;

/**
 * Gére la liste des joueurs connecté.
 */

public interface IPlayerManager
{
    List<ICustomPlayer> getPlayers();
    void getPlayers(Consumer<ICustomPlayer> player);
    
    ICustomPlayer getPlayer(Player player);
}
