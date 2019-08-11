package fr.neutronstars.sands_city.api.team;

/**
 * Liste des teams
 */
public enum TeamType
{
    WATER("Eau", "§2§9", true, false),
    FIRE("Feu", "§1§4", true, false),
    WIND("Air", "§3§d", true, false),
    GROUND("Terre", "§4§6", true, false),

    ORGANIZER("Orga", "§0§3", false, true),

    SPECTATOR("Spect", "§5§7", false, false);

    private final String name, color;
    private final boolean player, admin;

    TeamType(String name, String color, boolean player, boolean admin)
    {
        this.name = name;
        this.color = color;
        this.player = player;
        this.admin = admin;
    }

    public String getName()
    {
        return name;
    }

    public String getColor()
    {
        return color;
    }

    public String getPrefix()
    {
        return color+"["+name+"] ";
    }

    public String getSuffix()
    {
        return "§f";
    }

    public boolean isPlayerTeam()
    {
        return player;
    }

    public boolean isAdmin() {
        return admin;
    }
}
