package com.example.demo.category3;


@Service
public class ApiService {

    @Value("${api.base.url}")
    private String baseUrl;

    @Value("${api.timeout}")
    private int timeout;

    public String getApiInfo() {
        return "Base URL: " + baseUrl + ", Timeout: " + timeout + "ms";
    }
}
