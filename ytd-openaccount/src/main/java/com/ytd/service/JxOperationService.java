package com.ytd.service;

import java.util.Map;

public interface JxOperationService {

    String creatSign(Map<String,String> reqMap);

    Map<String,String> getRequestMap();

}
