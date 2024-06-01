package cn.raindropair.controller;

import cn.raindropair.constants.BizCon;
import cn.raindropair.dto.DateDto;
import cn.raindropair.dto.LongDataDto;
import cn.raindropair.easysocket.message.MessageBody;
import cn.raindropair.easysocket.message.MessageSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
public class ClientController {
    public static final String key = "test";


    /**
     * 子类
     *
     * @return
     */
    @GetMapping("childData")
    public String childData() {
        return "success";
    }

    /**
     * 日期格式测试
     *
     * @return
     */
    @GetMapping("longData")
    public String longData(@RequestParam int times) {
        MessageBody messageBody = new MessageBody();
        messageBody.setBizType(BizCon.LONG_DATA);
        messageBody.setKey(key);
        LongDataDto longDataDto = new LongDataDto();


        StringBuilder stringBuilder = new StringBuilder();

        // 16:26 max 6072 i=5975
        int i = times;
        while (i != 0) {
            stringBuilder.append("i");
            i--;
        }

        longDataDto.setData(stringBuilder.toString());

        messageBody.setData(longDataDto);

        System.out.println(messageBody.toString().length());
        MessageSender.send(messageBody);
        return "success";
    }

    /**
     * 日期格式测试  TODO done
     *
     * @return
     */
    @GetMapping("date")
    public String dateData() {
        MessageBody messageBody = new MessageBody();
        messageBody.setBizType(BizCon.DATE);
        messageBody.setKey(key);
        messageBody.setData(new DateDto());
        MessageSender.send(messageBody);
        return "success";
    }

}
