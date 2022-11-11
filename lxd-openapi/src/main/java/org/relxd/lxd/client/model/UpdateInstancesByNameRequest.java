/*
 * LXD
 * The services listed below are referred as .....
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@relxd.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.relxd.lxd.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.relxd.lxd.client.model.DevicesRoot;
import org.relxd.lxd.client.model.HardwareSpecsConfig;
import org.relxd.lxd.client.model.UpdateInstancesByNameRequest2;
import org.relxd.lxd.client.model.UpdateInstancesByNameRequestOneOf;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.relxd.lxd.client.JSON;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(using = UpdateInstancesByNameRequest.UpdateInstancesByNameRequestDeserializer.class)
@JsonSerialize(using = UpdateInstancesByNameRequest.UpdateInstancesByNameRequestSerializer.class)
public class UpdateInstancesByNameRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpdateInstancesByNameRequest.class.getName());

    public static class UpdateInstancesByNameRequestSerializer extends StdSerializer<UpdateInstancesByNameRequest> {
        public UpdateInstancesByNameRequestSerializer(Class<UpdateInstancesByNameRequest> t) {
            super(t);
        }

        public UpdateInstancesByNameRequestSerializer() {
            this(null);
        }

        @Override
        public void serialize(UpdateInstancesByNameRequest value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class UpdateInstancesByNameRequestDeserializer extends StdDeserializer<UpdateInstancesByNameRequest> {
        public UpdateInstancesByNameRequestDeserializer() {
            this(UpdateInstancesByNameRequest.class);
        }

        public UpdateInstancesByNameRequestDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public UpdateInstancesByNameRequest deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize UpdateInstancesByNameRequest2
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (UpdateInstancesByNameRequest2.class.equals(Integer.class) || UpdateInstancesByNameRequest2.class.equals(Long.class) || UpdateInstancesByNameRequest2.class.equals(Float.class) || UpdateInstancesByNameRequest2.class.equals(Double.class) || UpdateInstancesByNameRequest2.class.equals(Boolean.class) || UpdateInstancesByNameRequest2.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((UpdateInstancesByNameRequest2.class.equals(Integer.class) || UpdateInstancesByNameRequest2.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((UpdateInstancesByNameRequest2.class.equals(Float.class) || UpdateInstancesByNameRequest2.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (UpdateInstancesByNameRequest2.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (UpdateInstancesByNameRequest2.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(UpdateInstancesByNameRequest2.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'UpdateInstancesByNameRequest2'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'UpdateInstancesByNameRequest2'", e);
            }

            // deserialize UpdateInstancesByNameRequestOneOf
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (UpdateInstancesByNameRequestOneOf.class.equals(Integer.class) || UpdateInstancesByNameRequestOneOf.class.equals(Long.class) || UpdateInstancesByNameRequestOneOf.class.equals(Float.class) || UpdateInstancesByNameRequestOneOf.class.equals(Double.class) || UpdateInstancesByNameRequestOneOf.class.equals(Boolean.class) || UpdateInstancesByNameRequestOneOf.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((UpdateInstancesByNameRequestOneOf.class.equals(Integer.class) || UpdateInstancesByNameRequestOneOf.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((UpdateInstancesByNameRequestOneOf.class.equals(Float.class) || UpdateInstancesByNameRequestOneOf.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (UpdateInstancesByNameRequestOneOf.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (UpdateInstancesByNameRequestOneOf.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(UpdateInstancesByNameRequestOneOf.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'UpdateInstancesByNameRequestOneOf'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'UpdateInstancesByNameRequestOneOf'", e);
            }

            if (match == 1) {
                UpdateInstancesByNameRequest ret = new UpdateInstancesByNameRequest();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for UpdateInstancesByNameRequest: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public UpdateInstancesByNameRequest getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "UpdateInstancesByNameRequest cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public UpdateInstancesByNameRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public UpdateInstancesByNameRequest(UpdateInstancesByNameRequest2 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateInstancesByNameRequest(UpdateInstancesByNameRequestOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UpdateInstancesByNameRequest2", UpdateInstancesByNameRequest2.class);
        schemas.put("UpdateInstancesByNameRequestOneOf", UpdateInstancesByNameRequestOneOf.class);
        JSON.registerDescendants(UpdateInstancesByNameRequest.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UpdateInstancesByNameRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * UpdateInstancesByNameRequest2, UpdateInstancesByNameRequestOneOf
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(UpdateInstancesByNameRequest2.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UpdateInstancesByNameRequestOneOf.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be UpdateInstancesByNameRequest2, UpdateInstancesByNameRequestOneOf");
    }

    /**
     * Get the actual instance, which can be the following:
     * UpdateInstancesByNameRequest2, UpdateInstancesByNameRequestOneOf
     *
     * @return The actual instance (UpdateInstancesByNameRequest2, UpdateInstancesByNameRequestOneOf)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpdateInstancesByNameRequest2`. If the actual instance is not `UpdateInstancesByNameRequest2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateInstancesByNameRequest2`
     * @throws ClassCastException if the instance is not `UpdateInstancesByNameRequest2`
     */
    public UpdateInstancesByNameRequest2 getUpdateInstancesByNameRequest2() throws ClassCastException {
        return (UpdateInstancesByNameRequest2)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpdateInstancesByNameRequestOneOf`. If the actual instance is not `UpdateInstancesByNameRequestOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateInstancesByNameRequestOneOf`
     * @throws ClassCastException if the instance is not `UpdateInstancesByNameRequestOneOf`
     */
    public UpdateInstancesByNameRequestOneOf getUpdateInstancesByNameRequestOneOf() throws ClassCastException {
        return (UpdateInstancesByNameRequestOneOf)super.getActualInstance();
    }

}

