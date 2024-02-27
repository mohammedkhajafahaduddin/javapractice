package com.careerit.jfs.java14features;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppointmentDto {

    private String name;
    private LocalDate date;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
