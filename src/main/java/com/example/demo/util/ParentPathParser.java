package com.example.demo.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by liumin5 on 2017/9/17.
 */
public class ParentPathParser {

    public static List<String> parse(String path){
        if (path == null)
            return Collections.emptyList();

        List<String> parents = new ArrayList<>();

        String[] pathSegments = path.split("/");

        StringBuilder parent = new StringBuilder("");

        parents.add("/");
        return null;
    }


}
