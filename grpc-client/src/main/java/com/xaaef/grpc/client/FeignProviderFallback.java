package com.xaaef.grpc.client;

import cn.hutool.core.util.StrUtil;
import feign.FeignException;
import feign.RetryableException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class FeignProviderFallback implements FallbackFactory<FeignProviderService> {

    @Override
    public FeignProviderService create(Throwable cause) {
        var msg = StrUtil.format("[ FeignProviderService ] grpc-server 服务不可用: {}", cause.getMessage());
        log.error(msg);
        return new FeignProviderService() {
            @Override
            public Map<String, String> sayHello(String name) {
                return Map.of("message", msg);
            }
        };
    }

}
