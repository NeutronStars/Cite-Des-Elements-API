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

import org.bukkit.Location;

import java.util.List;
import java.util.Optional;

public interface HouseManager
{

    List<House> getHousesByZone(String zone);

    List<House> getHousesByName(String name);
    Optional<House> getHouse(String zone, String name);

    Optional<House> getHouseByLocation(String parent, Location location);

    Optional<House> getHouseBySignLocation(String parent, Location location);

    Optional<House> createHouse(ZoneArea parent, ZoneArea zoneArea, String name, Location sign);

    void removeHouse(House house);
}
