package com.nymble.cameraSystem.service;

import com.nymble.cameraSystem.data.request.CaptureRequest;
import com.nymble.cameraSystem.data.response.CameraResponse;

public interface CameraHardwareCluster {
  CameraResponse CaptureImage(CaptureRequest captureRequest) throws RuntimeException;
}
