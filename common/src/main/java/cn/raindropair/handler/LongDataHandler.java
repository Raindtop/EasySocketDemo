package cn.raindropair.handler;

import cn.raindropair.constants.BizCon;
import cn.raindropair.dto.DateDto;
import cn.raindropair.dto.LongDataDto;
import cn.raindropair.easysocket.handler.MessageHandler;
import cn.raindropair.easysocket.message.MessageBody;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;


@Component(BizCon.LONG_DATA)
public class LongDataHandler extends MessageHandler {
    @Override
    protected Object bizDetal(MessageBody messageBody) {
        LongDataDto dateDto = messageBody.getData(LongDataDto.class);

        System.out.println(JSONObject.toJSONString(dateDto));
        return dateDto;
    }
}
