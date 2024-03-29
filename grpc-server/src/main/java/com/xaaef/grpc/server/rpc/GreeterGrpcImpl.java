package com.xaaef.grpc.server.rpc;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.util.RandomUtil;
import com.xaaef.grpc.lib.pb.GreeterGrpc;
import com.xaaef.grpc.lib.pb.HelloReply;
import com.xaaef.grpc.lib.pb.HelloRequest;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.core.env.Environment;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;


/**
 * <p>
 * </p>
 *
 * @author WangChenChen
 * @version 1.0.1
 * @date 2021/11/9 17:03
 */


@Slf4j
@GrpcService
@AllArgsConstructor
public class GreeterGrpcImpl extends GreeterGrpc.GreeterImplBase {

    private final Environment env;

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        String port = env.getProperty("server.port");
        var msg = String.format("Hello grpc-server [%s] ==> %s ==> %s", port, request.getName(), UUID.randomUUID());
        log.info("reply: {}", msg);
        var reply = HelloReply.newBuilder().putAllMessage(
                Map.of(
                        "code", String.format("grpc %s -> %s", request.getName(), request.getName()),
                        "message", msg,
                        "time", LocalTime.now().format(DatePattern.NORM_TIME_FORMATTER),
                        "date", LocalDate.now().format(DatePattern.NORM_DATE_FORMATTER),
                        "dateTime", LocalDateTime.now().format(DatePattern.NORM_DATETIME_FORMATTER),
                        "instant", Instant.now().toString(),
                        "str", RandomUtil.randomString(20),
                        "double1", String.valueOf(RandomUtil.randomDouble(10, 100)),
                        "list", List.of("a", "b", "c").toString(),
                        "map", Map.of("name", "jack", "age", 26).toString()
                )
        ).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }


}
