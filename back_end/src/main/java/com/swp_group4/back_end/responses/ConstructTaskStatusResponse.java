package com.swp_group4.back_end.responses;

import com.swp_group4.back_end.enums.ConstructStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ConstructTaskStatusResponse {

    String packageConstructionId;
    String taskId;
    String content;
    Date startDate;
    Date endDate;
    ConstructStatus status;

}
