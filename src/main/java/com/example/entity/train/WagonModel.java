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
//@Table(name = "wagon",
//        uniqueConstraints=
//        @UniqueConstraint(columnNames={"number", "wagon_type"})
//)

public class WagonModel extends BaseModel {

    @Column(nullable = false)
    private int number;

    @Column(nullable = false)
    private int totalPlaces;


    @Enumerated(EnumType.STRING)
    @JoinColumn(name = "wagon_type")
    private WagonType wagonType;

    @Column(nullable = false)
    private double price;


}
