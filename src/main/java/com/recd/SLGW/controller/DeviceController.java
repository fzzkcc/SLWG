//package com.recd.SLGW.controller;
//
//import com.recd.SLGW.entity.Device;
//import com.recd.SLGW.service.DeviceService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "api/devices")
//public class DeviceController {
//    @Autowired
//    private DeviceService deviceService;
//
//    @GetMapping
//    public List<Device> getAllDevices() {
//        return deviceService.getAllDevices();
//    }
//
//    @PostMapping
//    public void addDevice(@RequestBody Device device) {
//        deviceService.addDevice(device);
//    }
//}
