package com.sdcsoft.datamanage.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {

    @Autowired
    DeviceEhcacheUtil deviceEhcacheUtil;


    @Scheduled(fixedRate = 3000000)
    public void reportCurrentTime() {
        deviceEhcacheUtil.putData("0600500002",null);
        deviceEhcacheUtil.putData("0",null);
        deviceEhcacheUtil.putData("0600500010",null);
    }
}

 /* @Value("${com.sdcsoft.reportdatamanage.deviceurl}")
    public void setDeviceUrl(String deviceUrl) {
        this.deviceUrl = deviceUrl;
    }*/
  /* TemplateClient client = Feign.builder().target(TemplateClient.class, String.format("%s%s",deviceUrl,"/device/sell"));
        JSONArray deviceList= JSONArray.parseArray(client.get());
        for(int i=0;i<deviceList.size();i++){
            JSONObject device = deviceList.getJSONObject(i);
            DeviceData deviceData =new DeviceData();
            deviceData.setEnterpriseId((int)device.get("enterpriseId"));
            deviceData.setTypeName(device.get("deviceType")+"");
            deviceData.setMediaId((int)device.get("power"));
            deviceData.setPowerId((int)device.get("media"));
            deviceEhcacheUtil.putData(device.get("deviceSuffix")+"",deviceData);
        }*/