/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author FGT
 */
public class FormatDate {
        
    /**
     *
     * @param dateString
     * @return
     * @throws ParseException
     */
    public Date getFormatDate(String dateString) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        Date date = formatter.parse(dateString);
        return date;
    }
}
