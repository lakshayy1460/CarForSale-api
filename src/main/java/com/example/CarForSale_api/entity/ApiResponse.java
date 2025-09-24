package com.example.CarForSale_api.entity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiResponse<T> {

    private final boolean success;
    private final String message;
    private final T content;

    public static <T> ResponseEntity<ApiResponse<T>> buildResponse(T content) {
        return buildResponse(content, null, HttpStatus.OK);

    }

    public static <T> ResponseEntity<ApiResponse<T>> buildResponse(T content, HttpStatus status) {
        return buildResponse(content, null, status);
    }

    public static <T> ResponseEntity<ApiResponse<T>> buildResponse(T content, String message, HttpStatus status) {
        ApiResponse<T> body = ApiResponse.<T>builder()
                .success(status.is2xxSuccessful())
                .content(content)
                .message(message)
                .build();

        return ResponseEntity.status(status).body(body);
    }

    public static <T> ResponseEntity<ApiResponse<T>> buildError(String message, HttpStatus status) {
        return ResponseEntity.status(status)
                .body(ApiResponse.<T>builder()
                        .success(false)
                        .content(null)
                        .message(message)
                        .build());
    }

    public static <T> ApiResponse<T> buildError(String message) {
        return ApiResponse.<T>builder()
                .success(false)
                .content(null)
                .message(message)
                .build();
    }
}
