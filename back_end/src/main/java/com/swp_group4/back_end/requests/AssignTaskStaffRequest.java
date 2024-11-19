package com.swp_group4.back_end.requests;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class AssignTaskStaffRequest {

    String constructionOrderId;
    List<String> staffIds;

}