package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;
import java.sql.Timestamp;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class User {

    @ApiModelProperty(hidden = true)
    private Long id;
    @NotNull
    private String portalAccount;
    @NotNull
    private String password;
    @NotNull
    private String nickname;
    @NotNull
    @Size(min = 1)
    private List<Major> majorEntityList;
    private Long majorCount;
    @NotNull
    @Size(min = 1)
    private List<Address> addressEntities;
    @ApiModelProperty(hidden = true)
    private Timestamp created_at;
    @ApiModelProperty(hidden = true)
    private Timestamp updated_at;
}
