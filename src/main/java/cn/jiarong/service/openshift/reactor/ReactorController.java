package cn.jiarong.service.openshift.reactor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/test")
@Slf4j
public class ReactorController {

    @GetMapping("/helloWorld/{id}")
    public Mono<String> helloWorld(@PathVariable("id") Long id){  //1
        String str = id + " hello world_" + System.currentTimeMillis();
        log.info(str);
        return Mono.just(str); //2
    }
}
