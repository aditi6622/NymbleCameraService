package com.nymble.cameraSystem.listener;

public interface CaptureRequestConsumer {
  /*
  These are the consumers that will consume from both the queues (High and Low priority), and sends it to RequestCaptureService
  to process it further.
  we can use kafka as messaging queue, dependending upon the priority of the event we can have concurrency handled.
  In low priority queue we can have low concurrency and add a delay in processing the request.
  However, in the case of high priority queue we can have high concurrency and no delay in processing the request.
   */
  void consume(String clientId);
}
