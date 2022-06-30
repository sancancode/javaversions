package com.versions.javaversions.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    static final Map<String,String> map11 = Map.of("Running Java File with single command","Run Java ",
            "Unmodifiable collection enhancements","",
            "G1GC improvements","",
            "Application Class-Data Sharing","",
            "Root Certificates (","",
            "Thread-Local Handshakes","",
            "New just-in-time compiler","",
            "Container awareness","",
            "The new release cycle","");


    static final Map<String,String> map10 = Map.of("Running Java File with single command","Run Java ",
            "Unmodifiable collection enhancements","",
            "G1GC improvements","",
            "Application Class-Data Sharing","",
            "Root Certificates (","",
            "Thread-Local Handshakes","",
            "New just-in-time compiler","",
            "Container awareness","",
            "The new release cycle","");



    static final Map<String,String> map9 = Map.of("Local variable type inference","",
            "Unmodifiable collection enhancements","",
            "G1GC improvements","",
            "Application Class-Data Sharing","",
            "Root Certificates (","",
            "Thread-Local Handshakes","",
            "New just-in-time compiler","",
            "Container awareness","",
            "The new release cycle","");


    static final Map<String,String> map8 = Map.of("The Java Platform module system","",
            "Interface Private Methods","",
            "JShell: the interactive Java REPL","",
            "A New HTTP Client - HTTP2","",
            "Collection API Updates","",
            "Stream API improvements","",
            "Multi Release Jars","",
            "Improved Javadoc","",
            "Improved Compiler - AOT feature","");


    static final Map<String,String> map7 = Map.of("Lambdas,Method References","Similar to anonymous class, can be used only for SAM interfaces. Useful for functional programming.",
            "Functional Interfaces","A Single Abstract Method(SAM) interface which can be used as a lambda",
            "Stream API","Helps process data in collections in a declarative way using predeifined functional interfaces",
            "invokedynamic","");


    static Map<Integer, Map> mapOfMaps = new HashMap<Integer, Map>();

    static {
        mapOfMaps.put(7, map7);
        mapOfMaps.put(8, map8);
        mapOfMaps.put(9, map9);
        mapOfMaps.put(10, map10);
        mapOfMaps.put(11, map11);
    }



    @GetMapping(path="versionchanges/{versionEarlier}/{versionLater}")
    public ResponseEntity<Map<Integer, Map<String,String>>> versionDifference(@PathVariable int versionEarlier, @PathVariable int versionLater) {

        Map<Integer, Map<String, String>> map = new LinkedHashMap<>();

       map = IntStream.range(versionEarlier,versionLater+1)
                .mapToObj(i->i).collect(Collectors.toMap(e->e,e->mapOfMaps.get(e)));

       return  new ResponseEntity<>(map, HttpStatus.OK);
    }

    @GetMapping({"/","/home"})
    public String home(Model model) {

        model.addAttribute("versions", new ArrayList<>(mapOfMaps.keySet()));


        return "index";
    }

}
