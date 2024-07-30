package com.nymble.cameraSystem.data.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ClientResponse {
  private final String clientId;
  private final String requestId;
}
