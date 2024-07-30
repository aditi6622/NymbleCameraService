package com.nymble.cameraSystem.data.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CaptureRequest {
  private final String clientId;
}
