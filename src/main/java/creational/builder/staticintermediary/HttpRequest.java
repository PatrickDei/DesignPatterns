package creational.builder.staticintermediary;

import java.util.Map;

public class HttpRequest {

    private String url;
    private String method;
    private Map<String, String> headers;

    private HttpRequest(String url, String method, Map<String, String> headers) {
        this.url = url;
        this.method = method;
        this.headers = headers;
    }

    public static HttpRequestBuilder builder() {
        return new HttpRequestBuilder();
    }

    public static class HttpRequestBuilder {
        private String url;
        private String method;
        private Map<String, String> headers;

        HttpRequestBuilder() {}

        public HttpRequestBuilder url(final String url) {
            this.url = url;
            return this;
        }

        public HttpRequestBuilder method(final String method) {
            this.method = method;
            return this;
        }

        public HttpRequestBuilder headers(final Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this.url, this.method, this.headers);
        }
    }
}
