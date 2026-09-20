package io.ktor.utils.io.charsets;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/charsets/MalformedInputException;", "Ljava/nio/charset/MalformedInputException;", "ktor-io"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class MalformedInputException extends java.nio.charset.MalformedInputException {
    public final String w;

    public MalformedInputException(String str) {
        super(0);
        this.w = str;
    }

    public final String getMessage() {
        return this.w;
    }
}
