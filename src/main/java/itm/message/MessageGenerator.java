package itm.message;

import javax.inject.Inject;
import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import io.smallrye.reactive.messaging.kafka.Record;

@ApplicationScoped
public class MessageGenerator
{
    @Inject
    @Channel("generated-message")
    Emitter <String> emitter;

    public void generate(String val)
    {
        emitter.send(val);
    }
}