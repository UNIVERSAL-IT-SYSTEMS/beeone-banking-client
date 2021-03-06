/*
 * Copyright (C) 2012 BeeOne GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package at.beeone.netbankinglight.api.model;

import java.util.Date;
import java.util.Set;

public interface Transaction {

	public abstract String getId();

	public abstract Account getAccount();

	public abstract TransactionType getType();

	public abstract Date getCreatedOn();

	public abstract Long getAmount();

	public abstract Set<String> getTags();

	public abstract String getNotes();

	public abstract Boolean isFinished();

	public abstract Boolean isCancelled();

	public abstract String getBill();

	public abstract Date getCarryOutDate();

	public abstract String getCustomerData();

	public abstract String getIdentification();

	public abstract String getPurpose();

	public abstract String getReceiverIban();

	public abstract String getReceiverReference();

	public abstract String getReceiverName();

	public abstract String getRecord();

	public abstract String getSenderIban();

	public abstract String getSenderName();

	public abstract String getSignature();

	public abstract TransactionStatus getStatus();

	void setAmount(Long amount);

	void setReceiverName(String receiverName);
	
	void setReceiverReference(String receiverReference);

	void setReceiverIban(String receiverIban);

	void setCarryOutDate(Date carryOutDate);

	void setPurpose(String purpose);

	void setFinished(boolean finished);

	void setIdentification(String identification);

}