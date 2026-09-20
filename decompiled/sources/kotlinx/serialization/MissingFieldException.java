package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class MissingFieldException extends SerializationException {
    public final List w;
    public final String x;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MissingFieldException(String str, String str2) {
        this(pb4.m("Field '", str, "' is required for type with serial name '", str2, "', but it was missing"), (MissingFieldException) null, sg3.D(str), str2);
        str2.getClass();
    }

    public MissingFieldException(String str, MissingFieldException missingFieldException, List list, String str2) {
        super(str, missingFieldException);
        this.w = list;
        this.x = str2;
    }
}
