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
package fr.neutronstars.sands_city.api.utils;

import fr.neutronstars.sands_city.api.IElementCity;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;

public interface MessageBuilder
{
    PlayerType BUKKIT = (player, builder)->{
            if(player instanceof Player)
                ((Player) player).spigot().sendMessage(builder.build());
    };

    PlayerType BUNGEECORD = (player, builder) -> {
        try {
            player.getClass().getDeclaredMethod("sendMessage", BaseComponent[].class).invoke(player, builder.build());
        }catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            IElementCity.getSandsCity().getLogger().log(Level.SEVERE, e.getMessage(), e);
        }
    };

    interface PlayerType
    {
        void sendMessage(Object player, MessageBuilder builder);
    }

    MessageBuilder next(String text);

    MessageBuilder next(ChatColor color, String text);

    MessageBuilder nextln(String text);

    MessageBuilder nextln(ChatColor color, String text);

    MessageBuilder setColor(ChatColor color);

    MessageBuilder setBold(boolean bold);

    MessageBuilder setItalic(boolean italic);

    MessageBuilder setUnderlined(boolean underlined);

    MessageBuilder setStrikethrough(boolean strikethrough);

    MessageBuilder setObfuscated(boolean obfuscated);

    MessageBuilder setClick(ClickEvent.Action action, String value);

    MessageBuilder setClick(int index);

    MessageBuilder setHover(String text);

    MessageBuilder setHover(TextComponent text);

    MessageBuilder setHover(HoverEvent event);

    MessageBuilder setHover(int index);

    MessageBuilder addExtra(MessageBuilder builder);

    MessageBuilder addExtra(BaseComponent[] components);

    MessageBuilder addExtra(List<BaseComponent> components);

    MessageBuilder addExtra(BaseComponent component);

    BaseComponent[] build();

    void sendPlayer(PlayerType playerType, Object player);

    void sendPlayers(PlayerType playerType, Collection<Object> players);
}
