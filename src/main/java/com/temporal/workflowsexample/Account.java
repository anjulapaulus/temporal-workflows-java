package com.temporal.workflowsexample;

import io.temporal.activity.ActivityInterface;

@ActivityInterface
public interface Account {
    void deposit(String accountId, String referenceId, int amountCents);

    void withdraw(String accountId, String referenceId, int amountCents);
}
