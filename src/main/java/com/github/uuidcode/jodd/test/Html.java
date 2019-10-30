package com.github.uuidcode.jodd.test;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Html {
    private Header header;
    private Body body;
}
