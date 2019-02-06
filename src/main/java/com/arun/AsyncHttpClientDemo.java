package com.arun;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

public class AsyncHttpClientDemo {

    public static void main(String args[]) {
        AsyncHttpClientDemo demo = new AsyncHttpClientDemo();
        CompletableFuture<HttpResponse<String>> response = demo.ping("http://foo.com");
        response.thenApply(HttpResponse::body)
                .thenAccept(System.out::println).join();
    }

    private CompletableFuture<HttpResponse<String>> ping(String url) {
        HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
    }


}
