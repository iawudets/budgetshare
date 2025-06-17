package com.slycerware.budgetshare;

import org.springframework.boot.SpringApplication;

public class TestBudgetshareApplication {

	public static void main(String[] args) {
		SpringApplication.from(BudgetshareApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
