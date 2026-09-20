package io.github.jan.supabase.auth.providers;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a extends IDTokenProvider {
    public static final a a = new IDTokenProvider((hl1) null);
    public static final String b = "google";

    public final boolean equals(Object obj) {
        if (this != obj && !(obj instanceof a)) {
            return false;
        }
        return true;
    }

    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return -1338307269;
    }

    public final String toString() {
        return "Google";
    }
}
