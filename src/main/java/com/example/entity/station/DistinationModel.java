package com.example.entity.station;

import com.example.entity.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class DistinationModel extends BaseModel {

    private Date arriveTime;
    private Date leaveTime;

    @Column(nullable = false)
    private int order;
}
