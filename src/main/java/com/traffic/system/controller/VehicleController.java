package com.traffic.system.controller;

import com.traffic.system.entities.Vehicle;
import com.traffic.system.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/vehicle")
public class VehicleController {

    private final VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public String showSearchForm() {
        return "search";
    }

    @PostMapping("/search")
    public String searchVehicle(@RequestParam("licensePlate") String licensePlate, Model model) {
        Vehicle vehicle = vehicleService.findVehicleByLicensePlate(licensePlate);
        if (vehicle != null) {
            model.addAttribute("vehicle", vehicle);
            return "searchResult";
        } else {
            model.addAttribute("error", "Vehicle not found.");
            return "search";
        }
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("vehicle", new Vehicle());
        return "vehicleRegister";
    }

    @PostMapping("/register")
    public String registerVehicle(@ModelAttribute("vehicle") Vehicle vehicle, Model model) {
        vehicleService.saveVehicle(vehicle);
        model.addAttribute("success", "Vehicle registered successfully.");
        return "register";
    }

    @GetMapping("/all")
    public String showAllVehicles(Model model) {
        model.addAttribute("vehicles", vehicleService.findAllVehicles());
        return "allVehicles";
    }
}
