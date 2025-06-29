package com.braidsbeautybyangie.sagapatternspringboot.aggregates.aggregates;

import java.sql.Timestamp;

public class Constants {
    public static final Boolean STATUS_ACTIVE=true;
    public static final Boolean STATUS_INACTIVE=false;
    public static final String NUM_PAG_BY_DEFECT="0";
    public static final String SIZE_PAG_BY_DEFECT="10";
    public static final String ORDER_BY_DEFECT_ALL="createdAt";
    public static final String ORDER_DIRECT_BY_DEFECT="0";

    public static Timestamp getTimestamp(){
        long currentTime = System.currentTimeMillis();
        return new Timestamp(currentTime);
    }
    public static StringBuilder parametersForLogger(int pageNumber, int pageSize, String orderBy, String sortDir){
        StringBuilder parameters = new StringBuilder();
        parameters.append("pageNumber=").append(pageNumber);
        parameters.append("&pageSize=").append(pageSize);
        parameters.append("&orderBy=").append(orderBy);
        parameters.append("&sortDir=").append(sortDir);
        return parameters;
    }
}
