package com.recd.SLGW.controller;

import com.recd.SLGW.common.NetworkDeviceService;
import com.recd.SLGW.entity.NetworkDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/devices")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NetworkDeviceController {
    @Autowired
    private NetworkDeviceService service;

    @GetMapping(value = "/")
    public List<NetworkDevice> getAllDevices() {
        return service.getAllNetworkDevice();
    }

    @GetMapping("/{id}")
    public NetworkDevice getDeviceById(@PathVariable Long id) {
        return service.getNetworkDeviceById(id);
    }

    @PostMapping
    public NetworkDevice addDevice(@RequestBody NetworkDevice device) {
        return service.addNetworkDevice(device);
    }

    @DeleteMapping("/{id}")
    public void deleteDevice(@PathVariable Long id) {
        service.deleteNetworkDevice(id);
    }

}
