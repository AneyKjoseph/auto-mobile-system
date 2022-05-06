package com.nissan.automobile.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.automobile.system.client.GroupFeignClient;
import com.nissan.automobile.system.request.GroupCreateRequest;
import com.nissan.automobile.system.response.CommonResponse;

@RestController
@RequestMapping("/feign")
public class GroupController {

	@Autowired
	private GroupFeignClient groupFeignCLient;

	@PostMapping("/create")
	public ResponseEntity<CommonResponse> createGroup(@RequestBody GroupCreateRequest groupCreateRequest) {
		return new ResponseEntity<>(groupFeignCLient.createGroup(groupCreateRequest), HttpStatus.OK);
	}

	@PutMapping("/deactivate/{id}")
	public ResponseEntity<CommonResponse> deactivateGroup(@PathVariable Long id) {
		return new ResponseEntity<>(groupFeignCLient.deactivateGroup(id), HttpStatus.OK);
	}

	@PutMapping("/activate/{id}")
	public ResponseEntity<CommonResponse> activateGroup(@PathVariable Long id) {
		return new ResponseEntity<>(groupFeignCLient.activateGroup(id), HttpStatus.OK);
	}
	
	@PutMapping("/edit/{id}")
	public ResponseEntity<CommonResponse> editGroup(@PathVariable String id,@RequestBody GroupCreateRequest groupCreateRequest) {
		return new ResponseEntity<>(groupFeignCLient.editGroup(id, groupCreateRequest), HttpStatus.OK);
	}

}
