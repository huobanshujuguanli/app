package com.sdcsoft.datamanage.utils;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DeviceEhcacheUtil {
    private static final String CACHE_DATA = "deviceStateData";

    @Autowired
    CacheManager cacheManager;
    private Cache getCache() {
        return cacheManager.getCache(CACHE_DATA);
    }

    public boolean getCacheData(String deviceNo) {
        Cache cache = getCache();
        Cache.ValueWrapper element = cache.get(deviceNo);

        if (null != element) {
            return  true;
        }
        return false;
    }
    public void putData(String key,String
            deviceData) {
        Cache cache = getCache();
        cache.put(key,deviceData);
    }
}
