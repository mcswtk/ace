package org.mcswtk;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class ResponseEnvelope {
  private String ViewName;
  private Map<String, Object> viewData;
}
