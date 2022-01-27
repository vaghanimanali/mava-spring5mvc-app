package io.reactivestax.expensetrackerspringjdbcmysql.controller;

import io.reactivestax.expensetrackerspringjdbcmysql.model.ExpenseTracker;
import io.reactivestax.expensetrackerspringjdbcmysql.service.ExpenseTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class ExpenseTrackerController {

    @Autowired
    private ExpenseTrackerService expenseTrackerService;

    //creating method handler for home page(new_expense.html) to display list of expense
    //spring boot auto config view resolver for Thymeleaf
    //display list of expense tracker
    @GetMapping("/expenseTracker")
    public String viewHomePage(Model model) {
        model.addAttribute("listExpense",expenseTrackerService.getAllExpense());
        return "expense_list";
    }

    @GetMapping("/showNewExpenseForm")
    public String showNewExpenseForm(Model model){
        //create Model attribute to bind form data
        ExpenseTracker expenseTracker = new ExpenseTracker();
        model.addAttribute("expenseTracker",expenseTracker);
        return "new_expense";
    }

    @PostMapping("/saveExpense")
    public String saveExpenseTracker(@ModelAttribute("expenseTracker") ExpenseTracker expenseTracker){
        expenseTrackerService.save(expenseTracker);
        return "redirect:/expenseTracker";
    }
}
