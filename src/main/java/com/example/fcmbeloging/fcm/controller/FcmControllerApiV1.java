package com.example.fcmbeloging.fcm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fcmbeloging.fcm.dto.ReqFcmNotificationDTO;
import com.example.fcmbeloging.fcm.service.FcmServiceApiV1;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/fcm")
public class FcmControllerApiV1 {

    @Autowired
    // 추후 작성 예정
    private FcmServiceApiV1 fcmServiceApiV1;

    @PostMapping("/sendNotification")
    // DTO 작성 예정
    public ResponseEntity<?> sendNotification(@Valid @RequestBody ReqFcmNotificationDTO dto){
        
        // 테스트로 한 번 찍어본다.
        System.out.println("테스트 : "+dto.getNotification().getToken());
        System.out.println("테스트 : "+dto.getNotification().getTitle());
        System.out.println("테스트 : "+dto.getNotification().getBody());

        // 추후 작성 예정인 fcmServiceApiV1의 sendNotification 함수를 호출하여 그대로 반환한다.
        return fcmServiceApiV1.sendNotification(dto);
    }
    
}
