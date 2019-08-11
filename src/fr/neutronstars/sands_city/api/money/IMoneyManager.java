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
package fr.neutronstars.sands_city.api.money;

import fr.neutronstars.sands_city.api.entities.ICustomPlayer;
import fr.neutronstars.sands_city.api.team.ITeam;
import fr.neutronstars.sands_city.api.team.TeamType;

import java.util.Collection;

/**
 * Systeme de transaction de money.
 */
public interface IMoneyManager
{
    /**
     * Récupère toutes les transactions d'un joueur
     * @param player
     * @return collection de transaction
     */
    Collection<? extends ITransaction> getTransactions(ICustomPlayer player);

    /**
     * Récupère toutes les transactions des joueurs d'une team.
     * @param teamType
     * @return collection de transaction.
     */
    Collection<? extends ITransaction> getTransactions(TeamType teamType);

    /**
     * Créer une nouvelle instance de transaction.
     * @param money
     * @param reason
     * @param type
     * @return iTransaction
     */
    ITransaction newTransaction(TransactionType type, String reason, long money);

    /**
     * Créer une nouvelle instance de transaction.
     * @param reason
     * @param type
     * @return iTransaction
     */
    ITransaction newTransaction(TransactionType type, String reason);

    /**
     * Execute la transaction et la return.
     * @param player
     * @param transaction
     * @param team (Attention cette objet peut-être null, si la transaction n'est pas un transfert d'emeraude à la team.)
     * @return param transaction
     */
    ITransaction apply(ICustomPlayer player, ITransaction transaction, ITeam team);
}
