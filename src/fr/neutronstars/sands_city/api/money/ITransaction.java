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

import java.util.UUID;

/**
 * Object de transaction.
 */
public interface ITransaction
{
    /**
     * L'id du joueur qui fait la transaction
     * @return
     */
    UUID getIdPlayer();

    /**
     * Money utilisé pour la transaction.
     * @return
     */
    long getMoney();

    /**
     * Petite description de la raison de la transaction.
     * @return
     */
    String getReason();

    /**
     * Type de transaction.
     * @return
     */
    TransactionType getTransactionType();

    /**
     * La temps en seconde ou la transaction a été faite.
     * @return
     */
    long getTimestamp();

    /**
     * Si la transaction à bien été réussi.
     * @return
     */
    boolean isSuccess();

    MoneyType getMoneyType();

    void setMoneyType(MoneyType moneyType);
}
