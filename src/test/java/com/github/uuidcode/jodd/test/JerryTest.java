package com.github.uuidcode.jodd.test;

import org.junit.Test;

import jodd.jerry.Jerry;
import lombok.extern.slf4j.Slf4j;

import static jodd.jerry.Jerry.jerry;

@Slf4j
public class JerryTest {
    @Test
    public void test() {
        Jerry doc = jerry("<div></div>");

        doc.s("div").append("<ul></ul>");

        doc.s("ul")
            .addClass("test")
            .attr("data-url", "https://www.google.com");

        if (log.isDebugEnabled()) {
            log.debug(">>> test doc: {}", doc.html());
        }
    }
}
