package io.reactivestax.expensetrackerspringjdbcmysql.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "expenseinfo")
public class ExpenseTracker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "amount")
    private long amount;

    @Column(name = "expense")
    private long expense;

    @Column(name = "description")
    private String description;

    @Column(name = "income")
    private long income;

}
