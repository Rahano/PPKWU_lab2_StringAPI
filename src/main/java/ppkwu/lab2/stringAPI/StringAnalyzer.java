package ppkwu.lab2.stringAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringAnalyzer {

    @RequestMapping(path = "/stringAnalyzer")
    public String reverseString(@RequestParam(value = "input", required = false) String input){
        int lowerCaseCount = 0, upperCaseCount = 0, digitCount = 0, specialSymbolsCount = 0;

        char[] text = input.toCharArray();

        for(char singleChar : text){

            if( Character.isLowerCase(singleChar) )
                lowerCaseCount++;

            else if( Character.isUpperCase(singleChar) )
                upperCaseCount++;

            else if( Character.isDigit(singleChar) )
                digitCount++;

            else
                specialSymbolsCount++;
        }

        return null;

    }
}
