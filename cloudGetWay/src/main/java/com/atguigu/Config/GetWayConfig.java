package com.atguigu.Config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GetWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route(r->r.path("/guonei")
                .uri("http://news.baidu.com/guonei/")
                )
                .build();
        routes.route("guowai",r->r.path("guowai").uri("http://news.baidu.com/guoji")).build();
        return  routes.build();
    }
}
