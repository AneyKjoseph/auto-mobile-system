package com.nissan.automobile.system.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nissan.automobile.system.request.GroupCreateRequest;
import com.nissan.automobile.system.response.CommonResponse;

@FeignClient(value = "groupFeign" , url = "http://localhost:8080/group")
public interface GroupFeignClient {
	
	@PostMapping(value = "/createGroup")
    public CommonResponse createGroup(@RequestBody GroupCreateRequest createRequest);
	
	@PutMapping(value = "/deactivateGroup/{id}")
	public CommonResponse deactivateGroup(@PathVariable Long id);
	
	@PutMapping(value = "/activateGroup/{id}")
	public CommonResponse activateGroup(@PathVariable Long id);
	
	@PutMapping(value = "/editGroup/{id}")
    public CommonResponse editGroup(@PathVariable String id, @RequestBody GroupCreateRequest createRequest);
}
