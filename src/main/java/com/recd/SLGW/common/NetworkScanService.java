//package com.recd.SLGW.common;
//
//import com.recd.SLGW.entity.Device;
//import com.recd.SLGW.service.DeviceService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.*;
//
//@Service
//public class NetworkScanService {
//    @Autowired
//    private DeviceService deviceService;
//
//    public void scanNetwork() {
//        try {
//            // Ping all devices in the network
//            Process pingProcess = Runtime.getRuntime().exec("ping -c 1 -b 192.168.1.255");
//            pingProcess.waitFor();
//
//
//            Process arpProcess = Runtime.getRuntime().exec("arp -a");
//            BufferedReader reader = new BufferedReader(new InputStreamReader(arpProcess.getInputStream()));
//
//            String line;
//            List<Device> devices = new ArrayList<>();
//            while ((line = reader.readLine()) != null) {
//                if (line.contains("(192.168.1.")) {
//                    String[] parts = line.split(" ");
//                    String ip = parts[1].replaceAll("[()]", "");
//                    String mac = parts[3];
//                   // devices.add(new Device(ip, mac, null));
//                }
//            }
//
//            deviceService.addAllDevices(devices);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
