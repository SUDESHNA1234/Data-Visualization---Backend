package com.datavisualization.byfilters.DataVisualizationByfilters.Controller;

import com.datavisualization.byfilters.DataVisualizationByfilters.Service.DataService;
import com.datavisualization.byfilters.DataVisualizationByfilters.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins ="*")
@RestController
@RequestMapping("/Assignment")
public class DataController {
    @Autowired
    private DataService dataService;

    @GetMapping("/Assignment")    //Get All data from Database
    public List<Data> getAllQuestions() {

        return dataService.allQuestion();
    }

    @GetMapping("/Filter")    //Filter data from datbase with given params
    public List<Data> filder(
            @RequestParam(required = false) Integer end_year,
            @RequestParam(required = false) String topic,
            @RequestParam(required = false) String sector,
            @RequestParam(required = false) String region,
            @RequestParam(required = false) String pestle,
            @RequestParam(required = false) String swot,
            @RequestParam(required = false) String source,
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String country

    ) {

        return dataService.filderData(end_year, topic, sector, region, pestle, swot, source, city, country);

    }

    //to get all list of filter API params on ui for filter
    @GetMapping("/endyear")
    public List<Integer> getAllEndYears(){
        return dataService.getendyears();
    }
    @GetMapping("/endcountry")
    public List<String> getcountry(){
        return dataService.getcountry();
    }
    @GetMapping("/endsource")
    public List<String>  getsource(){
        return dataService.getsource();
    }
    @GetMapping("/endcity")
    public List<String> getcity(){
        return dataService.getcity();
    }
    @GetMapping("/endswot")
    public List<String> getswot(){
        return dataService.getswot();
    }
    @GetMapping("/endregion")
    public List<String> getregion(){
        return dataService.getregion();
    }
    @GetMapping("/endsector")
    public List<String> getsector(){
        return dataService. getsector();
    }
    @GetMapping("/endtopic")
    public List<String> gettopic(){
        return dataService.gettopic();
    }
    @GetMapping("/endpestle")
    public List<String>  getpestle(){
        return dataService.getpestle();
    }

}
