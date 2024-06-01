package cn.raindropair.controller;

import cn.raindropair.easysocket.message.MessageBody;
import cn.raindropair.easysocket.message.MessageSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test")
    public String sendMsg(@RequestParam("key") String key, @RequestParam("msg") String msg, @RequestParam("bizType") String bizType){
        MessageBody response = MessageSender.send(bizType, msg, key);
        System.out.println(response.toString());
        return "success";
    }
}
