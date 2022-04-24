package io.yassine_safir.springprojet.springprojet.Web;

import io.yassine_safir.springprojet.springprojet.Entities.Region;
import io.yassine_safir.springprojet.springprojet.Services.IRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegionController {
    @Autowired
    IRegionService RegionService;

    @GetMapping("/Regions")
    public List<Region> findall(){
        return  RegionService.getAllRegion();
    }

    @GetMapping("/Regions/{id}")
    public Region findById(@PathVariable("id") Long id){
        Region region = RegionService.getRegionById(id);
        return region;
    }

    @PostMapping("/Regions/nouveau")
    public Region addRegion(@RequestBody Region Region){
        return RegionService.saveRegion(Region);
    }

    @PutMapping("/Regions/{id}")
    public Region updateRegion(@PathVariable("id") Long id, @RequestBody Region Region){
        return RegionService.updateRegion(id,Region);
    }

    @DeleteMapping("/Regions/{id}")
    public void deleteRegion(@PathVariable("id") Long id){
        RegionService.deleteRegionById(id);
    }
}
