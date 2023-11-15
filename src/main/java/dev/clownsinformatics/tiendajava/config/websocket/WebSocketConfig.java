package dev.clownsinformatics.tiendajava.config.websocket;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(webSocketProductHandler(), "/ws/product");
        registry.addHandler(webSocketCategoryHandler(), "/ws/category");
        registry.addHandler(webSocketSupplierHandler(), "/ws/suppliers");
        registry.addHandler(webSocketEmployeeHandler(), "/ws/employee");
        registry.addHandler(webSocketClientHandler(), "/ws/clients");
    }

    @Bean
    public WebSocketHandler webSocketSupplierHandler() {
        return new WebSocketHandler("Suppliers");
    }

    @Bean
    public WebSocketHandler webSocketProductHandler() {
        return new WebSocketHandler("Product");
    }

    @Bean
    public WebSocketHandler webSocketCategoryHandler() {
        return new WebSocketHandler("Category");
    }


    @Bean
    public WebSocketHandler webSocketEmployeeHandler() {
        return new WebSocketHandler("Employee");
    }

    //ws://localhost:8080/ws/clients
    @Bean
    public WebSocketHandler webSocketClientHandler() {
        return new WebSocketHandler("Client");
    }

}