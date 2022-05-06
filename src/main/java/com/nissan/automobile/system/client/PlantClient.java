package com.nissan.automobile.system.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("PlantClient")
public interface PlantClient {

}
