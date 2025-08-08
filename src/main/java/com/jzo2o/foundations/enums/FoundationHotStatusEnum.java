package com.jzo2o.foundations.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FoundationHotStatusEnum {
    NOTHOT(0,"非热门"),
    ISHOT(1, "热门");

    private int status;
    private String description;



    public boolean equals(Integer status) {
        return this.status == status;
    }

    public boolean equals(FoundationHotStatusEnum enableStatusEnum) {
        return enableStatusEnum != null && enableStatusEnum.status == this.getStatus();
    }



}
