package com.xaaef.grpc.util;

import io.grpc.Status;

import java.util.function.Function;
import java.util.function.Supplier;


public class GrpcBreaker {


    public static <T> ResponseWrapper<T> withNull(Supplier<T> fun) {
        return withFallback(fun, null);
    }


    public static <T> ResponseWrapper<T> withFallbackValue(Supplier<T> fun, T fallbackValue) {
        return withFallback(fun, (s) -> fallbackValue);
    }


    public static <T> ResponseWrapper<T> withFallback(Supplier<T> fun, Function<Status, T> fallback) {
        try {
            final var value = fun.get();
            return ResponseWrapper.result(Status.OK, value);
        } catch (Throwable ex) {
            final var status = Status.fromThrowable(ex);
            final var value = fallback.apply(status);
            return ResponseWrapper.result(status, value);
        }
    }


}
