package io.github.jan.supabase.auth.providers.builtin;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"io/github/jan/supabase/auth/providers/builtin/Phone$Channel", "", "Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "ng5", "SMS", "WHATSAPP", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable(with = ng5.class)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum Phone$Channel {
    SMS("sms"),
    WHATSAPP("whatsapp");
    
    public static final ng5 Companion = null;
    /* access modifiers changed from: private */
    public static final ll6 descriptor = null;
    private final String value;

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, ng5] */
    static {
        Phone$Channel[] $values;
        $ENTRIES = hj8.t($values);
        Companion = new Object();
        descriptor = b85.b("Channel");
    }

    private Phone$Channel(String str) {
        this.value = str;
    }

    public static u52 getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
