package com.github.uuidcode.jodd.test;

import org.junit.Test;

import jodd.methref.Methref;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HtmlTest {
    @Test
    public void test() {
        Methref<Html> methref = Methref.on(Html.class);
        String name = methref.ref(methref.to().getBody());

        if (log.isDebugEnabled()) {
            log.debug(">>> test name: {}", name);
        }
    }
}