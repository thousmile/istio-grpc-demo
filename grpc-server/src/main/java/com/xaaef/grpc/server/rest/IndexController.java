package com.xaaef.grpc.server.rest;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.util.RandomUtil;
import lombok.extern.slf4j.Slf4j;
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


@Slf4j
@RestController
@RequestMapping
public class IndexController {

    @GetMapping("hello")
    public Map<String, String> hello(@RequestParam("name") String name) throws UnknownHostException {
        if ("tom".equals(name)) {
            throw new RuntimeException("名称不能为tom");
        }
        var hostAddress = InetAddress.getLocalHost().getHostAddress();
        var msg = String.format("http grpc-server [%s] ==> %s ==> %s", hostAddress, name, UUID.randomUUID());
        log.info(msg);
        return Map.of(
                "code", String.format("http %s", name),
                "message", msg,
                "time", LocalTime.now().format(DatePattern.NORM_TIME_FORMATTER),
                "date", LocalDate.now().format(DatePattern.NORM_DATE_FORMATTER),
                "dateTime", LocalDateTime.now().format(DatePattern.NORM_DATETIME_FORMATTER),
                "instant", Instant.now().toString(),
                "str", RandomUtil.randomString(20),
                "double1", String.valueOf(RandomUtil.randomDouble(10, 100)),
                "list", String.join(",", RandomUtil.randomEleList(List.of("a", "b", "c", "d", "e", "f", "j", "h"), 3)),
                "map", Map.of(
                        "name", RandomUtil.randomString(5),
                        "age", RandomUtil.randomInt(18, 36)
                ).toString()
        );
    }


}
