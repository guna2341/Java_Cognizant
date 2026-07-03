package org.example;

public class MyService {

    final private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String getData() {
        return externalApi.getData();
    }

}
