package com.datavisualization.byfilters.DataVisualizationByfilters.Service;

import com.datavisualization.byfilters.DataVisualizationByfilters.model.Data;
import com.datavisualization.byfilters.DataVisualizationByfilters.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import java.util.List;

@Service
public class DataService {
    @Autowired
    private DataRepository dataRepository;


    @Autowired
    private MongoTemplate mongoTemplate;



    public List<Data> allQuestion() {

        return dataRepository.findAll();
    }

    //Filters Data

    public List<Data> filderData(Integer end_year, String topic, String sector, String region, String pestle, String swot, String source, String city, String country) {
      Query q=new Query();
      if(end_year !=0){
          q.addCriteria(Criteria.where("end_year").is(end_year));
      }
        if(topic != null && !topic.equals("")){
            q.addCriteria(Criteria.where("topic").is(topic));
        }
        if (sector != null && !sector.equals("")) {
            q.addCriteria(Criteria.where("sector").is(sector));
        }
        if (region != null) {
            q.addCriteria(Criteria.where("region").is(region));
        }
        if (pestle != null) {
            q.addCriteria(Criteria.where("pestle").is(pestle));
        }
        if (swot != null) {
            q.addCriteria(Criteria.where("swot").is(swot));
        }
        if (source != null) {
            q.addCriteria(Criteria.where("source").is(source));
        }
        if (city != null) {
            q.addCriteria(Criteria.where("city").is(city));
        }
        if (country != null) {
            q.addCriteria(Criteria.where("country").is(country));
        }
        return mongoTemplate.find(q,Data.class);
    }
public List<Integer> getendyears(){
    List<Data> allData = dataRepository.findAll();
    return allData.stream()
            .map(Data::getEnd_year)
            .distinct()
            .collect(Collectors.toList());
}
    public List<String> gettopic(){
        List<Data> allData = dataRepository.findAll();
        return allData.stream()
                .map(Data::getTopic)
                .distinct()
                .collect(Collectors.toList());
    }
    public List<String> getsector(){
        List<Data> allData = dataRepository.findAll();
        return allData.stream()
                .map(Data::getSector)
                .distinct()
                .collect(Collectors.toList());
    }
    public List<String> getregion(){
        List<Data> allData = dataRepository.findAll();
        return allData.stream()
                .map(Data::getRegion)
                .distinct()
                .collect(Collectors.toList());
    }
    public List<String> getswot(){
        List<Data> allData = dataRepository.findAll();
        return allData.stream()
                .map(Data::getSwot)
                .distinct()
                .collect(Collectors.toList());
    }
    public List<String> getcity(){
        List<Data> allData = dataRepository.findAll();
        return allData.stream()
                .map(Data::getCity)
                .distinct()
                .collect(Collectors.toList());
    }
    public List<String> getcountry(){
        List<Data> allData = dataRepository.findAll();
        return allData.stream()
                .map(Data::getCountry)
                .distinct()
                .collect(Collectors.toList());
    }
    public List<String> getpestle(){
        List<Data> allData = dataRepository.findAll();
        return allData.stream()
                .map(Data::getPestle)
                .distinct()
                .collect(Collectors.toList());
    }
    public List<String> getsource(){
        List<Data> allData = dataRepository.findAll();
        return allData.stream()
                .map(Data::getSource)
                .distinct()
                .collect(Collectors.toList());
    }

}
