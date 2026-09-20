package defpackage;

import android.accounts.Account;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: pa9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class pa9 {
    public static final Pattern a = Pattern.compile("[a-z]+(_[a-z]+)*");
    public static final Account b = la9.a;
    public static final Set c = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"default", "unused", "special", "reserved", "shared", "virtual", "managed"})));
    public static final Set d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"files", "cache", "managed", "directboot-files", "directboot-cache", "external"})));
}
