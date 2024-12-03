package com.recd.SLGW.common;

import com.recd.SLGW.entity.NetworkDevice;
import com.recd.SLGW.service.NetworkDeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NetworkDeviceService {
    @Autowired
    private NetworkDeviceRepository networkDeviceRepository;
    public List<NetworkDevice> getAllNetworkDevice() {
        return networkDeviceRepository.findAll();
    }
    public NetworkDevice getNetworkDeviceById(Long id) {
        return networkDeviceRepository.findById(id).orElse(null);
    }
    public NetworkDevice addNetworkDevice(NetworkDevice networkDevice) {
        return networkDeviceRepository.save(networkDevice);
    }
    public void deleteNetworkDevice(Long id) {
         networkDeviceRepository.deleteById(id);
    }
}
