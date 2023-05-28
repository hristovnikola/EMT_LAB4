package mk.ukim.finki.emt.sharedkernel.domain.infra;

import mk.ukim.finki.emt.sharedkernel.domain.events.DomainEvent;

public interface DomainEventPublisher {
    void publish(DomainEvent event);
}
