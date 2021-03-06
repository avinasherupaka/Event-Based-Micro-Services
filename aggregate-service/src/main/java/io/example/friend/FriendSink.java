package io.example.friend;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.SubscribableChannel;

/**
 * Custom Spring Cloud Stream {@link Sink} binding for processing
 * events from the {@link Friend} channel.
 *
 * @author Avinash Erupaka
 */
public interface FriendSink extends Sink {

    String INPUT = "friend";

    @Input(FriendSink.INPUT)
    SubscribableChannel friend();
}
