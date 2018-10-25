/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qrcode;

import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.security.KeyPair;
import java.util.Map;

/**
 *
 * @author admin
 */
public class Details 
{
    
    static int rid=0;
     static String username;
    static int x1=0;
    static int x2=0;
    static int ccp[];
    static String encd="";
    static int inLen=0;
 static  String receiver=""; 
 static long start;
    
     static KeyPair kp;
     
     
     static Map<EncodeHintType, ErrorCorrectionLevel> hintMap;
}
