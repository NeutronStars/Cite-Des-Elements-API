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
package fr.neutronstars.sands_city.api.events;

import fr.neutronstars.sands_city.api.entities.ICustomPlayer;
import fr.neutronstars.sands_city.api.team.ITeam;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

public class ICustomPlayerTransferBankEvent extends ICustomPlayerEvent implements Cancellable
{
    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final ITeam team;

    private long money;
    private boolean cancelled;

    public ICustomPlayerTransferBankEvent(ICustomPlayer player, ITeam team, long money)
    {
        super(player);
        this.team = team;
        this.money = money;
    }

    public ITeam getTeam()
    {
        return team;
    }

    public long getMoney()
    {
        return money;
    }

    public void setMoney(long money)
    {
        this.money = money;
    }

    @Override
    public boolean isCancelled()
    {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled)
    {
        this.cancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers()
    {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
