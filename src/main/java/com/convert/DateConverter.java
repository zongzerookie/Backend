package com.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateConverter implements Converter<String, Date> {

        public Date convert(String s) {
            if(s==null){
                throw new RuntimeException("输入的数据为空");
            }
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            try {
                return dateFormat.parse(s);
            } catch (ParseException e) {
                throw new RuntimeException("无效格式");
            }

        }

}
