/**
 * Copyright 2018 LinkedIn Corporation. All rights reserved. Licensed under the BSD-2 Clause license.
 * See LICENSE in the project root for license information.
 */
package com.linkedin.tony.rpc;


/**
 * Contains the name, index, and URL for a task.
 */
public class TaskUrl {
  private final String name;   // The name (worker or ps) of the task
  private final String index;  // The index of the task
  private final String url;    // The URL where the logs for the task can be found

  public TaskUrl(String name, String index, String url) {
    this.name = name;
    this.index = index;
    this.url = url;
  }

  public String getName() {
    return name;
  }

  public String getIndex() {
    return index;
  }

  public String getUrl() {
    return url;
  }
}
