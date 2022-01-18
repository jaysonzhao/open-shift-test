package cn.jiarong.service.openshift.reactor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/test")
public class ReactorController {

    @GetMapping("/helloWorld/{id}")
    public Mono<String> helloWorld(@PathVariable("id") Long id){  //1
        return Mono.just(id + "hello world_" + System.currentTimeMillis()); //2
    }
}
