package com.bison.service.lyric;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by bm091125 on 6/28/2016.
 */
@RestController
public class LyricServiceController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public LyricService greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new LyricService(counter.incrementAndGet(),
                String.format(template, name));
    }
}
