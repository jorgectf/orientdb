package com.orientechnologies.orient.core.sql.executor.resultset;

import com.orientechnologies.orient.core.sql.executor.OResult;

public interface OResultMapper {
  OResult map(OResult result);
}
