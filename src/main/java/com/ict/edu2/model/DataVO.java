package com.ict.edu2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataVO {
  private boolean success;
  private String message;
  private Object data;
}
