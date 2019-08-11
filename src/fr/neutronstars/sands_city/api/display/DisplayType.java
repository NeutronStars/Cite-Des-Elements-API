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
package fr.neutronstars.sands_city.api.display;

import fr.neutronstars.sands_city.api.team.TeamType;

public enum DisplayType
{
    TEAM("§6§lClassement des équipes", "%1$s: §6%2$s §2Emeraudes"),
    PLAYER("§6§lTOP JOUEURS", "%1$s: §6%2$s §2Emeraudes"),
    FIRE_1("FIRE", "§6Classement de l'équipe "+ TeamType.FIRE.getColor()+ TeamType.FIRE.getName(), "%1$s§f: §6%2$s §2Emeraudes"),
    WIND_1("WIND", "§6Classement de l'équipe "+ TeamType.WIND.getColor()+ TeamType.WIND.getName(), "%1$s§f: §6%2$s §2Emeraudes"),
    WATER_1("WATER", "§6Classement de l'équipe "+ TeamType.WATER.getColor()+ TeamType.WATER.getName(), "%1$s§f: §6%2$s §2Emeraudes"),
    GROUND_1("GROUND", "§6Classement de l'équipe "+ TeamType.GROUND.getColor()+ TeamType.GROUND.getName(), "%1$s§f: §6%2$s §2Emeraudes"),
    FIRE_2("FIRE", "§6Classement de l'équipe "+ TeamType.FIRE.getColor()+ TeamType.FIRE.getName(), "%1$s§f: §6%2$s §2Emeraudes"),
    WIND_2("WIND", "§6Classement de l'équipe "+ TeamType.WIND.getColor()+ TeamType.WIND.getName(), "%1$s§f: §6%2$s §2Emeraudes"),
    WATER_2("WATER", "§6Classement de l'équipe "+ TeamType.WATER.getColor()+ TeamType.WATER.getName(), "%1$s§f: §6%2$s §2Emeraudes"),
    GROUND_2("GROUND", "§6Classement de l'équipe "+ TeamType.GROUND.getColor()+ TeamType.GROUND.getName(), "%1$s§f: §6%2$s §2Emeraudes");

    private final String titleFormat, lineFormat, team;

    DisplayType(String titleFormat, String lineFormat){
        this("", titleFormat, lineFormat);
    }

    DisplayType(String team, String titleFormat, String lineFormat){
        this.team = team;
        this.titleFormat = titleFormat;
        this.lineFormat = lineFormat;
    }

    public String getTeam()
    {
        return team;
    }

    public String getTitleFormat()
    {
        return titleFormat;
    }

    public String getLineFormat()
    {
        return lineFormat;
    }
}
