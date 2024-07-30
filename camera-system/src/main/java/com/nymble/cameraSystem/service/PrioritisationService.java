package com.nymble.cameraSystem.service;

import com.nymble.cameraSystem.data.request.CaptureRequest;

public interface PrioritisationService {
  /*
  This will determine the priority of the request based on the request, and put it into the designated queue
   */
  void determinePriority(CaptureRequest request);
}
