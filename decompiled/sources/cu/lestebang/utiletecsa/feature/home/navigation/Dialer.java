package cu.lestebang.utiletecsa.feature.home.navigation;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcu/lestebang/utiletecsa/feature/home/navigation/Dialer;", "", "", "prefix", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$home", "(Lcu/lestebang/utiletecsa/feature/home/navigation/Dialer;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcu/lestebang/utiletecsa/feature/home/navigation/Dialer;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPrefix", "getTitle", "Companion", "gu1", "hu1", "home"}, k = 1, mv = {2, 4, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class Dialer {
    public static final int $stable = 0;
    public static final hu1 Companion = new Object();
    private final String prefix;
    private final String title;

    public /* synthetic */ Dialer(int i, String str, String str2, rl6 rl6) {
        if (3 == (i & 3)) {
            this.prefix = str;
            this.title = str2;
            return;
        }
        wn6.x(i, 3, gu1.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ Dialer copy$default(Dialer dialer, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dialer.prefix;
        }
        if ((i & 2) != 0) {
            str2 = dialer.title;
        }
        return dialer.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$home(Dialer dialer, hy0 hy0, ll6 ll6) {
        hy0.x(ll6, 0, dialer.prefix);
        hy0.x(ll6, 1, dialer.title);
    }

    public final String component1() {
        return this.prefix;
    }

    public final String component2() {
        return this.title;
    }

    public final Dialer copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new Dialer(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dialer)) {
            return false;
        }
        Dialer dialer = (Dialer) obj;
        if (sg3.e(this.prefix, dialer.prefix) && sg3.e(this.title, dialer.title)) {
            return true;
        }
        return false;
    }

    public final String getPrefix() {
        return this.prefix;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + (this.prefix.hashCode() * 31);
    }

    public String toString() {
        return pb4.m("Dialer(prefix=", this.prefix, ", title=", this.title, ")");
    }

    public Dialer(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.prefix = str;
        this.title = str2;
    }
}
