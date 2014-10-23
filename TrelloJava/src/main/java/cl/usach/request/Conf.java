/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.request;

import cl.usach.elements.BoardElem;
import cl.usach.gettrello.AppTrello;
import cl.usach.gettrello.HTTP;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;

/**
 *
 * @author FGT
 */
public class Conf {
    
    String url;
    AppTrello appTrello;
    
    public Conf(AppTrello appTrello) {
        this.appTrello = appTrello;
    }
    
    public Boolean checkConf(String idMember) throws IOException{
        url = appTrello.getUrlAPIbase() + "members/" + idMember + "/boards?" + appTrello.getArgAccess();
        System.out.println(url);
        HTTP http = new HTTP(url);
        JSONArray jsona;
        
        try {
            jsona = new JSONArray(http.getResult());   
            return true;
        } catch (JSONException ex) {
            System.out.println("Error: No existen Tableros");
            return false;
        }      
    }
}
