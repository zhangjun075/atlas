/*
 * Copyright 2014-2017 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netflix.atlas.lwcapi

import com.netflix.atlas.core.model.Query
import com.netflix.atlas.lwcapi.ExpressionSplitter.SplitResult

abstract class ExpressionDatabase {
  def addExpr(expr: ExpressionWithFrequency, query: Query): Boolean
  def delExpr(id: String): Boolean
  def hasExpr(id: String): Boolean
  def expr(id: String): Option[ExpressionWithFrequency]
  def expressionsForCluster(cluster: String): List[ExpressionWithFrequency]
}
