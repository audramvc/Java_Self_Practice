package java_day_04_practice;

public class HttpStatusCode {

    public static void main(String[] args) {

        int statusCode = 304;
        String result;

        switch (statusCode){
            case 200 -> result = "OK";
            case 201 -> result = "Created";
            case 202 -> result = "Accepted";
            case 301 -> result = "Moved Permanently";
            case 303 -> result = "See Other";
            case 304 -> result = "Not Modified";
            case 307 -> result = "Temporary Redirect";
            case 400 -> result = "Bad Request";
            case 401 -> result =  "Unauthorized";
            case 403 -> result = "Forbidden";
            case 404 -> result = "Not Found";
            case 410 -> result = "Gone";
            case 500 -> result = "Internal Server Error";
            case 503 -> result = "Service Unavailable";
            default -> result = "Invalid";
        }
        
        System.out.println(result);
    }
}
