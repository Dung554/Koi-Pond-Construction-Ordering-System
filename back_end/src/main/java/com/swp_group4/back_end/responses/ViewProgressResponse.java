package com.swp_group4.back_end.responses;

import com.swp_group4.back_end.enums.ConstructionOrderStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ViewProgressResponse {

    String constructionOrderId;
    List<ListConstructProgressResponse> listConstructProgressResponses;
    List<String> staffNames;
    ConstructionOrderStatus status;

}
