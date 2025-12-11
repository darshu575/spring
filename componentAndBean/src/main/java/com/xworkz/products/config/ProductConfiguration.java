package com.xworkz.products.config;


import com.xworkz.products.product.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = " com.xworkz.products")

public class ProductConfiguration {



    public ProductConfiguration() {
        System.out.println("ProductConfiguartion class invoked");
    }

    @Bean("p1")
    public List<AirPurifier> getAirPusifier() {
        List<AirPurifier> airPurifiers = new ArrayList<>();

        airPurifiers.add(new AirPurifier(1, "Dyson", "Pure Cool Link", "HEPA + Carbon", 600, "40 dB", 35000, "2 Years"));
        airPurifiers.add(new AirPurifier(2, "Philips", "Series 3000i", "NanoProtect HEPA", 800, "33 dB", 28000, "3 Years"));
        airPurifiers.add(new AirPurifier(3, "Mi", "Smart Air Purifier 4", "True HEPA", 516, "32 dB", 14999, "1 Year"));
        airPurifiers.add(new AirPurifier(4, "Honeywell", "AirTouch V3", "H13 HEPA", 465, "34 dB", 22999, "2 Years"));
        airPurifiers.add(new AirPurifier(5, "Samsung", "AX90", "Dual HEPA Filter", 700, "30 dB", 41000, "3 Years"));
        airPurifiers.add(new AirPurifier(6, "Blueair", "Blue 3210", "Particle + Carbon", 388, "31 dB", 12999, "1 Year"));
        airPurifiers.add(new AirPurifier(7, "Coway", "AirMega 150", "Green HEPA Filter", 355, "24 dB", 11990, "5 Years"));
        airPurifiers.add(new AirPurifier(8, "Sharp", "FP-J30M", "Plasmacluster Ion", 200, "23 dB", 9999, "2 Years"));
        airPurifiers.add(new AirPurifier(9, "Panasonic", "F-PXL45A", "Nanoe Technology", 361, "34 dB", 16999, "2 Years"));
        airPurifiers.add(new AirPurifier(10, "Kent", "Aura", "HEPA + Carbon", 290, "28 dB", 8999, "1 Year"));
        airPurifiers.add(new AirPurifier(11, "LG", "PuriCare 360", "360° HEPA Filter", 669, "25 dB", 52000, "3 Years"));
        airPurifiers.add(new AirPurifier(12, "Hitachi", "EPA-250", "EPA Filter System", 430, "28 dB", 18999, "2 Years"));
        airPurifiers.add(new AirPurifier(13, "Daikin", "MC30UVM6", "Electrostatic HEPA", 300, "32 dB", 15999, "1 Year"));
        airPurifiers.add(new AirPurifier(14, "Godrej", "GAP 18P", "Tri-Layer HEPA", 450, "29 dB", 13499, "2 Years"));
        airPurifiers.add(new AirPurifier(15, "Lloyd", "LPF271", "Activated Carbon + HEPA", 310, "30 dB", 11990, "1 Year"));
        return airPurifiers;
    }

    @Bean("p2")
    public List<AirConditioner> getAirConditioner() {
        List<AirConditioner> acList = new ArrayList<>();

        acList.add(new AirConditioner(1, "LG", "Basic", "Inverter", 1, "Filter A", 25000, "1 Year"));
        acList.add(new AirConditioner(2, "Samsung", "Cool", "Inverter", 1, "Filter B", 27000, "2 Years"));
        acList.add(new AirConditioner(3, "Voltas", "Simple", "Normal", 1, "Filter C", 22000, "1 Year"));
        acList.add(new AirConditioner(4, "Daikin", "Easy", "Inverter", 1, "Filter D", 30000, "2 Years"));
        acList.add(new AirConditioner(5, "Whirlpool", "Pro", "Normal", 1, "Filter E", 26000, "1 Year"));
        acList.add(new AirConditioner(6, "Carrier", "Max", "Inverter", 1, "Filter F", 28000, "2 Years"));
        acList.add(new AirConditioner(7, "Blue Star", "Eco", "Normal", 1, "Filter G", 24000, "1 Year"));
        acList.add(new AirConditioner(8, "Panasonic", "Smart", "Inverter", 1, "Filter H", 32000, "2 Years"));
        acList.add(new AirConditioner(9, "Hitachi", "Cooler", "Normal", 1, "Filter I", 29000, "2 Years"));
        acList.add(new AirConditioner(10, "Godrej", "Green", "Inverter", 1, "Filter J", 23000, "1 Year"));
        acList.add(new AirConditioner(11, "Mitsubishi", "Airy", "Normal", 1, "Filter K", 31000, "2 Years"));
        acList.add(new AirConditioner(12, "Sharp", "Fresh", "Inverter", 1, "Filter L", 30000, "2 Years"));
        acList.add(new AirConditioner(13, "Fujitsu", "CoolerPro", "Normal", 1, "Filter M", 28000, "1 Year"));
        acList.add(new AirConditioner(14, "Hitachi", "Kool", "Inverter", 1, "Filter N", 27000, "2 Years"));
        acList.add(new AirConditioner(15, "LG", "AirMax", "Normal", 1, "Filter O", 33000, "3 Years"));

        return acList;
    }

    @Bean("p3")
    public List<BluetoothSpeaker> getBluetoothSpeakers() {
        List<BluetoothSpeaker> bluetoothSpeakers = new ArrayList<>();
        bluetoothSpeakers.add(new BluetoothSpeaker(1, "JBL", "Flip 5", "10W", 12, "Bluetooth 5.0", 4500, "1 Year"));
        bluetoothSpeakers.add(new BluetoothSpeaker(2, "Sony", "SRS-XB23", "12W", 10, "Bluetooth 5.0", 5000, "1 Year"));
        bluetoothSpeakers.add(new BluetoothSpeaker(3, "Boat", "Stone 1000", "8W", 6, "Bluetooth 4.2", 2500, "6 Months"));
        bluetoothSpeakers.add(new BluetoothSpeaker(4, "Bose", "SoundLink Mini", "15W", 10, "Bluetooth 4.2", 12000, "2 Years"));
        bluetoothSpeakers.add(new BluetoothSpeaker(5, "Mi", "Compact 2", "10W", 8, "Bluetooth 5.0", 3000, "1 Year"));
        bluetoothSpeakers.add(new BluetoothSpeaker(6, "Philips", "BT50", "10W", 6, "Bluetooth 4.2", 2200, "6 Months"));
        bluetoothSpeakers.add(new BluetoothSpeaker(7, "F&D", "R200", "12W", 5, "Bluetooth 4.1", 1800, "6 Months"));
        bluetoothSpeakers.add(new BluetoothSpeaker(8, "Lenovo", "P330", "8W", 8, "Bluetooth 5.0", 2500, "1 Year"));
        bluetoothSpeakers.add(new BluetoothSpeaker(9, "Portronics", "POR-903", "10W", 7, "Bluetooth 5.0", 2700, "6 Months"));
        bluetoothSpeakers.add(new BluetoothSpeaker(10, "Infinity", "Fuze 200", "15W", 10, "Bluetooth 5.0", 4000, "1 Year"));
        bluetoothSpeakers.add(new BluetoothSpeaker(11, "Zebronics", "ZEB-BT3630", "12W", 6, "Bluetooth 4.2", 2000, "6 Months"));
        bluetoothSpeakers.add(new BluetoothSpeaker(12, "Sony", "SRS-XB12", "8W", 10, "Bluetooth 5.0", 3500, "1 Year"));
        bluetoothSpeakers.add(new BluetoothSpeaker(13, "JBL", "Go 3", "5W", 5, "Bluetooth 5.0", 1500, "6 Months"));
        bluetoothSpeakers.add(new BluetoothSpeaker(14, "Boat", "Stone 170", "8W", 4, "Bluetooth 4.2", 1800, "6 Months"));
        bluetoothSpeakers.add(new BluetoothSpeaker(15, "Mi", "Compact 3", "12W", 10, "Bluetooth 5.0", 3200, "1 Year"));
        return bluetoothSpeakers;
    }

    @Bean("p4")
    public List<Camera> getComers() {
        List<Camera> cameraList = new ArrayList<>();
        cameraList.add(new Camera(1, "Canon", "BasicCam", "Small", 12, "Standard Lens", 12000, "1 Year"));
        cameraList.add(new Camera(2, "Nikon", "EasyShot", "Small", 16, "Standard Lens", 15000, "1 Year"));
        cameraList.add(new Camera(3, "Sony", "SnapPro", "Medium", 20, "Zoom Lens", 25000, "2 Years"));
        cameraList.add(new Camera(4, "Canon", "PhotoMax", "Small", 14, "Standard Lens", 18000, "1 Year"));
        cameraList.add(new Camera(5, "Nikon", "QuickShot", "Medium", 18, "Zoom Lens", 20000, "2 Years"));
        cameraList.add(new Camera(6, "Sony", "AlphaMini", "Medium", 24, "Zoom Lens", 30000, "2 Years"));
        cameraList.add(new Camera(7, "Fujifilm", "FunCam", "Small", 12, "Standard Lens", 16000, "1 Year"));
        cameraList.add(new Camera(8, "Canon", "EasyPix", "Medium", 20, "Zoom Lens", 22000, "1 Year"));
        cameraList.add(new Camera(9, "Nikon", "PhotoLite", "Small", 14, "Standard Lens", 17000, "1 Year"));
        cameraList.add(new Camera(10, "Sony", "SnapLite", "Medium", 18, "Zoom Lens", 24000, "2 Years"));
        cameraList.add(new Camera(11, "Canon", "MiniCam", "Small", 12, "Standard Lens", 13000, "1 Year"));
        cameraList.add(new Camera(12, "Nikon", "QuickPix", "Small", 16, "Standard Lens", 15000, "1 Year"));
        cameraList.add(new Camera(13, "Sony", "EasySnap", "Medium", 20, "Zoom Lens", 26000, "2 Years"));
        cameraList.add(new Camera(14, "Fujifilm", "FunShot", "Small", 14, "Standard Lens", 18000, "1 Year"));
        cameraList.add(new Camera(15, "Canon", "PhotoCam", "Medium", 18, "Zoom Lens", 20000, "2 Years"));
        return cameraList;
    }

    @Bean("p5")
    public List<CoffeeMaker> getCoffeeMakers() {
        List<CoffeeMaker> coffeeList = new ArrayList<>();

        coffeeList.add(new CoffeeMaker(1, "Philips", "Basic", "Drip", 1, "Plastic", 2500, "1 Year"));
        coffeeList.add(new CoffeeMaker(2, "Bosch", "EasyBrew", "Drip", 1, "Plastic", 3000, "1 Year"));
        coffeeList.add(new CoffeeMaker(3, "Prestige", "CaféPro", "Drip", 1, "Stainless Steel", 3500, "2 Years"));
        coffeeList.add(new CoffeeMaker(4, "Bajaj", "SimpleBrew", "Drip", 1, "Plastic", 2000, "1 Year"));
        coffeeList.add(new CoffeeMaker(5, "Morphy Richards", "QuickBrew", "Drip", 1, "Plastic", 4000, "2 Years"));
        coffeeList.add(new CoffeeMaker(6, "Croma", "EasyCoffee", "Drip", 1, "Plastic", 2200, "1 Year"));
        coffeeList.add(new CoffeeMaker(7, "Kenstar", "BrewMax", "Drip", 1, "Plastic", 2800, "1 Year"));
        coffeeList.add(new CoffeeMaker(8, "Usha", "CaféLite", "Drip", 1, "Stainless Steel", 2600, "1 Year"));
        coffeeList.add(new CoffeeMaker(9, "Hamilton", "BrewMate", "Drip", 1, "Plastic", 3000, "1 Year"));
        coffeeList.add(new CoffeeMaker(10, "Black+Decker", "QuickBrew", "Drip", 1, "Plastic", 3500, "2 Years"));
        coffeeList.add(new CoffeeMaker(11, "Philips", "EasyBrew 2", "Drip", 1, "Plastic", 2700, "1 Year"));
        coffeeList.add(new CoffeeMaker(12, "Bosch", "CaféLite", "Drip", 1, "Stainless Steel", 3200, "2 Years"));
        coffeeList.add(new CoffeeMaker(13, "Prestige", "BrewPro", "Drip", 1, "Plastic", 3300, "1 Year"));
        coffeeList.add(new CoffeeMaker(14, "Bajaj", "QuickBrew", "Drip", 1, "Plastic", 2100, "1 Year"));
        coffeeList.add(new CoffeeMaker(15, "Morphy Richards", "CaféPlus", "Drip", 1, "Stainless Steel", 4200, "2 Years"));

        return coffeeList;
    }

    @Bean("p6")
    public List<Drone> getDrones() {
        List<Drone> droneList = new ArrayList<>();

        droneList.add(new Drone(1, "DJI", "Mini 2", "Standard FC", 31, "12MP Camera", 45000, "1 Year"));
        droneList.add(new Drone(2, "DJI", "Air 2S", "Advanced FC", 30, "20MP Camera", 95000, "1 Year"));
        droneList.add(new Drone(3, "Parrot", "Anafi", "Standard FC", 25, "21MP Camera", 55000, "1 Year"));
        droneList.add(new Drone(4, "Holy Stone", "HS720", "Standard FC", 23, "4K Camera", 22000, "6 Months"));
        droneList.add(new Drone(5, "Potensic", "D58", "Standard FC", 18, "1080p Camera", 15000, "6 Months"));
        droneList.add(new Drone(6, "DJI", "Mavic 3", "Advanced FC", 46, "20MP Camera", 220000, "2 Years"));
        droneList.add(new Drone(7, "Syma", "X8 Pro", "Standard FC", 15, "HD Camera", 12000, "6 Months"));
        droneList.add(new Drone(8, "Holy Stone", "HS110D", "Standard FC", 10, "720p Camera", 8000, "6 Months"));
        droneList.add(new Drone(9, "DJI", "FPV", "Advanced FC", 20, "12MP Camera", 150000, "1 Year"));
        droneList.add(new Drone(10, "Potensic", "T25", "Standard FC", 12, "720p Camera", 10000, "6 Months"));
        droneList.add(new Drone(11, "Parrot", "Bebop 2", "Standard FC", 25, "14MP Camera", 40000, "1 Year"));
        droneList.add(new Drone(12, "Syma", "X5UW", "Standard FC", 10, "720p Camera", 7000, "6 Months"));
        droneList.add(new Drone(13, "DJI", "Spark", "Standard FC", 16, "12MP Camera", 35000, "1 Year"));
        droneList.add(new Drone(14, "Holy Stone", "HS160", "Standard FC", 8, "720p Camera", 6000, "6 Months"));
        droneList.add(new Drone(15, "Potensic", "U36", "Standard FC", 10, "720p Camera", 9000, "6 Months"));

        return droneList;
    }

    @Bean("p7")
    public List<ElectricKettle> getKettles() {
        List<ElectricKettle> kettleList = new ArrayList<>();

        kettleList.add(new ElectricKettle(1, "Philips", "BasicKettle", "Coil", 1, "Plastic", 1200, "1 Year"));
        kettleList.add(new ElectricKettle(2, "Bajaj", "EasyBoil", "Coil", 1, "Plastic", 1000, "1 Year"));
        kettleList.add(new ElectricKettle(3, "Prestige", "QuickHeat", "Coil", 2, "Stainless Steel", 1500, "2 Years"));
        kettleList.add(new ElectricKettle(4, "Morphy Richards", "RapidBoil", "Coil", 2, "Stainless Steel", 2000, "2 Years"));
        kettleList.add(new ElectricKettle(5, "Usha", "BoilMaster", "Coil", 1, "Plastic", 1100, "1 Year"));
        kettleList.add(new ElectricKettle(6, "Croma", "HeatPro", "Coil", 1, "Plastic", 1300, "1 Year"));
        kettleList.add(new ElectricKettle(7, "Bajaj", "KettlePlus", "Coil", 2, "Stainless Steel", 1800, "2 Years"));
        kettleList.add(new ElectricKettle(8, "Philips", "EasyHeat", "Coil", 1, "Plastic", 1400, "1 Year"));
        kettleList.add(new ElectricKettle(9, "Prestige", "BoilQuick", "Coil", 1, "Plastic", 1200, "1 Year"));
        kettleList.add(new ElectricKettle(10, "Morphy Richards", "SmartBoil", "Coil", 3, "Stainless Steel", 2200, "2 Years"));
        kettleList.add(new ElectricKettle(11, "Croma", "RapidHeat", "Coil", 1, "Plastic", 1300, "1 Year"));
        kettleList.add(new ElectricKettle(12, "Usha", "HeatMax", "Coil", 1, "Plastic", 1250, "1 Year"));
        kettleList.add(new ElectricKettle(13, "Bajaj", "QuickKettle", "Coil", 1, "Stainless Steel", 1600, "2 Years"));
        kettleList.add(new ElectricKettle(14, "Philips", "RapidBoil", "Coil", 3, "Plastic", 1800, "1 Year"));
        kettleList.add(new ElectricKettle(15, "Prestige", "SmartHeat", "Coil", 1, "Plastic", 1400, "1 Year"));

        return kettleList;
    }

    @Bean("p8")
    public List<ElectricScooter> getScooters() {
        List<ElectricScooter> scooterList = new ArrayList<>();

        scooterList.add(new ElectricScooter(1, "Ola", "S1", "2 kW", 121, "Li-ion", 100000, "1 Year"));
        scooterList.add(new ElectricScooter(2, "Ather", "450X", "3 kW", 116, "Li-ion", 140000, "2 Years"));
        scooterList.add(new ElectricScooter(3, "Hero", "Optima", "1.5 kW", 85, "Li-ion", 80000, "1 Year"));
        scooterList.add(new ElectricScooter(4, "TVS", "iQube", "4 kW", 75, "Li-ion", 115000, "2 Years"));
        scooterList.add(new ElectricScooter(5, "Bajaj", "Chetak", "3 kW", 95, "Li-ion", 120000, "2 Years"));
        scooterList.add(new ElectricScooter(6, "Okinawa", "i-Praise", "2 kW", 80, "Li-ion", 90000, "1 Year"));
        scooterList.add(new ElectricScooter(7, "Pure EV", "EPluto", "2 kW", 75, "Li-ion", 95000, "1 Year"));
        scooterList.add(new ElectricScooter(8, "Ampere", "Zeus", "1.5 kW", 60, "Li-ion", 70000, "1 Year"));
        scooterList.add(new ElectricScooter(9, "Ola", "S1 Pro", "3 kW", 181, "Li-ion", 150000, "2 Years"));
        scooterList.add(new ElectricScooter(10, "Ather", "450 Plus", "3 kW", 85, "Li-ion", 120000, "1 Year"));
        scooterList.add(new ElectricScooter(11, "Hero", "Photon", "1.2 kW", 70, "Li-ion", 75000, "1 Year"));
        scooterList.add(new ElectricScooter(12, "TVS", "Creon", "4 kW", 100, "Li-ion", 130000, "2 Years"));
        scooterList.add(new ElectricScooter(13, "Bajaj", "Chetak Electric", "3 kW", 90, "Li-ion", 125000, "2 Years"));
        scooterList.add(new ElectricScooter(14, "Okinawa", "i-Praise Plus", "2.5 kW", 85, "Li-ion", 95000, "1 Year"));
        scooterList.add(new ElectricScooter(15, "Pure EV", "EPluto 7G", "2 kW", 80, "Li-ion", 100000, "1 Year"));

        return scooterList;
    }

    @Bean("p9")
    public List<FitnessBand> getFitnessBands() {
        List<FitnessBand> bandList = new ArrayList<>();

        bandList.add(new FitnessBand(1, "Mi", "Mi Band 6", "Heart Rate", 14, "Silicone", 2500, "1 Year"));
        bandList.add(new FitnessBand(2, "Mi", "Mi Band 7", "Heart Rate + SpO2", 14, "Silicone", 3000, "1 Year"));
        bandList.add(new FitnessBand(3, "Samsung", "Galaxy Fit 2", "Heart Rate", 15, "Silicone", 3500, "1 Year"));
        bandList.add(new FitnessBand(4, "Realme", "Band 2", "Heart Rate + SpO2", 12, "Silicone", 2000, "1 Year"));
        bandList.add(new FitnessBand(5, "Noise", "ColorFit Pro 3", "Heart Rate + SpO2", 10, "Silicone", 2200, "1 Year"));
        bandList.add(new FitnessBand(6, "Honor", "Band 6", "Heart Rate + SpO2", 14, "Silicone", 2700, "1 Year"));
        bandList.add(new FitnessBand(7, "Fitbit", "Inspire 2", "Heart Rate", 10, "Silicone", 5000, "1 Year"));
        bandList.add(new FitnessBand(8, "Amazfit", "Band 5", "Heart Rate + SpO2", 15, "Silicone", 2800, "1 Year"));
        bandList.add(new FitnessBand(9, "Mi", "Mi Smart Band 5", "Heart Rate", 12, "Silicone", 2200, "1 Year"));
        bandList.add(new FitnessBand(10, "Noise", "ColorFit Pro 2", "Heart Rate", 10, "Silicone", 1800, "1 Year"));
        bandList.add(new FitnessBand(11, "Realme", "Band 1", "Heart Rate", 7, "Silicone", 1500, "6 Months"));
        bandList.add(new FitnessBand(12, "Fitbit", "Charge 4", "Heart Rate + GPS", 14, "Silicone", 8000, "1 Year"));
        bandList.add(new FitnessBand(13, "Samsung", "Galaxy Fit", "Heart Rate", 7, "Silicone", 3000, "1 Year"));
        bandList.add(new FitnessBand(14, "Amazfit", "Band 3", "Heart Rate", 12, "Silicone", 2500, "1 Year"));
        bandList.add(new FitnessBand(15, "Honor", "Band 5 Lite", "Heart Rate", 10, "Silicone", 2200, "1 Year"));

        return bandList;
    }


    @Bean("p10")
    public List<GamingConsole> getConsoles() {
        List<GamingConsole> consoleList = new ArrayList<>();

        consoleList.add(new GamingConsole(1, "Sony", "PS4", "Custom GPU", 500, "1080p", 30000, "1 Year"));
        consoleList.add(new GamingConsole(2, "Sony", "PS5", "RDNA 2", 1000, "4K", 50000, "1 Year"));
        consoleList.add(new GamingConsole(3, "Microsoft", "Xbox One", "Custom GPU", 500, "1080p", 28000, "1 Year"));
        consoleList.add(new GamingConsole(4, "Microsoft", "Xbox Series X", "RDNA 2", 1000, "4K", 55000, "2 Years"));
        consoleList.add(new GamingConsole(5, "Nintendo", "Switch", "Custom GPU", 32, "720p", 30000, "1 Year"));
        consoleList.add(new GamingConsole(6, "Sony", "PS4 Pro", "Custom GPU", 1000, "4K", 40000, "1 Year"));
        consoleList.add(new GamingConsole(7, "Microsoft", "Xbox Series S", "RDNA 2", 512, "1440p", 35000, "1 Year"));
        consoleList.add(new GamingConsole(8, "Nintendo", "Switch OLED", "Custom GPU", 64, "720p", 35000, "1 Year"));
        consoleList.add(new GamingConsole(9, "Sony", "PS3", "Custom GPU", 250, "1080p", 20000, "1 Year"));
        consoleList.add(new GamingConsole(10, "Microsoft", "Xbox 360", "Custom GPU", 250, "1080p", 18000, "1 Year"));
        consoleList.add(new GamingConsole(11, "Sony", "PS2", "Custom GPU", 40, "480p", 12000, "1 Year"));
        consoleList.add(new GamingConsole(12, "Microsoft", "Xbox", "Custom GPU", 8, "480p", 10000, "1 Year"));
        consoleList.add(new GamingConsole(13, "Nintendo", "Wii", "Custom GPU", 512, "480p", 15000, "1 Year"));
        consoleList.add(new GamingConsole(14, "Sony", "PS5 Digital", "RDNA 2", 1000, "4K", 45000, "1 Year"));
        consoleList.add(new GamingConsole(15, "Microsoft", "Xbox One X", "Custom GPU", 1000, "4K", 50000, "2 Years"));

        return consoleList;
    }

    @Bean("p11")
    public List<HairDryer> getHairDryers() {
        List<HairDryer> dryerList = new ArrayList<>();

        dryerList.add(new HairDryer(1, "Philips", "BasicDry", "1200W", 3, "Concentrator", 1200, "1 Year"));
        dryerList.add(new HairDryer(2, "Bajaj", "EasyDry", "1000W", 2, "Diffuser", 1000, "1 Year"));
        dryerList.add(new HairDryer(3, "Braun", "ProDry", "1500W", 3, "Concentrator", 1800, "2 Years"));
        dryerList.add(new HairDryer(4, "Panasonic", "QuickDry", "1300W", 3, "Concentrator", 2000, "2 Years"));
        dryerList.add(new HairDryer(5, "Nova", "SilkDry", "1200W", 2, "Diffuser", 900, "1 Year"));
        dryerList.add(new HairDryer(6, "Philips", "EasyBlow", "1400W", 3, "Concentrator", 1600, "1 Year"));
        dryerList.add(new HairDryer(7, "Bajaj", "BlowMax", "1200W", 3, "Diffuser", 1100, "1 Year"));
        dryerList.add(new HairDryer(8, "Braun", "DryPro 2", "1500W", 3, "Concentrator", 1900, "2 Years"));
        dryerList.add(new HairDryer(9, "Nova", "QuickBlow", "1000W", 2, "Diffuser", 950, "1 Year"));
        dryerList.add(new HairDryer(10, "Panasonic", "DryMax", "1300W", 3, "Concentrator", 2000, "2 Years"));
        dryerList.add(new HairDryer(11, "Philips", "MiniDry", "1000W", 2, "Diffuser", 800, "1 Year"));
        dryerList.add(new HairDryer(12, "Bajaj", "SilkBlow", "1200W", 3, "Concentrator", 1200, "1 Year"));
        dryerList.add(new HairDryer(13, "Nova", "BlowPro", "1300W", 3, "Concentrator", 1500, "1 Year"));
        dryerList.add(new HairDryer(14, "Braun", "EasyDry 2", "1400W", 3, "Diffuser", 1800, "2 Years"));
        dryerList.add(new HairDryer(15, "Panasonic", "SilkDry", "1500W", 3, "Concentrator", 2100, "2 Years"));

        return dryerList;
    }

    @Bean("p12")
    public List<Headphones> getHeadphones() {
        List<Headphones> headphoneList = new ArrayList<>();

        headphoneList.add(new Headphones(1, "Sony", "WH-1000XM4", "QN1", 30, "Plastic", 25000, "1 Year"));
        headphoneList.add(new Headphones(2, "Bose", "QuietComfort 35", "Custom Chip", 20, "Plastic", 22000, "1 Year"));
        headphoneList.add(new Headphones(3, "JBL", "Tune 750BTNC", "JBL Chip", 15, "Plastic", 8000, "1 Year"));
        headphoneList.add(new Headphones(4, "Sennheiser", "HD 450BT", "Sennheiser Chip", 20, "Plastic", 12000, "1 Year"));
        headphoneList.add(new Headphones(5, "Boat", "Rockerz 510", "Generic Chip", 12, "Plastic", 3000, "6 Months"));
        headphoneList.add(new Headphones(6, "Sony", "WH-CH710N", "QN1", 35, "Plastic", 12000, "1 Year"));
        headphoneList.add(new Headphones(7, "Bose", "SoundLink", "Custom Chip", 18, "Plastic", 18000, "1 Year"));
        headphoneList.add(new Headphones(8, "JBL", "Live 650BTNC", "JBL Chip", 20, "Plastic", 9000, "1 Year"));
        headphoneList.add(new Headphones(9, "Sennheiser", "HD 350BT", "Sennheiser Chip", 20, "Plastic", 10000, "1 Year"));
        headphoneList.add(new Headphones(10, "Boat", "Rockerz 600", "Generic Chip", 10, "Plastic", 2500, "6 Months"));
        headphoneList.add(new Headphones(11, "Sony", "WH-1000XM3", "QN1", 30, "Plastic", 20000, "1 Year"));
        headphoneList.add(new Headphones(12, "Bose", "QuietComfort 25", "Custom Chip", 20, "Plastic", 20000, "1 Year"));
        headphoneList.add(new Headphones(13, "JBL", "Club 950NC", "JBL Chip", 20, "Plastic", 12000, "1 Year"));
        headphoneList.add(new Headphones(14, "Sennheiser", "Momentum 3", "Sennheiser Chip", 17, "Metal + Plastic", 30000, "1 Year"));

        return headphoneList;
    }

    @Bean("p13")
    public List<HomeTheaterSystem> getHomeTheaters() {
        List<HomeTheaterSystem> htList = new ArrayList<>();

        htList.add(new HomeTheaterSystem(1, "Sony", "HT-S20R", "5.1 Channel", 5, "Active Subwoofer", 20000, "1 Year"));
        htList.add(new HomeTheaterSystem(2, "LG", "LHD657", "5.1 Channel", 5, "Active Subwoofer", 18000, "1 Year"));
        htList.add(new HomeTheaterSystem(3, "Bose", "CineMate 15", "2.1 Channel", 2, "Active Subwoofer", 25000, "1 Year"));
        htList.add(new HomeTheaterSystem(4, "Samsung", "HT-J5500K", "5.1 Channel", 5, "Active Subwoofer", 22000, "1 Year"));
        htList.add(new HomeTheaterSystem(5, "Philips", "HTD3510", "2.1 Channel", 2, "Active Subwoofer", 12000, "1 Year"));
        htList.add(new HomeTheaterSystem(6, "Sony", "HT-RT3", "5.1 Channel", 5, "Active Subwoofer", 24000, "1 Year"));
        htList.add(new HomeTheaterSystem(7, "LG", "LHD657B", "5.1 Channel", 5, "Active Subwoofer", 19000, "1 Year"));
        htList.add(new HomeTheaterSystem(8, "Bose", "Lifestyle 135", "5.1 Channel", 5, "Active Subwoofer", 40000, "2 Years"));
        htList.add(new HomeTheaterSystem(9, "Samsung", "HT-Z410", "2.1 Channel", 2, "Active Subwoofer", 15000, "1 Year"));
        htList.add(new HomeTheaterSystem(10, "Philips", "HTB3580", "2.1 Channel", 2, "Active Subwoofer", 13000, "1 Year"));
        htList.add(new HomeTheaterSystem(11, "Sony", "HT-X8500", "2.1 Channel", 2, "Active Subwoofer", 18000, "1 Year"));
        htList.add(new HomeTheaterSystem(12, "LG", "LHD657A", "5.1 Channel", 5, "Active Subwoofer", 20000, "1 Year"));
        htList.add(new HomeTheaterSystem(13, "Bose", "CineMate 12", "2.1 Channel", 2, "Active Subwoofer", 23000, "1 Year"));
        htList.add(new HomeTheaterSystem(14, "Samsung", "HT-E350K", "5.1 Channel", 5, "Active Subwoofer", 21000, "1 Year"));
        htList.add(new HomeTheaterSystem(15, "Philips", "HTL1190B", "2.1 Channel", 2, "Active Subwoofer", 14000, "1 Year"));

        return htList;
    }

    @Bean("p14")
    public List<InductionStove> getInductionStoves() {
        List<InductionStove> inductionList = new ArrayList<>();

        inductionList.add(new InductionStove(1, "Philips", "DailyCook", "Single Coil", 5, "Touch Panel", 2000, "1 Year"));
        inductionList.add(new InductionStove(2, "Bajaj", "Majesty", "Single Coil", 5, "Knob Panel", 1800, "1 Year"));
        inductionList.add(new InductionStove(3, "Prestige", "PIC 20.0", "Double Coil", 6, "Touch Panel", 2500, "2 Years"));
        inductionList.add(new InductionStove(4, "Usha", "CookMaster", "Single Coil", 5, "Touch Panel", 2200, "1 Year"));
        inductionList.add(new InductionStove(5, "Butterfly", "SmartCook", "Single Coil", 5, "Touch Panel", 2100, "1 Year"));
        inductionList.add(new InductionStove(6, "Philips", "VivaCollection", "Single Coil", 6, "Touch Panel", 2300, "1 Year"));
        inductionList.add(new InductionStove(7, "Bajaj", "FlipkartSpecial", "Single Coil", 5, "Knob Panel", 1900, "1 Year"));
        inductionList.add(new InductionStove(8, "Prestige", "Deluxe", "Double Coil", 6, "Touch Panel", 2600, "2 Years"));
        inductionList.add(new InductionStove(9, "Usha", "EasyCook", "Single Coil", 5, "Touch Panel", 2000, "1 Year"));
        inductionList.add(new InductionStove(10, "Butterfly", "ChefPro", "Single Coil", 5, "Touch Panel", 2200, "1 Year"));
        inductionList.add(new InductionStove(11, "Philips", "RapidCook", "Single Coil", 6, "Touch Panel", 2400, "1 Year"));
        inductionList.add(new InductionStove(12, "Bajaj", "MagicCook", "Single Coil", 5, "Knob Panel", 1850, "1 Year"));
        inductionList.add(new InductionStove(13, "Prestige", "SuperCook", "Double Coil", 6, "Touch Panel", 2700, "2 Years"));
        inductionList.add(new InductionStove(14, "Usha", "CookEasy", "Single Coil", 5, "Touch Panel", 2100, "1 Year"));
        inductionList.add(new InductionStove(15, "Butterfly", "SmartHeat", "Single Coil", 6, "Touch Panel", 2300, "2 Years"));

        return inductionList;
    }

    @Bean("p15")
    public List<Keyboard> getKeyboards() {
        List<Keyboard> keyboardList = new ArrayList<>();

        keyboardList.add(new Keyboard(1, "Logitech", "Membrane", "Rubber Dome", 104, "RGB", 2000, "1 Year"));
        keyboardList.add(new Keyboard(2, "Corsair", "Mechanical", "Cherry MX Red", 104, "RGB", 8000, "2 Years"));
        keyboardList.add(new Keyboard(3, "Razer", "Mechanical", "Razer Green", 105, "RGB", 9000, "2 Years"));
        keyboardList.add(new Keyboard(4, "HP", "Membrane", "Rubber Dome", 104, "White LED", 1500, "1 Year"));
        keyboardList.add(new Keyboard(5, "Dell", "Membrane", "Rubber Dome", 104, "White LED", 1200, "1 Year"));
        keyboardList.add(new Keyboard(6, "Logitech", "Mechanical", "Romer-G", 104, "RGB", 7000, "2 Years"));
        keyboardList.add(new Keyboard(7, "Corsair", "Mechanical", "Cherry MX Blue", 105, "RGB", 8500, "2 Years"));
        keyboardList.add(new Keyboard(8, "Razer", "Mechanical", "Razer Yellow", 104, "RGB", 9500, "2 Years"));
        keyboardList.add(new Keyboard(9, "HP", "Membrane", "Rubber Dome", 104, "Blue LED", 1400, "1 Year"));
        keyboardList.add(new Keyboard(10, "Dell", "Membrane", "Rubber Dome", 104, "Blue LED", 1300, "1 Year"));
        keyboardList.add(new Keyboard(11, "Logitech", "Mechanical", "Romer-G Tactile", 104, "RGB", 7500, "2 Years"));
        keyboardList.add(new Keyboard(12, "Corsair", "Mechanical", "Cherry MX Brown", 105, "RGB", 8000, "2 Years"));
        keyboardList.add(new Keyboard(13, "Razer", "Mechanical", "Razer Green", 104, "RGB", 9200, "2 Years"));
        keyboardList.add(new Keyboard(14, "HP", "Membrane", "Rubber Dome", 104, "White LED", 1600, "1 Year"));
        keyboardList.add(new Keyboard(15, "Dell", "Mechanical", "Cherry MX Red", 104, "RGB", 8500, "2 Years"));

        return keyboardList;
    }

    @Bean("p16")
    public List<Laptop> getLaptops() {
        List<Laptop> laptopList = new ArrayList<>();

        laptopList.add(new Laptop(1, "Dell", "Inspiron 15", "i5", 8, "512GB SSD", 50000, "1 Year"));
        laptopList.add(new Laptop(2, "HP", "Pavilion 14", "i5", 8, "256GB SSD", 48000, "1 Year"));
        laptopList.add(new Laptop(3, "Lenovo", "Ideapad 3", "i3", 4, "1TB HDD", 35000, "1 Year"));
        laptopList.add(new Laptop(4, "Acer", "Aspire 5", "i5", 8, "512GB SSD", 52000, "1 Year"));
        laptopList.add(new Laptop(5, "Asus", "VivoBook 14", "i5", 8, "256GB SSD", 47000, "1 Year"));
        laptopList.add(new Laptop(6, "Dell", "XPS 13", "i7", 16, "1TB SSD", 95000, "2 Years"));
        laptopList.add(new Laptop(7, "HP", "Envy 13", "i7", 16, "512GB SSD", 90000, "2 Years"));
        laptopList.add(new Laptop(8, "Lenovo", "ThinkPad E14", "i5", 8, "512GB SSD", 60000, "1 Year"));
        laptopList.add(new Laptop(9, "Acer", "Swift 3", "i5", 8, "256GB SSD", 52000, "1 Year"));
        laptopList.add(new Laptop(10, "Asus", "ZenBook 14", "i7", 16, "1TB SSD", 90000, "2 Years"));
        laptopList.add(new Laptop(11, "Dell", "Vostro 15", "i3", 4, "1TB HDD", 40000, "1 Year"));
        laptopList.add(new Laptop(12, "HP", "Omen 15", "i7", 16, "1TB SSD", 100000, "2 Years"));
        laptopList.add(new Laptop(13, "Lenovo", "Legion 5", "i7", 16, "512GB SSD", 95000, "2 Years"));
        laptopList.add(new Laptop(14, "Acer", "Predator Helios", "i7", 16, "1TB SSD", 120000, "2 Years"));
        laptopList.add(new Laptop(15, "Asus", "TUF Gaming", "i5", 8, "512GB SSD", 75000, "1 Year"));

        return laptopList;
    }

    @Bean("p17")
    public List<MicrowaveOven> getMicrowaveOvens() {
        List<MicrowaveOven> microwaveList = new ArrayList<>();

        microwaveList.add(new MicrowaveOven(1, "Samsung", "MS23K3513AS", "Convection", 800, "23L", 12000, "1 Year"));
        microwaveList.add(new MicrowaveOven(2, "LG", "MC2846BRUM", "Convection", 900, "28L", 15000, "1 Year"));
        microwaveList.add(new MicrowaveOven(3, "IFB", "20SC4", "Solo", 700, "20L", 9000, "1 Year"));
        microwaveList.add(new MicrowaveOven(4, "Bajaj", "MW25F", "Solo", 700, "25L", 8500, "1 Year"));
        microwaveList.add(new MicrowaveOven(5, "Panasonic", "NN-ST26", "Solo", 800, "20L", 9500, "1 Year"));
        microwaveList.add(new MicrowaveOven(6, "Samsung", "MC28M6055CS", "Convection", 900, "28L", 16000, "2 Years"));
        microwaveList.add(new MicrowaveOven(7, "LG", "MC2146BRUM", "Solo", 800, "21L", 10000, "1 Year"));
        microwaveList.add(new MicrowaveOven(8, "IFB", "30SC4", "Convection", 1000, "30L", 17000, "2 Years"));
        microwaveList.add(new MicrowaveOven(9, "Bajaj", "MW20F", "Solo", 700, "20L", 8000, "1 Year"));
        microwaveList.add(new MicrowaveOven(10, "Panasonic", "NN-GT26", "Solo", 800, "23L", 10500, "1 Year"));
        microwaveList.add(new MicrowaveOven(11, "Samsung", "MS23F301TAS", "Solo", 800, "23L", 11000, "1 Year"));
        microwaveList.add(new MicrowaveOven(12, "LG", "MC2546BRUM", "Convection", 900, "25L", 15500, "2 Years"));
        microwaveList.add(new MicrowaveOven(13, "IFB", "25SC4", "Solo", 750, "25L", 12000, "1 Year"));
        microwaveList.add(new MicrowaveOven(14, "Bajaj", "MW28F", "Convection", 900, "28L", 13500, "2 Years"));
        microwaveList.add(new MicrowaveOven(15, "Panasonic", "NN-ST34", "Solo", 800, "23L", 11500, "1 Year"));

        return microwaveList;
    }


    @Bean("p18")
    public List<MobilePhone> getMobilePhones() {
        List<MobilePhone> mobileList = new ArrayList<>();

        mobileList.add(new MobilePhone(1, "Samsung", "Galaxy M32", "MediaTek Helio G80", 6, "128GB", 16000, "1 Year"));
        mobileList.add(new MobilePhone(2, "Xiaomi", "Redmi Note 11", "Snapdragon 680", 6, "128GB", 15000, "1 Year"));
        mobileList.add(new MobilePhone(3, "Realme", "Narzo 50", "MediaTek Helio G96", 4, "64GB", 12000, "1 Year"));
        mobileList.add(new MobilePhone(4, "Samsung", "Galaxy F22", "MediaTek Helio G80", 4, "64GB", 13000, "1 Year"));
        mobileList.add(new MobilePhone(5, "Xiaomi", "Redmi 10", "MediaTek Helio G88", 4, "64GB", 11000, "1 Year"));
        mobileList.add(new MobilePhone(6, "Realme", "C35", "Unisoc T616", 4, "64GB", 10000, "1 Year"));
        mobileList.add(new MobilePhone(7, "Samsung", "Galaxy A12", "Exynos 850", 4, "64GB", 12000, "1 Year"));
        mobileList.add(new MobilePhone(8, "Xiaomi", "Redmi Note 10 Pro", "Snapdragon 732G", 6, "128GB", 18000, "1 Year"));
        mobileList.add(new MobilePhone(9, "Realme", "9i", "Snapdragon 680", 4, "64GB", 14000, "1 Year"));
        mobileList.add(new MobilePhone(10, "Samsung", "Galaxy M12", "Exynos 850", 4, "64GB", 11000, "1 Year"));
        mobileList.add(new MobilePhone(11, "Xiaomi", "Redmi 9 Power", "Snapdragon 662", 4, "64GB", 10000, "1 Year"));
        mobileList.add(new MobilePhone(12, "Realme", "Narzo 30A", "MediaTek Helio G85", 3, "32GB", 9000, "1 Year"));
        mobileList.add(new MobilePhone(13, "Samsung", "Galaxy F41", "Exynos 9611", 6, "128GB", 16000, "1 Year"));
        mobileList.add(new MobilePhone(14, "Xiaomi", "Redmi Note 9 Pro", "Snapdragon 720G", 6, "128GB", 15000, "1 Year"));
        mobileList.add(new MobilePhone(15, "Realme", "C21Y", "Unisoc T610", 3, "32GB", 8500, "1 Year"));

        return mobileList;
    }

    @Bean("p19")
    public List<Mouse> getMice() {
        List<Mouse> mouseList = new ArrayList<>();

        mouseList.add(new Mouse(1, "Logitech", "M100", "Optical", 1000, "Wired", 500, "1 Year"));
        mouseList.add(new Mouse(2, "HP", "X1000", "Optical", 1200, "Wired", 600, "1 Year"));
        mouseList.add(new Mouse(3, "Dell", "MS116", "Optical", 1000, "Wired", 550, "1 Year"));
        mouseList.add(new Mouse(4, "Logitech", "M330", "Optical", 1000, "Wireless", 1200, "1 Year"));
        mouseList.add(new Mouse(5, "HP", "X400", "Optical", 1600, "Wireless", 1300, "1 Year"));
        mouseList.add(new Mouse(6, "Dell", "WM126", "Optical", 1000, "Wireless", 1100, "1 Year"));
        mouseList.add(new Mouse(7, "Logitech", "G102", "Optical", 8000, "Wired", 1500, "1 Year"));
        mouseList.add(new Mouse(8, "HP", "Omen Vector", "Optical", 16000, "Wired", 2500, "1 Year"));
        mouseList.add(new Mouse(9, "Dell", "Alienware Elite", "Laser", 16000, "Wired", 3000, "2 Years"));
        mouseList.add(new Mouse(10, "Logitech", "MX Master 3", "Laser", 4000, "Wireless", 7000, "2 Years"));
        mouseList.add(new Mouse(11, "HP", "X3000", "Optical", 1000, "Wireless", 1200, "1 Year"));
        mouseList.add(new Mouse(12, "Dell", "MS3320W", "Optical", 1600, "Wireless", 1500, "1 Year"));
        mouseList.add(new Mouse(13, "Logitech", "G203", "Optical", 6000, "Wired", 1200, "1 Year"));
        mouseList.add(new Mouse(14, "HP", "X200", "Optical", 800, "Wired", 500, "1 Year"));
        mouseList.add(new Mouse(15, "Dell", "MS116W", "Optical", 1000, "Wireless", 1100, "1 Year"));

        return mouseList;
    }

    @Bean("p20")
    public List<OvenToasterGrill> getOvenToasterGrills() {
        List<OvenToasterGrill> otgList = new ArrayList<>();

        otgList.add(new OvenToasterGrill(1, "Bajaj", "OTG 1603 TSS", "Convection", 16, "Rotary Knobs", 2500, "12 Months"));
        otgList.add(new OvenToasterGrill(2, "Morphy Richards", "OTG 19SS", "Convection", 19, "Rotary Knobs", 3000, "12 Months"));
        otgList.add(new OvenToasterGrill(3, "LG", "OTG 32L", "Convection", 32, "Rotary Knobs", 4500, "12 Months"));
        otgList.add(new OvenToasterGrill(4, "Samsung", "OTG 28L", "Convection", 28, "Rotary Knobs", 4000, "12 Months"));
        otgList.add(new OvenToasterGrill(5, "Panasonic", "NB-H3200", "Convection", 32, "Rotary Knobs", 5000, "12 Months"));
        otgList.add(new OvenToasterGrill(6, "Bajaj", "OTG 33L", "Convection", 33, "Rotary Knobs", 5500, "12 Months"));
        otgList.add(new OvenToasterGrill(7, "Morphy Richards", "OTG 28SS", "Convection", 28, "Rotary Knobs", 4200, "12 Months"));
        otgList.add(new OvenToasterGrill(8, "LG", "OTG 32L Deluxe", "Convection", 32, "Rotary Knobs", 4700, "12 Months"));
        otgList.add(new OvenToasterGrill(9, "Samsung", "OTG 30L", "Convection", 30, "Rotary Knobs", 4300, "12 Months"));
        otgList.add(new OvenToasterGrill(10, "Panasonic", "NB-H3201", "Convection", 32, "Rotary Knobs", 5100, "12 Months"));
        otgList.add(new OvenToasterGrill(11, "Bajaj", "OTG 17L", "Convection", 17, "Rotary Knobs", 2600, "12 Months"));
        otgList.add(new OvenToasterGrill(12, "Morphy Richards", "OTG 20SS", "Convection", 20, "Rotary Knobs", 3200, "12 Months"));
        otgList.add(new OvenToasterGrill(13, "LG", "OTG 28L Pro", "Convection", 28, "Rotary Knobs", 4400, "12 Months"));
        otgList.add(new OvenToasterGrill(14, "Samsung", "OTG 32L Plus", "Convection", 32, "Rotary Knobs", 4600, "12 Months"));
        otgList.add(new OvenToasterGrill(15, "Panasonic", "NB-H3202", "Convection", 32, "Rotary Knobs", 5200, "12 Months"));

        return otgList;
    }

    @Bean("p21")
    public List<PowerBank> getPowerBanks() {
        List<PowerBank> powerBankList = new ArrayList<>();

        powerBankList.add(new PowerBank(1, "Mi", "Mi 10000mAh", "Li-ion", 10000, "2 USB Ports", 800, "1 Year"));
        powerBankList.add(new PowerBank(2, "Samsung", "EB-P1100", "Li-ion", 10000, "1 USB Port", 1200, "1 Year"));
        powerBankList.add(new PowerBank(3, "Realme", "PB 20000", "Li-ion", 20000, "2 USB Ports", 1500, "1 Year"));
        powerBankList.add(new PowerBank(4, "Ambrane", "PB 10000", "Li-ion", 10000, "2 USB Ports", 700, "6 Months"));
        powerBankList.add(new PowerBank(5, "Portronics", "PB 20000", "Li-ion", 20000, "2 USB Ports", 1600, "1 Year"));
        powerBankList.add(new PowerBank(6, "Mi", "Mi 20000mAh", "Li-ion", 20000, "2 USB Ports", 1500, "1 Year"));
        powerBankList.add(new PowerBank(7, "Samsung", "EB-P3300", "Li-ion", 20000, "2 USB Ports", 2000, "1 Year"));
        powerBankList.add(new PowerBank(8, "Realme", "PB 10000", "Li-ion", 10000, "1 USB Port", 900, "1 Year"));
        powerBankList.add(new PowerBank(9, "Ambrane", "PB 20000", "Li-ion", 20000, "2 USB Ports", 1400, "6 Months"));
        powerBankList.add(new PowerBank(10, "Portronics", "PB 10000", "Li-ion", 10000, "1 USB Port", 800, "1 Year"));
        powerBankList.add(new PowerBank(11, "Mi", "Mi 15000mAh", "Li-ion", 15000, "2 USB Ports", 1200, "1 Year"));
        powerBankList.add(new PowerBank(12, "Samsung", "EB-P5000", "Li-ion", 15000, "1 USB Port", 1300, "1 Year"));
        powerBankList.add(new PowerBank(13, "Realme", "PB 15000", "Li-ion", 15000, "2 USB Ports", 1400, "1 Year"));
        powerBankList.add(new PowerBank(14, "Ambrane", "PB 15000", "Li-ion", 15000, "2 USB Ports", 1300, "6 Months"));
        powerBankList.add(new PowerBank(15, "Portronics", "PB 15000", "Li-ion", 15000, "2 USB Ports", 1350, "1 Year"));

        return powerBankList;
    }

    @Bean("p22")
    public List<Printer> getPrinters() {
        List<Printer> printerList = new ArrayList<>();

        printerList.add(new Printer(1, "HP", "LaserJet Pro M15w", "Laser", 19, "A4", 7000, "1 Year"));
        printerList.add(new Printer(2, "Canon", "PIXMA G3010", "Inkjet", 8, "A4", 9000, "1 Year"));
        printerList.add(new Printer(3, "Epson", "EcoTank L3110", "Inkjet", 10, "A4", 9500, "1 Year"));
        printerList.add(new Printer(4, "Brother", "HL-L2350DW", "Laser", 30, "A4", 12000, "1 Year"));
        printerList.add(new Printer(5, "HP", "DeskJet 2331", "Inkjet", 7, "A4", 4500, "1 Year"));
        printerList.add(new Printer(6, "Canon", "PIXMA E477", "Inkjet", 8, "A4", 5500, "1 Year"));
        printerList.add(new Printer(7, "Epson", "L3150", "Inkjet", 10, "A4", 9500, "1 Year"));
        printerList.add(new Printer(8, "Brother", "DCP-T510W", "Inkjet", 12, "A4", 10000, "1 Year"));
        printerList.add(new Printer(9, "HP", "LaserJet Pro MFP M28w", "Laser", 19, "A4", 8000, "1 Year"));
        printerList.add(new Printer(10, "Canon", "PIXMA TS207", "Inkjet", 8, "A4", 4000, "1 Year"));
        printerList.add(new Printer(11, "Epson", "L3100", "Inkjet", 10, "A4", 9000, "1 Year"));
        printerList.add(new Printer(12, "Brother", "HL-L2370DW", "Laser", 30, "A4", 13000, "1 Year"));
        printerList.add(new Printer(13, "HP", "DeskJet 1112", "Inkjet", 7, "A4", 3500, "1 Year"));
        printerList.add(new Printer(14, "Canon", "PIXMA TS307", "Inkjet", 8, "A4", 5000, "1 Year"));
        printerList.add(new Printer(15, "Epson", "L3151", "Inkjet", 10, "A4", 9500, "1 Year"));

        return printerList;
    }

    @Bean("p23")
    public List<Projector> getProjectors() {
        List<Projector> projectorList = new ArrayList<>();

        projectorList.add(new Projector(1, "Epson", "EB-X41", "LED", 3600, "XGA", 45000, "1 Year"));
        projectorList.add(new Projector(2, "BenQ", "MS535", "LED", 3600, "SVGA", 42000, "1 Year"));
        projectorList.add(new Projector(3, "Optoma", "HD143X", "LED", 3000, "Full HD", 55000, "1 Year"));
        projectorList.add(new Projector(4, "ViewSonic", "PA503S", "LED", 3600, "SVGA", 40000, "1 Year"));
        projectorList.add(new Projector(5, "Epson", "EB-S41", "LED", 3200, "SVGA", 43000, "1 Year"));
        projectorList.add(new Projector(6, "BenQ", "TH585", "LED", 3500, "Full HD", 50000, "1 Year"));
        projectorList.add(new Projector(7, "Optoma", "ML330", "LED", 500, "HD", 25000, "6 Months"));
        projectorList.add(new Projector(8, "ViewSonic", "M1 Mini Plus", "LED", 120, "WVGA", 15000, "6 Months"));
        projectorList.add(new Projector(9, "Epson", "EB-W05", "LED", 3300, "WXGA", 46000, "1 Year"));
        projectorList.add(new Projector(10, "BenQ", "MW535A", "LED", 3600, "WXGA", 48000, "1 Year"));
        projectorList.add(new Projector(11, "Optoma", "HD26", "LED", 3300, "Full HD", 52000, "1 Year"));
        projectorList.add(new Projector(12, "ViewSonic", "PA503W", "LED", 3600, "WXGA", 42000, "1 Year"));
        projectorList.add(new Projector(13, "Epson", "EB-U42", "LED", 3600, "Full HD", 60000, "2 Years"));
        projectorList.add(new Projector(14, "BenQ", "TH671ST", "LED", 3000, "Full HD", 55000, "1 Year"));
        projectorList.add(new Projector(15, "Optoma", "HD146X", "LED", 3600, "Full HD", 52000, "1 Year"));

        return projectorList;
    }

    @Bean("p24")
    public List<Refrigerator> getRefrigerators() {
        List<Refrigerator> refrigeratorList = new ArrayList<>();

        refrigeratorList.add(new Refrigerator(1, "LG", "GL-B201APZX", "Inverter", 4, "190L", 18000, "1 Year"));
        refrigeratorList.add(new Refrigerator(2, "Samsung", "RR20T2H2XCU", "Inverter", 4, "192L", 19000, "1 Year"));
        refrigeratorList.add(new Refrigerator(3, "Whirlpool", "205 IMPC ROY 3S", "Compressor", 3, "205L", 17000, "1 Year"));
        refrigeratorList.add(new Refrigerator(4, "Godrej", "RD EDGE 215 CF 2.2", "Compressor", 4, "215L", 20000, "1 Year"));
        refrigeratorList.add(new Refrigerator(5, "Haier", "HRF-2827PSN-E", "Inverter", 3, "258L", 22000, "1 Year"));
        refrigeratorList.add(new Refrigerator(6, "LG", "GL-B201RPZX", "Inverter", 3, "190L", 17500, "1 Year"));
        refrigeratorList.add(new Refrigerator(7, "Samsung", "RR20T2H2WWC", "Inverter", 3, "192L", 18500, "1 Year"));
        refrigeratorList.add(new Refrigerator(8, "Whirlpool", "205 IMPROX ROY 3S", "Compressor", 4, "205L", 18000, "1 Year"));
        refrigeratorList.add(new Refrigerator(9, "Godrej", "RD EDGE 200 CF 2.0", "Compressor", 3, "200L", 19000, "1 Year"));
        refrigeratorList.add(new Refrigerator(10, "Haier", "HRF-2600PSN-E", "Inverter", 4, "260L", 23000, "1 Year"));
        refrigeratorList.add(new Refrigerator(11, "LG", "GL-B201APZXX", "Inverter", 4, "190L", 18500, "1 Year"));
        refrigeratorList.add(new Refrigerator(12, "Samsung", "RR20T2H2XWW", "Inverter", 4, "192L", 19500, "1 Year"));
        refrigeratorList.add(new Refrigerator(13, "Whirlpool", "205 IMPRO ROY 3S", "Compressor", 3, "205L", 17500, "1 Year"));
        refrigeratorList.add(new Refrigerator(14, "Godrej", "RD EDGE 220 CF 2.2", "Compressor", 4, "220L", 21000, "1 Year"));
        refrigeratorList.add(new Refrigerator(15, "Haier", "HRF-2850PSN-E", "Inverter", 3, "285L", 24000, "1 Year"));

        return refrigeratorList;
    }

    @Bean("p25")
    public List<Router> getRouters() {
        List<Router> routerList = new ArrayList<>();

        routerList.add(new Router(1, "TP-Link", "TL-WR840N", "2.4GHz", 2, "Wired/Wireless", 900, "1 Year"));
        routerList.add(new Router(2, "D-Link", "DIR-615", "2.4GHz", 2, "Wired/Wireless", 950, "1 Year"));
        routerList.add(new Router(3, "Netgear", "R6120", "2.4GHz/5GHz", 2, "Wireless", 1800, "1 Year"));
        routerList.add(new Router(4, "TP-Link", "Archer C20", "2.4GHz/5GHz", 3, "Wireless", 2000, "1 Year"));
        routerList.add(new Router(5, "D-Link", "DIR-825", "2.4GHz/5GHz", 4, "Wireless", 2500, "1 Year"));
        routerList.add(new Router(6, "Netgear", "R6230", "2.4GHz/5GHz", 3, "Wireless", 2200, "1 Year"));
        routerList.add(new Router(7, "TP-Link", "TL-WR841N", "2.4GHz", 2, "Wired/Wireless", 950, "1 Year"));
        routerList.add(new Router(8, "D-Link", "DIR-822", "2.4GHz/5GHz", 3, "Wireless", 2100, "1 Year"));
        routerList.add(new Router(9, "Netgear", "R6700", "2.4GHz/5GHz", 3, "Wireless", 3200, "1 Year"));
        routerList.add(new Router(10, "TP-Link", "Archer C6", "2.4GHz/5GHz", 4, "Wireless", 2800, "1 Year"));
        routerList.add(new Router(11, "D-Link", "DIR-615 Rev D", "2.4GHz", 2, "Wired/Wireless", 1000, "1 Year"));
        routerList.add(new Router(12, "Netgear", "R6120-100INS", "2.4GHz/5GHz", 2, "Wireless", 1850, "1 Year"));
        routerList.add(new Router(13, "TP-Link", "Archer A7", "2.4GHz/5GHz", 3, "Wireless", 3500, "1 Year"));
        routerList.add(new Router(14, "D-Link", "DIR-825/AC", "2.4GHz/5GHz", 4, "Wireless", 2600, "1 Year"));
        routerList.add(new Router(15, "Netgear", "R6230-100INS", "2.4GHz/5GHz", 3, "Wireless", 2250, "1 Year"));

        return routerList;
    }

    @Bean("p26")
    public List<SmartSpeaker> getSmartSpeakers() {
        List<SmartSpeaker> smartSpeakerList = new ArrayList<>();

        smartSpeakerList.add(new SmartSpeaker(1, "Amazon", "Echo Dot 4th Gen", "Alexa Chip", 2, "Stereo", 4500, "1 Year"));
        smartSpeakerList.add(new SmartSpeaker(2, "Google", "Nest Mini", "Google Assistant Chip", 2, "Stereo", 4000, "1 Year"));
        smartSpeakerList.add(new SmartSpeaker(3, "Apple", "HomePod Mini", "Siri Chip", 3, "Stereo", 9000, "1 Year"));
        smartSpeakerList.add(new SmartSpeaker(4, "JBL", "Link 10", "Voice Chip", 2, "Stereo", 5000, "1 Year"));
        smartSpeakerList.add(new SmartSpeaker(5, "Sony", "LF-S50G", "Google Assistant Chip", 2, "Stereo", 6000, "1 Year"));
        smartSpeakerList.add(new SmartSpeaker(6, "Bose", "Home Speaker 300", "Voice Chip", 2, "Stereo", 12000, "1 Year"));
        smartSpeakerList.add(new SmartSpeaker(7, "Amazon", "Echo 3rd Gen", "Alexa Chip", 4, "Stereo", 8000, "1 Year"));
        smartSpeakerList.add(new SmartSpeaker(8, "Google", "Nest Audio", "Google Assistant Chip", 3, "Stereo", 7500, "1 Year"));
        smartSpeakerList.add(new SmartSpeaker(9, "Apple", "HomePod", "Siri Chip", 6, "Stereo", 25000, "1 Year"));
        smartSpeakerList.add(new SmartSpeaker(10, "JBL", "Link 20", "Voice Chip", 2, "Stereo", 5500, "1 Year"));
        smartSpeakerList.add(new SmartSpeaker(11, "Sony", "LF-S50B", "Voice Chip", 2, "Stereo", 6200, "1 Year"));
        smartSpeakerList.add(new SmartSpeaker(12, "Bose", "Home Speaker 500", "Voice Chip", 4, "Stereo", 15000, "1 Year"));
        smartSpeakerList.add(new SmartSpeaker(13, "Amazon", "Echo Plus", "Alexa Chip", 4, "Stereo", 9000, "1 Year"));
        smartSpeakerList.add(new SmartSpeaker(14, "Google", "Nest Hub", "Google Assistant Chip", 2, "Stereo", 7000, "1 Year"));
        smartSpeakerList.add(new SmartSpeaker(15, "Apple", "HomePod Mini 2", "Siri Chip", 3, "Stereo", 9500, "1 Year"));

        return smartSpeakerList;
    }

    @Bean("p27")
    public List<SmartWatch> getSmartWatches() {
        List<SmartWatch> smartWatchList = new ArrayList<>();

        smartWatchList.add(new SmartWatch(1, "Apple", "Watch SE", "Optical", 32, "Silicone", 25000, "1 Year"));
        smartWatchList.add(new SmartWatch(2, "Samsung", "Galaxy Watch 4", "Optical", 16, "Silicone", 20000, "1 Year"));
        smartWatchList.add(new SmartWatch(3, "Fitbit", "Versa 3", "Optical", 8, "Silicone", 15000, "1 Year"));
        smartWatchList.add(new SmartWatch(4, "Amazfit", "GTS 2 Mini", "Optical", 4, "Silicone", 8000, "1 Year"));
        smartWatchList.add(new SmartWatch(5, "Noise", "ColorFit Pro 3", "Optical", 4, "Silicone", 5000, "1 Year"));
        smartWatchList.add(new SmartWatch(6, "Apple", "Watch Series 7", "Optical", 32, "Leather", 40000, "1 Year"));
        smartWatchList.add(new SmartWatch(7, "Samsung", "Galaxy Watch 5", "Optical", 16, "Leather", 25000, "1 Year"));
        smartWatchList.add(new SmartWatch(8, "Fitbit", "Sense", "Optical", 8, "Silicone", 18000, "1 Year"));
        smartWatchList.add(new SmartWatch(9, "Amazfit", "Bip U Pro", "Optical", 4, "Silicone", 6000, "1 Year"));
        smartWatchList.add(new SmartWatch(10, "Noise", "Fit Active", "Optical", 4, "Silicone", 4500, "1 Year"));
        smartWatchList.add(new SmartWatch(11, "Apple", "Watch Series 6", "Optical", 32, "Silicone", 35000, "1 Year"));
        smartWatchList.add(new SmartWatch(12, "Samsung", "Galaxy Watch Active 2", "Optical", 16, "Silicone", 22000, "1 Year"));
        smartWatchList.add(new SmartWatch(13, "Fitbit", "Inspire 2", "Optical", 4, "Silicone", 7000, "1 Year"));
        smartWatchList.add(new SmartWatch(14, "Amazfit", "T-Rex Pro", "Optical", 4, "Silicone", 9000, "1 Year"));
        smartWatchList.add(new SmartWatch(15, "Noise", "ColorFit Pulse", "Optical", 4, "Silicone", 5500, "1 Year"));

        return smartWatchList;
    }


    @Bean("p28")
    public List<Tablet> getTablets() {
        List<Tablet> tabletList = new ArrayList<>();

        tabletList.add(new Tablet(1, "Apple", "iPad 10th Gen", "A14 Bionic", 4, "64GB", 35000, "1 Year"));
        tabletList.add(new Tablet(2, "Samsung", "Galaxy Tab S7", "Snapdragon 865+", 6, "128GB", 45000, "1 Year"));
        tabletList.add(new Tablet(3, "Lenovo", "Tab M10", "MediaTek Helio P22T", 4, "64GB", 15000, "1 Year"));
        tabletList.add(new Tablet(4, "Apple", "iPad Air", "A15 Bionic", 6, "256GB", 55000, "1 Year"));
        tabletList.add(new Tablet(5, "Samsung", "Galaxy Tab A7", "Snapdragon 662", 3, "32GB", 18000, "1 Year"));
        tabletList.add(new Tablet(6, "Lenovo", "Tab P11", "Snapdragon 662", 4, "128GB", 22000, "1 Year"));
        tabletList.add(new Tablet(7, "Apple", "iPad Mini", "A15 Bionic", 4, "64GB", 40000, "1 Year"));
        tabletList.add(new Tablet(8, "Samsung", "Galaxy Tab S6 Lite", "Exynos 9611", 4, "64GB", 25000, "1 Year"));
        tabletList.add(new Tablet(9, "Lenovo", "Yoga Tab 11", "Snapdragon 662", 4, "128GB", 30000, "1 Year"));
        tabletList.add(new Tablet(10, "Apple", "iPad Pro 11", "M1", 8, "128GB", 75000, "1 Year"));
        tabletList.add(new Tablet(11, "Samsung", "Galaxy Tab S8", "Snapdragon 8 Gen 1", 8, "128GB", 60000, "1 Year"));
        tabletList.add(new Tablet(12, "Lenovo", "Tab M8", "MediaTek Helio A22", 2, "32GB", 10000, "1 Year"));
        tabletList.add(new Tablet(13, "Apple", "iPad 9th Gen", "A13 Bionic", 3, "64GB", 30000, "1 Year"));
        tabletList.add(new Tablet(14, "Samsung", "Galaxy Tab A8", "Unisoc Tiger T618", 3, "32GB", 16000, "1 Year"));
        tabletList.add(new Tablet(15, "Lenovo", "Tab P12 Pro", "Snapdragon 870", 6, "256GB", 50000, "1 Year"));

        return tabletList;
    }

    @Bean("p29")
    public List<Telivision> getTelevisions() {
        List<Telivision> tvList = new ArrayList<>();

        tvList.add(new Telivision(1, "Samsung", "Series 7", "Crystal UHD", 60, "LED", 45000, "1 Year"));
        tvList.add(new Telivision(2, "LG", "Ultra HD 4K", "α7 Gen 4 AI Processor", 120, "OLED", 90000, "1 Year"));
        tvList.add(new Telivision(3, "Sony", "Bravia X80J", "X-Reality PRO", 60, "LED", 75000, "1 Year"));
        tvList.add(new Telivision(4, "Mi", "LED 4A", "PatchWall", 60, "LED", 18000, "1 Year"));
        tvList.add(new Telivision(5, "OnePlus", "U1S", "Gamma Engine", 60, "LED", 35000, "1 Year"));
        tvList.add(new Telivision(6, "Samsung", "Neo QLED", "Quantum Processor", 120, "QLED", 120000, "1 Year"));
        tvList.add(new Telivision(7, "LG", "NanoCell 85", "α7 AI Processor", 60, "LED", 85000, "1 Year"));
        tvList.add(new Telivision(8, "Sony", "Bravia X90J", "Cognitive Processor XR", 120, "LED", 100000, "1 Year"));
        tvList.add(new Telivision(9, "Mi", "LED 4X", "PatchWall", 60, "LED", 20000, "1 Year"));
        tvList.add(new Telivision(10, "OnePlus", "Y Series", "Gamma Engine", 60, "LED", 32000, "1 Year"));
        tvList.add(new Telivision(11, "Samsung", "The Frame", "Quantum Processor 4K", 60, "QLED", 110000, "1 Year"));
        tvList.add(new Telivision(12, "LG", "OLED C1", "α9 Gen 4 AI Processor", 120, "OLED", 150000, "1 Year"));
        tvList.add(new Telivision(13, "Sony", "Bravia X75J", "4K X-Reality PRO", 60, "LED", 65000, "1 Year"));
        tvList.add(new Telivision(14, "Mi", "LED 4 Pro", "PatchWall", 60, "LED", 25000, "1 Year"));
        tvList.add(new Telivision(15, "OnePlus", "U1 Pro", "Gamma Engine", 60, "LED", 40000, "1 Year"));

        return tvList;
    }


    @Bean("p30")
    public List<VacuumCleaner> getVacuumCleaners() {
        List<VacuumCleaner> vacuumList = new ArrayList<>();

        vacuumList.add(new VacuumCleaner(1, "Dyson", "V11 Torque", "Cordless", 185, "Bin", 45000, "1 Year"));
        vacuumList.add(new VacuumCleaner(2, "Philips", "PowerPro FC9352", "Corded", 650, "Bagless", 12000, "1 Year"));
        vacuumList.add(new VacuumCleaner(3, "Eureka", "Forces 1000W", "Corded", 1000, "Bagless", 9000, "1 Year"));
        vacuumList.add(new VacuumCleaner(4, "Samsung", "Jet 70", "Cordless", 200, "Bin", 25000, "1 Year"));
        vacuumList.add(new VacuumCleaner(5, "LG", "CordZero A9", "Cordless", 210, "Bin", 30000, "1 Year"));
        vacuumList.add(new VacuumCleaner(6, "Bosch", "Relaxx'x ProSilence", "Corded", 1700, "Bag", 18000, "1 Year"));
        vacuumList.add(new VacuumCleaner(7, "Mi", "Robot Vacuum-Mop P", "Robotic", 33, "Dust Bin", 15000, "1 Year"));
        vacuumList.add(new VacuumCleaner(8, "Dyson", "V10 Absolute", "Cordless", 150, "Bin", 40000, "1 Year"));
        vacuumList.add(new VacuumCleaner(9, "Philips", "PowerPro Expert", "Corded", 650, "Bagless", 14000, "1 Year"));
        vacuumList.add(new VacuumCleaner(10, "Eureka", "Forces Turbo", "Corded", 1200, "Bagless", 10000, "1 Year"));
        vacuumList.add(new VacuumCleaner(11, "Samsung", "Jet 60", "Cordless", 180, "Bin", 22000, "1 Year"));
        vacuumList.add(new VacuumCleaner(12, "LG", "CordZero Kompressor", "Cordless", 200, "Bin", 32000, "1 Year"));
        vacuumList.add(new VacuumCleaner(13, "Bosch", "Athlet ProAnimal", "Cordless", 200, "Bin", 25000, "1 Year"));
        vacuumList.add(new VacuumCleaner(14, "Mi", "Robot Vacuum P", "Robotic", 33, "Dust Bin", 14500, "1 Year"));
        vacuumList.add(new VacuumCleaner(15, "Dyson", "V8 Absolute", "Cordless", 115, "Bin", 35000, "1 Year"));

        return vacuumList;
    }

    @Bean("p31")
    public List<WashingMachine> getWashingMachines() {
        List<WashingMachine> wmList = new ArrayList<>();

        wmList.add(new WashingMachine(1, "LG", "T7581NDDLG", "Inverter", 8, "Front Load", 35000, "1 Year"));
        wmList.add(new WashingMachine(2, "Samsung", "WW80T504DAX", "Inverter", 8, "Front Load", 34000, "1 Year"));
        wmList.add(new WashingMachine(3, "Bosch", "WAK24268IN", "Inverter", 7, "Front Load", 32000, "1 Year"));
        wmList.add(new WashingMachine(4, "IFB", "Senorita Aqua SX", "Semi-Inverter", 6, "Front Load", 28000, "1 Year"));
        wmList.add(new WashingMachine(5, "Whirlpool", "FreshCare 7.5 Kg", "Inverter", 7, "Top Load", 25000, "1 Year"));
        wmList.add(new WashingMachine(6, "LG", "P7550NDDLG", "Inverter", 7, "Front Load", 30000, "1 Year"));
        wmList.add(new WashingMachine(7, "Samsung", "WW70T4020CX", "Inverter", 7, "Front Load", 31000, "1 Year"));
        wmList.add(new WashingMachine(8, "Bosch", "WAK20160IN", "Inverter", 6, "Front Load", 28000, "1 Year"));
        wmList.add(new WashingMachine(9, "IFB", "Diva Aqua SX", "Semi-Inverter", 6, "Front Load", 27000, "1 Year"));
        wmList.add(new WashingMachine(10, "Whirlpool", "Stainwash 7.5 Kg", "Inverter", 7, "Top Load", 24000, "1 Year"));
        wmList.add(new WashingMachine(11, "LG", "T7281NDDL", "Inverter", 6, "Front Load", 29000, "1 Year"));
        wmList.add(new WashingMachine(12, "Samsung", "WW60T4060EE", "Inverter", 6, "Front Load", 28000, "1 Year"));
        wmList.add(new WashingMachine(13, "Bosch", "WAK24268IN", "Inverter", 7, "Front Load", 32500, "1 Year"));
        wmList.add(new WashingMachine(14, "IFB", "Senorita Aqua SX 6kg", "Semi-Inverter", 6, "Front Load", 27500, "1 Year"));
        wmList.add(new WashingMachine(15, "Whirlpool", "FreshCare 7 Kg", "Inverter", 7, "Top Load", 26000, "1 Year"));

        return wmList;
    }


    @Bean("p32")
    public List<WaterHeater> getWaterHeaters() {
        List<WaterHeater> waterHeaterList = new ArrayList<>();

        waterHeaterList.add(new WaterHeater(1, "Bajaj", "New Shakti 25L", "Instant", 25, "Wall Mount", 4500, "1 Year"));
        waterHeaterList.add(new WaterHeater(2, "AO Smith", "HSE-VAS-X-15L", "Storage", 15, "Wall Mount", 7000, "2 Years"));
        waterHeaterList.add(new WaterHeater(3, "Racold", "Pronto 25L", "Instant", 25, "Wall Mount", 5000, "2 Years"));
        waterHeaterList.add(new WaterHeater(4, "V-Guard", "Victo 25L", "Storage", 25, "Wall Mount", 5500, "1 Year"));
        waterHeaterList.add(new WaterHeater(5, "Havells", "Monza 25L", "Instant", 25, "Wall Mount", 6000, "2 Years"));
        waterHeaterList.add(new WaterHeater(6, "Bajaj", "Shakti 15L", "Instant", 15, "Wall Mount", 4000, "1 Year"));
        waterHeaterList.add(new WaterHeater(7, "AO Smith", "HSE-VAS-X-25L", "Storage", 25, "Wall Mount", 8000, "2 Years"));
        waterHeaterList.add(new WaterHeater(8, "Racold", "Pronto Neo 15L", "Instant", 15, "Wall Mount", 4800, "2 Years"));
        waterHeaterList.add(new WaterHeater(9, "V-Guard", "Victo 15L", "Storage", 15, "Wall Mount", 5000, "1 Year"));
        waterHeaterList.add(new WaterHeater(10, "Havells", "Monza 15L", "Instant", 15, "Wall Mount", 5500, "2 Years"));
        waterHeaterList.add(new WaterHeater(11, "Bajaj", "New Shakti 35L", "Instant", 35, "Wall Mount", 5000, "1 Year"));
        waterHeaterList.add(new WaterHeater(12, "AO Smith", "HSE-VAS-X-35L", "Storage", 35, "Wall Mount", 9000, "2 Years"));
        waterHeaterList.add(new WaterHeater(13, "Racold", "Pronto 35L", "Instant", 35, "Wall Mount", 5500, "2 Years"));
        waterHeaterList.add(new WaterHeater(14, "V-Guard", "Victo 35L", "Storage", 35, "Wall Mount", 6000, "1 Year"));
        waterHeaterList.add(new WaterHeater(15, "Havells", "Monza 35L", "Instant", 35, "Wall Mount", 6500, "2 Years"));

        return waterHeaterList;
    }


    @Bean("p33")
    public List<WaterPurifier> getWaterPurifiers() {
        List<WaterPurifier> purifierList = new ArrayList<>();

        purifierList.add(new WaterPurifier(1, "Kent", "Grand Plus", "RO+UV+UF", 8, "ABS Plastic", 12000, "1 Year"));
        purifierList.add(new WaterPurifier(2, "Aquaguard", "Geneus", "RO+UV+UF", 7, "ABS Plastic", 13000, "1 Year"));
        purifierList.add(new WaterPurifier(3, "Pureit", "Classic RO", "RO+UV", 6, "Stainless Steel", 10000, "1 Year"));
        purifierList.add(new WaterPurifier(4, "Livpure", "Glo", "RO+UV+UF", 8, "ABS Plastic", 11000, "1 Year"));
        purifierList.add(new WaterPurifier(5, "HUL Pureit", "Marvella", "RO+UV", 7, "ABS Plastic", 9500, "1 Year"));
        purifierList.add(new WaterPurifier(6, "Kent", "Supreme", "RO+UV+UF", 10, "ABS Plastic", 15000, "1 Year"));
        purifierList.add(new WaterPurifier(7, "Aquaguard", "Enhance RO", "RO+UV+UF", 8, "ABS Plastic", 14000, "1 Year"));
        purifierList.add(new WaterPurifier(8, "Pureit", "Copper+RO", "RO+UV+Copper", 7, "ABS Plastic", 12000, "1 Year"));
        purifierList.add(new WaterPurifier(9, "Livpure", "Smart RO", "RO+UV+UF", 8, "ABS Plastic", 13000, "1 Year"));
        purifierList.add(new WaterPurifier(10, "HUL Pureit", "Advanced RO", "RO+UV", 6, "ABS Plastic", 11000, "1 Year"));
        purifierList.add(new WaterPurifier(11, "Kent", "Maxx", "RO+UV+UF", 9, "ABS Plastic", 14500, "1 Year"));
        purifierList.add(new WaterPurifier(12, "Aquaguard", "Aura", "RO+UV+UF", 8, "ABS Plastic", 13500, "1 Year"));
        purifierList.add(new WaterPurifier(13, "Pureit", "Neo RO", "RO+UV", 7, "ABS Plastic", 11500, "1 Year"));
        purifierList.add(new WaterPurifier(14, "Livpure", "Glo+", "RO+UV+UF", 9, "ABS Plastic", 14000, "1 Year"));
        purifierList.add(new WaterPurifier(15, "Kent", "Elite", "RO+UV+UF", 10, "ABS Plastic", 15500, "1 Year"));

        return purifierList;
    }


}
