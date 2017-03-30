package com.EnusA.Prac4_3_1;

import org.apache.commons.lang.StringUtils;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * Created by enusa on 2017/03/30.
 */
public abstract class Concatenate {
    private String string1;
    private String string2;
    private String result;

    public Concatenate () {};
    public Concatenate (String s1, String s2)
    {
        string1 = s1;
        string2 = s2;
    }

    public String getConcatResult(String string1, String string2)
    {
        result = StringUtils.substring(string1, 0, 3);
        result += StringUtils.substring(string2, 0, 3);
        return result;
    }
}
