package com.temporal.workflowsexample;

import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface AccountTransferWorkflow {
  @WorkflowMethod
  void transfer(String fromAccountId, String toAccountId, String referenceId, int amountCents);
}
