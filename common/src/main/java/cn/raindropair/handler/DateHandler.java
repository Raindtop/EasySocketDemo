package cn.raindropair.handler;

import cn.raindropair.constants.BizCon;
import cn.raindropair.dto.DateDto;
import cn.raindropair.easysocket.handler.MessageHandler;
import cn.raindropair.easysocket.message.MessageBody;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;


@Component(BizCon.DATE)
public class DateHandler extends MessageHandler {
    @Override
    protected Object bizDetal(MessageBody messageBody) {
        DateDto dateDto = messageBody.getData(DateDto.class);

        System.out.println(JSONObject.toJSONString(dateDto));
        return new DateDto();
    }
}
