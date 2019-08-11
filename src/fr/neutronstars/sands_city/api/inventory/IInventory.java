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
package fr.neutronstars.sands_city.api.inventory;

import fr.neutronstars.sands_city.api.entities.ICustomPlayer;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.Optional;

public interface IInventory
{
    String getName();

    Optional<? extends IItem> getItem(int slot);

    void addItem(IItem item, int slot);

    void addItem(ItemBuilder builder, int slot);

    void addItem(ItemStack itemStack, int slot);

    boolean is(Inventory inventory);

    Inventory getInventory();

    void removeItem(int slot);

    void clear();

    void updateItems();

    void onClick(ICustomPlayer player, int slot, ClickType clickType);
}
