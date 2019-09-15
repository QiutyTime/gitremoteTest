package com.mysprinboottest.demo.Controller;

/**
 * 　　* @description: TODO
 * 　　* @param ${tags}
 * 　　* @return ${return_type}
 * 　　* @throws
 * 　　* @author yangtao
 * 　　* @date $date$ $time$
 *
 */
public class calculate {
    public  double calcu(caclulator calc){

        double anwser = 0.0;
        switch (calc.getCharecer()) {
            case 1:
                anwser = calc.getFirstnumber() + calc.getSecondNuber();
                break;
            case 2:
                anwser = calc.getFirstnumber() - calc.getSecondNuber();
                break;
            case 3:
                anwser = calc.getFirstnumber() * calc.getSecondNuber();
                break;
            case 4:
                anwser = calc.getFirstnumber() / calc.getSecondNuber();
                break;
            default:
                break;
        }

        return  anwser;
    }


}
