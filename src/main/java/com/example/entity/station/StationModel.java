package com.example.entity.station;


import com.example.entity.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class StationModel extends BaseModel {
    @Column(nullable = false)
    private String name;


    @Column(nullable = false)
    private String location;

}
