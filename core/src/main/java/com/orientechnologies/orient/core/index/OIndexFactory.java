/*
 *
 *  *  Copyright 2010-2016 OrientDB LTD (http://orientdb.com)
 *  *
 *  *  Licensed under the Apache License, Version 2.0 (the "License");
 *  *  you may not use this file except in compliance with the License.
 *  *  You may obtain a copy of the License at
 *  *
 *  *       http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *  Unless required by applicable law or agreed to in writing, software
 *  *  distributed under the License is distributed on an "AS IS" BASIS,
 *  *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  See the License for the specific language governing permissions and
 *  *  limitations under the License.
 *  *
 *  * For more information: http://orientdb.com
 *
 */
package com.orientechnologies.orient.core.index;

import com.orientechnologies.orient.core.exception.OConfigurationException;
import com.orientechnologies.orient.core.index.engine.OBaseIndexEngine;
import com.orientechnologies.orient.core.storage.OStorage;
import java.util.Set;

public interface OIndexFactory {

  int getLastVersion(final String algorithm);

  /** @return List of supported indexes of this factory */
  Set<String> getTypes();

  /** @return List of supported algorithms of this factory */
  Set<String> getAlgorithms();

  /**
   * Creates an index.
   *
   * @param im TODO
   * @return OIndexInternal
   * @throws OConfigurationException if index creation failed
   */
  OIndexInternal createIndex(OStorage storage, OIndexMetadata im, int version)
      throws OConfigurationException;

  OBaseIndexEngine createIndexEngine(
      int indexId,
      String algorithm,
      String name,
      OStorage storage,
      int version,
      boolean multiValue);
}
