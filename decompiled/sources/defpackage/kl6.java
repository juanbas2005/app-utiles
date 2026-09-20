package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.time.LocalDate;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.UtcOffset;
import kotlinx.datetime.YearMonth;

/* renamed from: kl6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kl6 implements Externalizable {
    public int w;
    public Serializable x;

    public kl6(int i, Serializable serializable) {
        this.w = i;
        this.x = serializable;
    }

    public final void readExternal(ObjectInput objectInput) {
        Serializable serializable;
        objectInput.getClass();
        byte readByte = objectInput.readByte();
        this.w = readByte;
        if (readByte == 2) {
            LocalDate l = LocalDate.ofEpochDay(objectInput.readLong());
            l.getClass();
            serializable = new kotlinx.datetime.LocalDate(l);
        } else if (readByte == 3) {
            qa4 qa4 = LocalTime.Companion;
            long readLong = objectInput.readLong();
            qa4.getClass();
            serializable = qa4.a(readLong);
        } else if (readByte == 4) {
            LocalDate l2 = LocalDate.ofEpochDay(objectInput.readLong());
            l2.getClass();
            kotlinx.datetime.LocalDate localDate = new kotlinx.datetime.LocalDate(l2);
            qa4 qa42 = LocalTime.Companion;
            long readLong2 = objectInput.readLong();
            qa42.getClass();
            serializable = new LocalDateTime(localDate, qa4.a(readLong2));
        } else if (readByte == 10) {
            serializable = j08.a((Integer) null, (Integer) null, Integer.valueOf(objectInput.readInt()));
        } else if (readByte == 11) {
            lf8 lf8 = YearMonth.Companion;
            long readLong3 = objectInput.readLong();
            z97 z97 = sf8.a;
            lf8.getClass();
            long j = readLong3 / 12;
            if ((readLong3 ^ 12) < 0 && j * 12 != readLong3) {
                j--;
            }
            long j2 = readLong3 % 12;
            serializable = new YearMonth((int) (j + 1970), ((int) (j2 + (12 & (((j2 ^ 12) & ((-j2) | j2)) >> 63)))) + 1);
        } else {
            throw new IOException("Unknown type tag: " + this.w);
        }
        this.x = serializable;
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.getClass();
        objectOutput.writeByte(this.w);
        Serializable serializable = this.x;
        int i = this.w;
        if (i == 2) {
            objectOutput.writeLong(((kotlinx.datetime.LocalDate) serializable).getValue$kotlinx_datetime().toEpochDay());
        } else if (i == 3) {
            objectOutput.writeLong(((LocalTime) serializable).toNanosecondOfDay());
        } else if (i == 4) {
            LocalDateTime localDateTime = (LocalDateTime) serializable;
            objectOutput.writeLong(localDateTime.getDate().getValue$kotlinx_datetime().toEpochDay());
            objectOutput.writeLong(localDateTime.getTime().toNanosecondOfDay());
        } else if (i == 10) {
            objectOutput.writeInt(((UtcOffset) serializable).getTotalSeconds());
        } else if (i == 11) {
            YearMonth yearMonth = (YearMonth) serializable;
            z97 z97 = sf8.a;
            objectOutput.writeLong((((((long) yearMonth.getYear()) - 1970) * 12) + ((long) yearMonth.getMonthNumber$kotlinx_datetime())) - 1);
        } else {
            kj6.j("Unknown type tag: ", this.w, " for value: ", serializable);
        }
    }
}
