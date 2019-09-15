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
        System.out.println(radio);
        double anwser = 0.0;
        switch ((int) radio) {
            case 1:
                anwser = firstNumber + secondNumber;
                break;
            case 2:
                anwser = firstNumber - secondNumber;
                break;
            case 3:
                anwser = firstNumber * secondNumber;
                break;
            case 4:
                anwser = firstNumber / secondNumber;
                break;
            default:
                break;
        }


        map.put("answer", anwser);


        return "views/answer";


    }
}
