package com.charlie.control;

import com.alibaba.fastjson.JSON;
import com.charlie.entity.ResultMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("infolog")
public class InfoControl {

    @RequestMapping(value = "helloworld",method = RequestMethod.GET)
    public String helloworld(HttpServletRequest req){
        String ip = req.getRemoteAddr();
        ResultMessage resultMessage = new ResultMessage();
        resultMessage.setMessage("hello" + ip);
        resultMessage.setStatus("suc");
        String result = JSON.toJSONString(resultMessage);
        return result;
    }
}
