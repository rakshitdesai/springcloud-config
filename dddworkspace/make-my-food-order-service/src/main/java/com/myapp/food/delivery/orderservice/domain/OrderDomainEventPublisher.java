package com.myapp.food.delivery.orderservice.domain;

import com.myapp.food.delivery.orderservice.api.events.OrderDomainEvent;

import io.eventuate.tram.events.aggregates.AbstractAggregateDomainEventPublisher;
import io.eventuate.tram.events.publisher.DomainEventPublisher;

public class OrderDomainEventPublisher extends AbstractAggregateDomainEventPublisher<Order, OrderDomainEvent> {


  public OrderDomainEventPublisher(DomainEventPublisher eventPublisher) {
    super(eventPublisher, Order.class, Order::getId
    );
  }

}
