package com.EnusA.Prac4_3_1;

import jdk.nashorn.internal.codegen.CompilerConstants;
import org.apache.commons.lang.StringUtils;

/**
 * Created by enusa on 2017/03/30.
 */
//public class CallingClass extends Concatenate{
public class CallingClass {
    private String string1;
    private String string2;
    private String result;

    public CallingClass (String s1, String s2)
    {
        string1 = s1;
        string2 = s2;
    }
/*
    public String callingMethod ()
    {
        return getConcatResult(string1, string2);
    }*/

    public String callingMethod ()
    {
        result = StringUtils.substring(string1, 0, 3);
        result += StringUtils.substring(string2, 0, 3);
        return result;
    }
}
