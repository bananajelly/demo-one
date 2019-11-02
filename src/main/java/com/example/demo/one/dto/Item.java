package com.example.demo.one.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class Item {

    @NotNull
    private String name;

    @NotNull
    private String link;

    @Min(1) @Max(3)
    private Integer priority;

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", link='" + link + '\'' +
                ", priority=" + priority +
                '}';
    }
}
