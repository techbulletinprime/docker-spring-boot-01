package com.docker.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Optional;

public class Test {

    public static void main(String[] args) {
        Optional<String> st;
        String abc=null;
        JsonNode node= new ObjectMapper().createObjectNode().put("abc",abc);

        Optional<JsonNode> op=Optional.empty();
        op.map(js->js.get("abc")).map(js->js.textValue()).orElse("Myname");

        System.out.println( op.map(js->js.get("abc")).map(js->js.textValue()));
    }
}
