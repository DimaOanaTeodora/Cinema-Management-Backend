package com.backend.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.cinema.model.Broadcast;

public interface BroadcastRepository extends JpaRepository<Broadcast, Integer> {

	/*
	 * // 1. query from method name List<BankAccount> findByType(BankAccountType
	 * type);
	 * 
	 * //2. JPQL - queries on entities
	 * 
	 * @Query("select avg(ba.balance) from BankAccount ba where ba.type = :type")
	 * double getAverageBalance(BankAccountType type);
	 * 
	 * @Query(nativeQuery = true, value =
	 * "select avg(ba.balance) from bankaccounts ba where ba.type = :type") double
	 * getAverageBalanceWithNativeQuery(BankAccountType type);
	 * 
	 * //3. native query
	 * 
	 * @Modifying
	 * 
	 * @Query(nativeQuery = true, value =
	 * "update bankaccounts ba set ba.balance = ba.balance + :amount where ba.id = :id"
	 * ) void modifyBalance(double amount, long id);
	 */
}
