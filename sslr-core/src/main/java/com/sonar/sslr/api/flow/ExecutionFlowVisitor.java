/*
 * Copyright (C) 2010 SonarSource SA
 * All rights reserved
 * mailto:contact AT sonarsource DOT com
 */

package com.sonar.sslr.api.flow;

public abstract class ExecutionFlowVisitor<STATEMENT extends Statement> {

  public void start() {
  }

  public void visitStatement(STATEMENT stmt) {
  }

  public void visitMandatoryBranches() {
  }

  public void visitBranch(Branch branch) {
  }

  public void leaveBranch(Branch branch) {
  }

  public void leaveMandatoryBranches() {
  }

  public void endPath() {
  }

  public void stop() {
  }
}
