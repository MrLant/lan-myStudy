package com.lan.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {

    /**
     * 获取当前时间
     * 格式：xxxx-xx-xx xx:xx:xx
     * @return
     */
    public static String getNowDateTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }

    /**
     * 将时间格式转换成字符串形式
     * @param time
     * @return
     */
    public static String parseDateTime(Date time){
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        return sdf.format(time);
    }
}
