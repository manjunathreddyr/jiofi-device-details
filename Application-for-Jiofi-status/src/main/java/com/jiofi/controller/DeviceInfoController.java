package com.jiofi.controller;

import com.jiofi.model.ChargeInfo;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @author MANJUNATH REDDY R on 23-07-2022
 * @project Application-for-Jiofi-status
 */
@Controller
public class DeviceInfoController {


    @MessageMapping("/chargeInfo")
    public String getChargeInfo(){
        String response = "Subscribed to chargeinfo details";
        return response;
    }
}
