package com.datavisualization.byfilters.DataVisualizationByfilters.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.datavisualization.byfilters.DataVisualizationByfilters.model.Data;
@Repository
public interface DataRepository  extends MongoRepository<Data,String> {

}
