package com.pro.prosperschool.audit;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
class prosperschoolInfoContributor implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        Map<String, String> prosperMap = new HashMap<String, String>();
        prosperMap.put("App Name", "prosperschool");
        prosperMap.put("App Description", "prosper School Web Application for Students and Admin");
        prosperMap.put("App Version", "1.0.0");
        prosperMap.put("Contact Email", "info@prosperschool.com");
        prosperMap.put("Contact Mobile", "+1(21) 673 4587");
        builder.withDetail("prosperschool-info", prosperMap);
    }

}
