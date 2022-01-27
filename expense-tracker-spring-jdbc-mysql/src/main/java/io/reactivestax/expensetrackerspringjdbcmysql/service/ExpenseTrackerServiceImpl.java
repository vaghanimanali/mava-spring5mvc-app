package io.reactivestax.expensetrackerspringjdbcmysql.service;

import io.reactivestax.expensetrackerspringjdbcmysql.model.ExpenseTracker;
import io.reactivestax.expensetrackerspringjdbcmysql.repository.ExpenseTrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseTrackerServiceImpl implements ExpenseTrackerService{

    @Autowired
    private ExpenseTrackerRepository expenseTrackerRepository;

    @Override
    public List<ExpenseTracker> getAllExpense() {
        return expenseTrackerRepository.findAll();
    }

    @Override
    public void save(ExpenseTracker expenseTracker) {
        this.expenseTrackerRepository.save(expenseTracker);

    }
}
