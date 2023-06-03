package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MethodParser {

    /**
     * Parses string that represents a method signature and stores all it's members into a {@link MethodSignature} object.
     * signatureString is a java-like method signature with following parts:
     * 1. access modifier - optional, followed by space: ' '
     * 2. return type - followed by space: ' '
     * 3. method name
     * 4. arguments - surrounded with braces: '()' and separated by commas: ','
     * Each argument consists of argument type and argument name, separated by space: ' '.
     * Examples:
     * accessModifier returnType methodName(argumentType1 argumentName1, argumentType2 argumentName2)
     * private void log(String value)
     * Vector3 distort(int x, int y, int z, float magnitude)
     * public DateTime getCurrentDateTime()
     *
     * @param signatureString source string to parse
     * @return {@link MethodSignature} object filled with parsed values from source string
     */
    public MethodSignature parseFunction(String signatureString) {
        String[] parts = signatureString.split("\\(");
        String[] signature = parts[0].split(" ");
        String accessModifier = null;
        String returnType;
        String methodName;
        if (signature.length == 3) {
            accessModifier = signature[0];
            returnType = signature[1];
            methodName = signature[2];
        } else {
            returnType = signature[0];
            methodName = signature[1];
        }
        List<MethodSignature.Argument> argumentList = new ArrayList<>();
        if(parts[1].length() != 1) {
            String[] arguments = parts[1].substring(0, parts[1].length() - 1).split(" ");
            for (int i = 0; i < arguments.length; i += 2) {
                String s1 = arguments[i];
                String s2 = arguments[i + 1];
                if (s2.charAt(s2.length() - 1) == ',')
                    s2 = s2.substring(0, s2.length() - 1);
                MethodSignature.Argument arg = new MethodSignature.Argument(s1, s2);
                argumentList.add(arg);
            }
        }
        MethodSignature res;
        if(argumentList.isEmpty())
            res = new MethodSignature(methodName);
        else
            res = new MethodSignature(methodName, argumentList);
        if(accessModifier != null)
            res.setAccessModifier(accessModifier);
        res.setReturnType(returnType);

        return res;
    }
}
