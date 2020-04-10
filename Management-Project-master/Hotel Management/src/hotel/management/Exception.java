/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management;

/**
 *
 * @author sumair
 */
public class Exception {
    public String NumberFormat(String id){
        int num;
        try
            {
                num=Integer.parseInt(id);
            }
            catch(NumberFormatException e)
            {
                id="invalid";
            }
        return id;
    }
}
