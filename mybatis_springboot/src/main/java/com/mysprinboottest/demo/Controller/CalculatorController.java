package com.mysprinboottest.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 　　* @description: TODO
 * 　　* @param ${tags}
 * 　　* @return ${return_type}
 * 　　* @throws
 * 　　* @author yangtao
 * 　　* @date $date$ $time$
 *
 */

@Controller
public class CalculatorController {

    @RequestMapping("/a")
    public String test()
    {
        return "views/start";
    }

    @RequestMapping("/b")
    public String test1( Map<String,Object> map)
    {
        map.put("name","2");

        return "views/answer";
    }
}
