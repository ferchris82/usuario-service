package chrisferdev.usuarioservice.external.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import chrisferdev.usuarioservice.entities.Hotel;

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelService {
    
    @GetMapping("/hoteles/{hotelId}")
    Hotel getHotel(@PathVariable String hotel);
}
