/*
 * Copyright (C) 2010 SonarSource SA
 * All rights reserved
 * mailto:contact AT sonarsource DOT com
 */
package com.sonar.sslr.dsl.bytecode;

public interface ProcedureDefinition extends Instruction {

  public String getProcedureName();

}