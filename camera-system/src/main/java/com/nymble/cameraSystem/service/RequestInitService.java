package com.nymble.cameraSystem.service;

import com.nymble.cameraSystem.data.request.CaptureRequest;
import com.nymble.cameraSystem.data.response.ClientResponse;

public interface RequestInitService {
  /*
     generates the requestId for the client request,
     saves it in the database and returns the response.
     Fowards the request to the PrioritisationService.
   */
  ClientResponse handleRequest(CaptureRequest request);
}
