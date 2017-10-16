package com.example.demo.util;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by liumin5 on 2017/9/17.
 */
public class IpPathFilter {

    public static List<String> filter(List<String> nodes, String showIp){
        Pattern pattern = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)");
        List<String> result = new LinkedList<>();
        List<String> ipResult = new ArrayList<>();

        String[] showIps = showIp.split(",");

        Set<String> allowIpSet = new HashSet<>();

        for (String ip : showIps) {
            allowIpSet.add(ip.trim());
        }

        for (String node: nodes) {
            Matcher matcher = pattern.matcher(node);
            if (matcher.matches()){
                if (allowIpSet.contains(node))
                    result.add(0, node);
            }else {
                result.add(node);
            }
        }
        result.addAll(ipResult);

        return result;
    }
}
