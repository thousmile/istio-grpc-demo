package com.xaaef.grpc.server;

import com.google.protobuf.util.JsonFormat;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.http.converter.protobuf.ProtobufJsonFormatHttpMessageConverter;


@Slf4j
@SpringBootApplication
public class GrpcServerApplication {


    public static void main(String[] args) {
        SpringApplication.run(GrpcServerApplication.class, args);
    }


    @Bean
    public ProtobufHttpMessageConverter protobufHttpMessageConverter() {
        return new ProtobufHttpMessageConverter();
    }


    @Bean
    public ProtobufJsonFormatHttpMessageConverter protobufJsonFormatHttpMessageConverter() {
        final var JSON_PRINTER = JsonFormat.printer()
                .includingDefaultValueFields()
                .printingEnumsAsInts();
        final var JSON_PARSER = JsonFormat.parser();
        return new ProtobufJsonFormatHttpMessageConverter(JSON_PARSER, JSON_PRINTER);
    }


}
