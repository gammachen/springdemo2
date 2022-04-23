package com.example.demo;

import com.example.demo.dao.ItemPO;
import com.example.demo.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @author shaofu
 */
@RestController
public class HelloController {
    public static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private HelloService helloService;

    @RequestMapping(method = RequestMethod.GET, path = "/hello/{id}")
    public String hello(@PathVariable(value = "id") String id) {
        List<ItemPO> hello = helloService.hello();
        hello = helloService.hello();
        hello = helloService.hello();
        hello = helloService.hello();
        hello = helloService.hello();
        hello = helloService.hello();
        hello = helloService.hello();
        hello = helloService.hello();

        try {
            hello = helloService.hello();
            Thread.sleep(3000);

            for (int i = 0; i < 1000; i++) {
                int i1 = new Random(2).nextInt();
                if (i1 % 2 == 0) {
                    Thread.sleep(i1);
                    hello = helloService.hello();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return System.currentTimeMillis() + " Hello" + hello.toArray();
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}