package com.xaaef.grpc.server.rest;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;


@RestController
@RequestMapping
public class IndexController {

    @GetMapping("hello")
    public Map<String, String> hello(@RequestParam("name") String name) throws UnknownHostException {
        if ("tom".equals(name)) {
            throw new RuntimeException("名称不能为tom");
        }
        var hostAddress = InetAddress.getLocalHost().getHostAddress();
        var msg = String.format("Hello grpc-server [%s] ==> %s ==> %s", hostAddress, name, UUID.randomUUID());
        return Map.of(
                "code", String.format("http %s -> %s", name, name),
                "message", msg,
                "time", LocalTime.now().format(DatePattern.NORM_TIME_FORMATTER),
                "date", LocalDate.now().format(DatePattern.NORM_DATE_FORMATTER),
                "dateTime", LocalDateTime.now().format(DatePattern.NORM_DATETIME_FORMATTER),
                "instant", Instant.now().toString(),
                "str", RandomUtil.randomString(20),
                "double1", String.valueOf(RandomUtil.randomDouble(10, 100)),
                "list", List.of("a", "b", "c").toString(),
                "map", Map.of("name", "jack", "age", 26).toString()
        );
    }


}
