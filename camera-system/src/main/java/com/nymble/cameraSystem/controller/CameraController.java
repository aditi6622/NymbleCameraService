package com.nymble.cameraSystem.controller;

import com.nymble.cameraSystem.data.request.CaptureRequest;
import com.nymble.cameraSystem.data.response.ClientResponse;
import com.nymble.cameraSystem.service.RequestInitService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("camera")
@RequestMapping("/camera_system/v1")
@RequiredArgsConstructor
public class CameraController {
  private final RequestInitService requestInitService;

  @PostMapping("/capture")
  public ClientResponse capture(@RequestBody CaptureRequest request) {
    return requestInitService.handleRequest(request);
  }
}
