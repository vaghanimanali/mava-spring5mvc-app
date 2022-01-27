package io.reactivestax.expensetrackerspringjdbcmysql.service;

import io.reactivestax.expensetrackerspringjdbcmysql.model.ExpenseTracker;

import java.util.List;

public interface ExpenseTrackerService {

    List<ExpenseTracker> getAllExpense();
    void save(ExpenseTracker expenseTracker);

}
