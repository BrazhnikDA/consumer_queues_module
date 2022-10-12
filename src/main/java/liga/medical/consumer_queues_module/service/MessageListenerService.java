package liga.medical.consumer_queues_module.service;

import liga.medical.consumer_queues_module.config.RabbitConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageListenerService {

    @RabbitListener(queues = RabbitConfig.DAILY_QUEUE_NAME)
    public void listenDailyQueue(String message) {
        System.out.println("Сообщение: " + message + " получено из очереди " + RabbitConfig.DAILY_QUEUE_NAME);
    }
    @RabbitListener(queues = RabbitConfig.ALERT_QUEUE_NAME)
    public void listenAlertQueue(String message) {
        System.out.println("Сообщение: " + message + " получено из очереди " + RabbitConfig.ALERT_QUEUE_NAME);
    }
    @RabbitListener(queues = RabbitConfig.ERROR_QUEUE_NAME)
    public void listenErrorQueue(String message) {
        System.out.println("Сообщение: " + message + " получено из очереди " + RabbitConfig.ERROR_QUEUE_NAME);
    }
}
