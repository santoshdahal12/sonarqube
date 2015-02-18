/*
 * SonarQube, open source software quality management tool.
 * Copyright (C) 2008-2014 SonarSource
 * mailto:contact AT sonarsource DOT com
 *
 * SonarQube is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * SonarQube is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.api.utils.log;

import com.google.common.base.Preconditions;

abstract class LogInterceptor {

  private static LogInterceptor instance = NullInterceptor.NULL_INSTANCE;

  abstract void log(String msg);

  abstract void log(String msg, Object arg);

  abstract void log(String msg, Object arg1, Object arg2);

  abstract void log(String msg, Object... args);

  abstract void log(String msg, Throwable thrown);

  static LogInterceptor instance() {
    return instance;
  }

  static void setInstance(LogInterceptor li) {
    Preconditions.checkArgument(li != null);
    instance = li;
  }
}
