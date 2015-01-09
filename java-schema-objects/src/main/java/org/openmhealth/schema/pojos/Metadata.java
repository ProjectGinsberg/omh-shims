/*
 * Copyright 2014 Open mHealth
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openmhealth.schema.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.time.DateTime;
import org.openmhealth.schema.pojos.serialize.dates.MetadataTimestampDeserializer;
import org.openmhealth.schema.pojos.serialize.dates.MetadataTimestampSerializer;


/**
 * @author Danilo Bonilla
 */
@JsonRootName(value = "metadata", namespace = "org.openmhealth.schema")
public class Metadata {

    @JsonProperty(value = "timestamp")
    @JsonSerialize(using = MetadataTimestampSerializer.class)
    @JsonDeserialize(using = MetadataTimestampDeserializer.class)
    private DateTime timestamp;

    @JsonProperty(value = "shim")
    private String shimKey;

    public final static String TIMESTAMP_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

    public Metadata() {
    }

    public DateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getShimKey() {
        return shimKey;
    }

    public void setShimKey(String shimKey) {
        this.shimKey = shimKey;
    }
}