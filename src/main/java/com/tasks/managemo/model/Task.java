package com.tasks.managemo.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    private long id;
    private String title;
    private String description;
    private boolean done;

}
