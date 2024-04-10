package com.xaaef.grpc.client;

import com.xaaef.grpc.lib.pb.GreeterGrpc;
import com.xaaef.grpc.lib.pb.HelloReply;
import com.xaaef.grpc.lib.pb.HelloRequest;
import com.xaaef.grpc.util.GrpcBreaker;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@Slf4j
@RestController
@RequestMapping
public class GrpcClientController {

    @GrpcClient("istio-grpc-server")
    private GreeterGrpc.GreeterBlockingStub greeterService;


    @Autowired
    private FeignProviderService providerService;


    @GetMapping("/grpc/hello")
    public Map<String, String> sayHello1(@RequestParam("name") String name) {
        var result = GrpcBreaker.withFallback(() -> {
                    return greeterService.sayHello(
                            HelloRequest.newBuilder().setName(name).build()
                    );
                },
                err -> {
                    return HelloReply.newBuilder()
                            .putAllMessage(Map.of("message", err.getDescription()))
                            .build();
                }
        );
        return result.getData().getMessageMap();
    }


    @GetMapping("/rest/hello")
    public Map<String, String> sayHello2(@RequestParam("name") String name) {
        return providerService.sayHello(name);
    }

}
