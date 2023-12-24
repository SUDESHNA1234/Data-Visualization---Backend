package com.datavisualization.byfilters.DataVisualizationByfilters.model;


import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;
import lombok.*;
@Document(collection = "Assignment")
@lombok.Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Data {
    @Id
    private String Data_id;
    @Field("end_year")
    private int end_year;
    @Field("citylng")
    private int citylng;
    @Field("citylat")
    private int citylat;
    @Field("intensity")
    private int intensity;
    @Field("sector")
    private String sector;
    @Field("topic")
    private String topic;
    @Field("insight")
    private String insight;
    @Field("swot")
    private String swot;
    @Field("url")
    private String url;
    @Field("region")
    private String region;
    @Field("start_year")
    private int start_year;
    @Field("impact")
    private int impact;
    @Field("added")
    private Date added;
    @Field("published")
    private Date published;
    @Field("city")
    private String city;
    @Field("country")
    private String country;
    @Field("relevance")
    private int relevance;
    @Field("pestle")
    private String pestle;
    @Field("source")
    private String source;
    @Field("title")
    private String title;
    @Field("likelihood")
    private int likelihood;

}
