package com.jiofi.scheduler;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.jiofi.model.DeviceDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


/**
 * @author MANJUNATH REDDY R on 21-07-2022
 * @project Application-for-Jiofi-status
 */
@Component
public class JiofiScheduler {

    @Value("${jiofi.device.details.url}")
    private String url;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private SimpMessagingTemplate template;

    @Scheduled(cron = "0 0/1 * * * ?")
    public void getDeviceDetails(){
       String  deviceDetailsXml =  restTemplate.getForObject(url,String.class);
       Map<String,Integer> chargeInfoMap = new HashMap<>();
        try {
            ObjectMapper objectMapper = new XmlMapper();
            DeviceDetails deviceDetails = objectMapper.readValue(deviceDetailsXml, DeviceDetails.class);
            chargeInfoMap.put("chargePercentage",Integer.parseInt(deviceDetails.getBatt_per()));
            chargeInfoMap.put("chargeStatus",Integer.parseInt(deviceDetails.getBatt_st()));
            template.convertAndSend("/chargeInfo",chargeInfoMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
