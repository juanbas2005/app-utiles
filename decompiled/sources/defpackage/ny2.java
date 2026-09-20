package defpackage;

/* renamed from: ny2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ny2 {
    public final int a;

    public /* synthetic */ ny2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ny2) && this.a == ((ny2) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 16) {
            return "Confirm";
        }
        if (i == 6) {
            return "ContextClick";
        }
        if (i == 13) {
            return "GestureEnd";
        }
        if (i == 23) {
            return "GestureThresholdActivate";
        }
        if (i == 3) {
            return "KeyboardTap";
        }
        if (i == 0) {
            return "LongPress";
        }
        if (i == 17) {
            return "Reject";
        }
        if (i == 27) {
            return "SegmentFrequentTick";
        }
        if (i == 26) {
            return "SegmentTick";
        }
        if (i == 9) {
            return "TextHandleMove";
        }
        if (i == 22) {
            return "ToggleOff";
        }
        if (i == 21) {
            return "ToggleOn";
        }
        if (i == 1) {
            return "VirtualKey";
        }
        return "Invalid";
    }
}
