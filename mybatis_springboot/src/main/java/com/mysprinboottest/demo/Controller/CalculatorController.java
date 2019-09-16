package com.mysprinboottest.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String test1( Map<String,Object> map,@RequestParam("firstNumber") double firstNumber,
                         @RequestParam("secondNumber") double secondNumber,@RequestParam("radio") double radio)
    {
        caclulator cacl=new caclulator();
        cacl.setFirstnumber(firstNumber);
        cacl.setCharecer((int)radio);
        cacl.setSecondNuber(secondNumber);
        calculate cacu= new calculate();
        double anwser=cacu.calcu(cacl);
        map.put("answer", anwser);
        return "views/answer";
    }
}
