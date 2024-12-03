//package com.recd.SLGW.service;
//
//import com.recd.SLGW.entity.Device;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class DeviceService {
//    @Autowired
//    private DeviceRepository deviceRepository;
//
//    public List<Device> getAllDevices() {
//        return deviceRepository.findAll();
//    }
//
//    public void addDevice(Device device) {
//        deviceRepository.save(device);
//    }
//    public void addAllDevices(List<Device> devices) {
//        deviceRepository.saveAll(devices);
//    }
//}
