package cu.lestebang.utiletecsa.feature.home.navigation;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0015¨\u0006$"}, d2 = {"Lcu/lestebang/utiletecsa/feature/home/navigation/Item;", "", "", "itemId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$home", "(Lcu/lestebang/utiletecsa/feature/home/navigation/Item;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcu/lestebang/utiletecsa/feature/home/navigation/Item;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getItemId", "Companion", "kh3", "lh3", "home"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
@Serializable
/* loaded from: classes.dex */
public final class Item {
    public static final int $stable = 0;
    public static final lh3 Companion = new Object();
    private final String itemId;

    public /* synthetic */ Item(int i, String str, rl6 rl6Var) {
        if (1 == (i & 1)) {
            this.itemId = str;
        } else {
            wn6.x(i, 1, kh3.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ Item copy$default(Item item, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = item.itemId;
        }
        return item.copy(str);
    }

    public final String component1() {
        return this.itemId;
    }

    public final Item copy(String str) {
        return new Item(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Item) && sg3.e(this.itemId, ((Item) obj).itemId)) {
            return true;
        }
        return false;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public int hashCode() {
        String str = this.itemId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return f21.h("Item(itemId=", this.itemId, ")");
    }

    public Item(String str) {
        this.itemId = str;
    }
}
