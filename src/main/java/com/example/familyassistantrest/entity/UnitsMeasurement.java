package com.example.familyassistantrest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "units_measurement")
@Getter
@Setter
@ToString
public class UnitsMeasurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "units_measurement_id", nullable = false)
    public Long id;
    @Column(name = "units_measurement_name")
    public String name;
    @Column(name = "units_measurement_short_name")
    public String shortName;

    public UnitsMeasurement(Long id, String name, String shortName) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
    }

    public UnitsMeasurement() {
    }
}
