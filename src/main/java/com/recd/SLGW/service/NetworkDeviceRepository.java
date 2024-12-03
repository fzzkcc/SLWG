package com.recd.SLGW.service;

import com.recd.SLGW.entity.NetworkDevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkDeviceRepository extends JpaRepository<NetworkDevice, Long> {
}
