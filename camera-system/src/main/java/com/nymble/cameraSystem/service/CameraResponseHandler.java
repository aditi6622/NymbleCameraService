package com.nymble.cameraSystem.service;

import com.nymble.cameraSystem.data.response.CameraResponse;

public interface CameraResponseHandler {
  /*
  Handles the response from camera hardware cluster, puts it into queue for client to consume,
  takes care of further storage, processing and observability.
  All the caching mechanisms are also handled here.
   */
  void handleResponse(CameraResponse response);
}
