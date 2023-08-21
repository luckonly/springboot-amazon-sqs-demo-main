package net.proselyte.awssqsdemo.rest;

import lombok.RequiredArgsConstructor;
import net.proselyte.awssqsdemo.service.NotificationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/notifications")
public class NotificationRestControllerV1 {

    private final NotificationService notificationService;

    @GetMapping("/{uid}")
    public Mono<?> findNotificationByUid(@PathVariable String uid) {
        return notificationService.findNotificationByUid(uid);
    }

}
