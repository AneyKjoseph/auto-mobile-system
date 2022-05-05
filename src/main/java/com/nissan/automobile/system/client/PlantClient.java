package com.nissan.automobile.system.client;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("PlantClient")
public interface PlantClient {

}
