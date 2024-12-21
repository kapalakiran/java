package org.example;



import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class Java11_HttpClient {


        public static void main(String[] args){
            try {
            HttpClient objHttpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://reqres.in/api/users?page=2")).build();
            HttpResponse<String> response = objHttpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("sfs");
            System.out.println(response.body());

            }catch (Exception e){

            }
        }
    }


