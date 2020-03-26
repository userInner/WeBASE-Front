/*
 * Copyright 2014-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.webank.webase.front.logparse.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class TxGasData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String transHash;
    private Long gasUsed;
    private int groupId;
    private Long timestamp;
    
    public TxGasData() {}

    public TxGasData(String transHash, Long gasUsed, Long timestamp, int groupId) {
        super();
        this.transHash = transHash;
        this.gasUsed = gasUsed;
        this.timestamp = timestamp;
        this.groupId = groupId;
    }
}
