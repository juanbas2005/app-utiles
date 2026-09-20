package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.SerializationException;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/JsonException;", "Lkotlinx/serialization/SerializationException;", "Lkotlinx/serialization/json/JsonDecodingException;", "Lkotlinx/serialization/json/JsonEncodingException;", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class JsonException extends SerializationException {
    public final String w;

    public JsonException(String str) {
        super(str);
        this.w = str;
    }

    public final String getMessage() {
        return this.w;
    }
}
