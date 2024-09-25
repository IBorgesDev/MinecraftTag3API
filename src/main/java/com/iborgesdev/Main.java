package com.iborgesdev;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        API_Interface api = new API_Interface();
        List<String> listofversions = api.getInstallableVersionsList();
        for (String version : listofversions) {
            System.out.println(version);
        }
        api.runMinecraft("Ammar_Ahmad", "1.19.1", false, false);
    }
}