/**
 * Copyright 2019 NeutronStars
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.neutronstars.sands_city.api.zone;

import fr.neutronstars.sands_city.api.entities.ICustomPlayer;
import fr.neutronstars.sands_city.api.team.ITeam;
import fr.neutronstars.sands_city.api.team.TeamType;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.json.JSONObject;

import java.util.Optional;

public interface ZoneArea
{
    String getName();

    boolean isInZone(Location location);

    ZoneType getType();

    void addZone(ZoneArea zoneArea);
    void removeZone(ZoneArea zoneArea);

    boolean isOwner(ICustomPlayer player);
    boolean isOwner(ITeam team);

    JSONObject toJSONObject();

    void setBuy(boolean buy);
    boolean canBuy();

    Optional<TeamType> getTeamType();
    void setTeamType(TeamType teamType);

    void teleport(Player player);

    Optional<Location> getLocationTeleport();

    boolean canPVP();

    boolean canPVP(Location location);

    boolean canBuild();

    void setCanBuild(boolean canBuild);

    boolean isSpleef();

    void setSpleef(boolean spleef);

    int getSpleefHeight();

    void setSpleefHeight(int spleefHeight);
}
