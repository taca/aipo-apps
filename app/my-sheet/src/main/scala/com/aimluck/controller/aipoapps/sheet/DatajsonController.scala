/*
 * This file is part of official Aipo App.
 * Copyright (C) 2011-2011 Aimluck,Inc.
 * http://www.aipo.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.aimluck.controller.aipoapps.sheet

import org.dotme.liquidtpl.controller.AbstractJsonDataController
import sjson.json.JsonSerialization._
import com.aimluck.service.SheetService

class DatajsonController extends com.aimluck.controller.my.sheet.DatajsonController {
  override def getRelation: (String, String) = {
    SheetService.getAipoappsRelation(request)
  }
}
