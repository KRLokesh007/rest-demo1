package com.thinkconstructive.restdemo.controller;

import com.thinkconstructive.restdemo.model.CloudVendor;
import com.thinkconstructive.restdemo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }


    //readSpecific cloud vendor details
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){

        return cloudVendorService.getCloudVendor(vendorId);
                /*("C1","vendor 1",
                "Address1","9878787888");
*/   }
//read all cloud vendor details in db

    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(){

        return cloudVendorService.getAllCloudVendors();
                /*("C1","vendor 1",
                "Address1","9878787888");
*/
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {

        cloudVendorService.createCloudVendor(cloudVendor);
        return "cloud Vendro Created";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {

        cloudVendorService.updateCloudVendor(cloudVendor);
        return "cloud Vendro Update successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {

        cloudVendorService.deleteCloudVendor(vendorId);
        return "cloud Vendro deleted successfully";
    }





}
