package com.example.entity.train;


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
public class PlaceModel extends BaseModel {

    @Column(nullable = false)
    private int number;

    private int byse;
}
