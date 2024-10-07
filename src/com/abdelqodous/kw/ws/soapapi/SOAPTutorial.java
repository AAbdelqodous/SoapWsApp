package com.abdelqodous.kw.ws.soapapi;

import com.abdelqodous.kw.ws.soapapi.lavasoft.GeoIPService;
import com.abdelqodous.kw.ws.soapapi.lavasoft.GeoIPServiceSoap;

public class SOAPTutorial {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("You need to pass IP address");
        }else{
            String ipAddress = args[0];
            GeoIPService geoIPService = new GeoIPService();
            GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();
            String ipLocation = geoIPServiceSoap.getIpLocation(ipAddress);
            System.out.println("Ip location is: " + ipLocation);

        }
    }
}
