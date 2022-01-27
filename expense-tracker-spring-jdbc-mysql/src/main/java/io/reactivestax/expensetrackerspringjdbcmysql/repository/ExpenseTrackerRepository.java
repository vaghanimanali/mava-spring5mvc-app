package io.reactivestax.expensetrackerspringjdbcmysql.repository;

import io.reactivestax.expensetrackerspringjdbcmysql.model.ExpenseTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseTrackerRepository extends JpaRepository<ExpenseTracker,Integer> {

}
