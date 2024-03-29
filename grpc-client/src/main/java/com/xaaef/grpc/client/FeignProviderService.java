package com.xaaef.grpc.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "k8s-provider",
        url = "${feign.client.provider:http://127.0.0.1:18010}",
        fallbackFactory = FeignProviderFallback.class)
public interface FeignProviderService {

    @GetMapping("hello")
    Map<String, String> sayHello(@RequestParam("name") String name);

}
