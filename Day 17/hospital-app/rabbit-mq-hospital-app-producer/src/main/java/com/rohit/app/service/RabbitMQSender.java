package com.rohit.app.service;

import com.rohit.app.model.Hospital;
import com.rohit.app.model.Patient;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {
  @Autowired
  private AmqpTemplate rabbitTemplate;

  @Value("${rabbitmq.exchange.name}")
  private String exchange;

  @Value("${rabbitmq.routingkey.name}")
  private String routingkey;

  public void send(Hospital hospital) {
    rabbitTemplate.convertAndSend(exchange, routingkey, hospital);
    System.out.println("Send msg = " + hospital);
  }

  public void sendP(Patient patient){
    rabbitTemplate.convertAndSend(exchange,routingkey, patient);
    System.out.println("data send : " + patient);
  }
}
