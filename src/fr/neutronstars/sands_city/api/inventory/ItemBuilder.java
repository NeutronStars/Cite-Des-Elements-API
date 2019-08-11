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

import org.bukkit.block.banner.Pattern;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;
import java.util.List;

public interface ItemBuilder
{

    String getName();

    ItemBuilder setName(String name);

    List<String> getLore();

    ItemBuilder setLore(String... lores);

    ItemBuilder setLore(List<String> lore);

    ItemBuilder setData(int data);

    ItemBuilder setDurability(int data);

    ItemBuilder setCount(int count);

    ItemBuilder addEnchant(Enchantment enchantment, int lvl, boolean param);

    ItemBuilder addItemFlags(ItemFlag... flags);

    ItemBuilder removeEnchant(Enchantment enchantment);

    ItemBuilder removeItemFlags(ItemFlag... flags);

    ItemBuilder setOwner(String name);

    ItemBuilder setGlowing(boolean glowing);

    ItemBuilder setUnbreakable(boolean unbreakable);

    ItemBuilder addPattern(Pattern pattern);

    ItemStack toItemStack();

    ItemBuilder clone();

    ItemBuilder give(Collection<? extends Player> players);

    ItemBuilder give(Player... players);

    ItemBuilder give(Player player);

    ItemBuilder give(Collection<? extends Player> players, int slot);

    ItemBuilder give(int slot, Player... players);

    ItemBuilder give(Player player, int slot);
}
