package cn.raindropair.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Data
public class DateDto {
    private LocalDateTime now = LocalDateTime.now();

    private LocalDate localDateNow = LocalDate.now();

    private LocalTime  localTimeNow = LocalTime.now();

    private Date dateNow = new Date();
}
