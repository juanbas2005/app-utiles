.class public final Lkotlinx/datetime/YearMonth;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lkotlinx/datetime/YearMonth;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 92\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001:B\u0011\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B\u0019\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\nB\u0019\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0005\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020 2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0012H\u0096\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010%\u001a\u0004\u0008&\u0010\'R\u0011\u0010\u0008\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010$R\u0014\u0010*\u001a\u00020\u00078@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010$R\u0011\u0010\t\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010,R\u0011\u00100\u001a\u00020-8F\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010/R\u0011\u00102\u001a\u00020-8F\u00a2\u0006\u0006\u001a\u0004\u00081\u0010/R\u0011\u00104\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u00083\u0010$R\u0011\u00108\u001a\u0002058F\u00a2\u0006\u0006\u001a\u0004\u00086\u00107\u00a8\u0006;"
    }
    d2 = {
        "Lkotlinx/datetime/YearMonth;",
        "",
        "Ljava/io/Serializable;",
        "Ljava/time/YearMonth;",
        "value",
        "<init>",
        "(Ljava/time/YearMonth;)V",
        "",
        "year",
        "month",
        "(II)V",
        "Lyl4;",
        "(ILyl4;)V",
        "Ljava/io/ObjectInputStream;",
        "ois",
        "Lvs7;",
        "readObject",
        "(Ljava/io/ObjectInputStream;)V",
        "",
        "writeReplace",
        "()Ljava/lang/Object;",
        "that",
        "Lkotlinx/datetime/i;",
        "rangeTo",
        "(Lkotlinx/datetime/YearMonth;)Lkotlinx/datetime/i;",
        "rangeUntil",
        "other",
        "compareTo",
        "(Lkotlinx/datetime/YearMonth;)I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "()I",
        "Ljava/time/YearMonth;",
        "getValue$kotlinx_datetime",
        "()Ljava/time/YearMonth;",
        "getYear",
        "getMonthNumber$kotlinx_datetime",
        "monthNumber",
        "getMonth",
        "()Lyl4;",
        "Lkotlinx/datetime/LocalDate;",
        "getFirstDay",
        "()Lkotlinx/datetime/LocalDate;",
        "firstDay",
        "getLastDay",
        "lastDay",
        "getNumberOfDays",
        "numberOfDays",
        "Lkotlinx/datetime/g;",
        "getDays",
        "()Lkotlinx/datetime/g;",
        "days",
        "Companion",
        "lf8",
        "kotlinx-datetime"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlinx/serialization/Serializable;
    with = Luf8;
.end annotation


# static fields
.field public static final Companion:Llf8;

.field private static final serialVersionUID:J


# instance fields
.field private final value:Ljava/time/YearMonth;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Llf8;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlinx/datetime/YearMonth;->Companion:Llf8;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 35
    :try_start_0
    invoke-static {p1, p2}, Ljava/time/YearMonth;->of(II)Ljava/time/YearMonth;

    move-result-object p1
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0, p1}, Lkotlinx/datetime/YearMonth;-><init>(Ljava/time/YearMonth;)V

    return-void

    :catch_0
    move-exception p0

    .line 37
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public constructor <init>(ILyl4;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    add-int/lit8 p2, p2, 0x1

    .line 9
    .line 10
    invoke-static {p2}, Ljava/time/Month;->of(I)Ljava/time/Month;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {p1, p2}, Ljava/time/YearMonth;->of(ILjava/time/Month;)Ljava/time/YearMonth;

    .line 18
    .line 19
    .line 20
    move-result-object p1
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p1}, Lkotlinx/datetime/YearMonth;-><init>(Ljava/time/YearMonth;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catch_0
    move-exception p0

    .line 29
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    throw p1
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public constructor <init>(Ljava/time/YearMonth;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    return-void
.end method

.method private final readObject(Ljava/io/ObjectInputStream;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/io/InvalidObjectException;

    .line 2
    .line 3
    const-string p1, "kotlinx.datetime.YearMonth must be deserialized via kotlinx.datetime.Ser"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lkl6;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1, p0}, Lkl6;-><init>(ILjava/io/Serializable;)V

    .line 6
    .line 7
    .line 8
    return-object v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 13
    check-cast p1, Lkotlinx/datetime/YearMonth;

    invoke-virtual {p0, p1}, Lkotlinx/datetime/YearMonth;->compareTo(Lkotlinx/datetime/YearMonth;)I

    move-result p0

    return p0
.end method

.method public compareTo(Lkotlinx/datetime/YearMonth;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    .line 5
    .line 6
    iget-object p1, p1, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    .line 7
    .line 8
    invoke-static {p0, p1}, Lh08;->b(Ljava/time/YearMonth;Ljava/time/YearMonth;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Lkotlinx/datetime/YearMonth;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    .line 8
    .line 9
    check-cast p1, Lkotlinx/datetime/YearMonth;

    .line 10
    .line 11
    iget-object p1, p1, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    .line 12
    .line 13
    invoke-static {p0, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final getDays()Lkotlinx/datetime/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlinx/datetime/YearMonth;->getFirstDay()Lkotlinx/datetime/LocalDate;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lkotlinx/datetime/YearMonth;->getLastDay()Lkotlinx/datetime/LocalDate;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {v0, p0}, Lkotlinx/datetime/LocalDate;->rangeTo(Lkotlinx/datetime/LocalDate;)Lkotlinx/datetime/g;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getFirstDay()Lkotlinx/datetime/LocalDate;
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/datetime/LocalDate;

    .line 2
    .line 3
    iget-object p0, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    .line 4
    .line 5
    invoke-static {p0}, Lh08;->m(Ljava/time/YearMonth;)Ljava/time/LocalDate;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0}, Lkotlinx/datetime/LocalDate;-><init>(Ljava/time/LocalDate;)V

    .line 13
    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getLastDay()Lkotlinx/datetime/LocalDate;
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/datetime/LocalDate;

    .line 2
    .line 3
    iget-object p0, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    .line 4
    .line 5
    invoke-static {p0}, Lh08;->d(Ljava/time/YearMonth;)Ljava/time/LocalDate;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0}, Lkotlinx/datetime/LocalDate;-><init>(Ljava/time/LocalDate;)V

    .line 13
    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getMonth()Lyl4;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    .line 2
    .line 3
    invoke-static {p0}, Lh08;->e(Ljava/time/YearMonth;)Ljava/time/Month;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lag8;->J(Ljava/time/Month;)Lyl4;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getMonthNumber$kotlinx_datetime()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    .line 2
    .line 3
    invoke-static {p0}, Lh08;->q(Ljava/time/YearMonth;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getNumberOfDays()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    .line 2
    .line 3
    invoke-static {p0}, Lh08;->o(Ljava/time/YearMonth;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getValue$kotlinx_datetime()Ljava/time/YearMonth;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getYear()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    .line 2
    .line 3
    invoke-static {p0}, Lh08;->l(Ljava/time/YearMonth;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    .line 2
    .line 3
    invoke-static {p0}, Lh08;->a(Ljava/time/YearMonth;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final rangeTo(Lkotlinx/datetime/YearMonth;)Lkotlinx/datetime/i;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkotlinx/datetime/i;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1}, Ltf8;-><init>(Lkotlinx/datetime/YearMonth;Lkotlinx/datetime/YearMonth;)V

    .line 7
    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final rangeUntil(Lkotlinx/datetime/YearMonth;)Lkotlinx/datetime/i;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkotlinx/datetime/i;->z:Lkotlinx/datetime/i;

    .line 5
    .line 6
    sget-object v0, Lkotlinx/datetime/YearMonth;->Companion:Llf8;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object v1, Lkotlinx/datetime/LocalDate;->Companion:Lr94;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lkotlinx/datetime/LocalDate;->access$getMIN$cp()Lkotlinx/datetime/LocalDate;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v2, Lkotlinx/datetime/YearMonth;

    .line 24
    .line 25
    invoke-virtual {v1}, Lkotlinx/datetime/LocalDate;->getYear()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {v1}, Lkotlinx/datetime/LocalDate;->getMonth()Lyl4;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {v2, v3, v1}, Lkotlinx/datetime/YearMonth;-><init>(ILyl4;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v2}, Lkotlinx/datetime/YearMonth;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    sget-object p0, Lkotlinx/datetime/i;->z:Lkotlinx/datetime/i;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_0
    sget-object v1, Lkotlinx/datetime/DateTimeUnit;->Companion:Lkotlinx/datetime/a;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {}, Lkotlinx/datetime/DateTimeUnit;->access$getMONTH$cp()Lkotlinx/datetime/DateTimeUnit$MonthBased;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    const-string v2, " to "

    .line 58
    .line 59
    :try_start_0
    invoke-virtual {v1}, Lkotlinx/datetime/DateTimeUnit$MonthBased;->getMonths()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    int-to-long v3, v3

    .line 64
    const-wide/16 v5, -0x1

    .line 65
    .line 66
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->multiplyExact(JJ)J

    .line 67
    .line 68
    .line 69
    move-result-wide v3

    .line 70
    const-wide/16 v5, 0x0

    .line 71
    .line 72
    cmp-long v5, v3, v5

    .line 73
    .line 74
    if-nez v5, :cond_1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    invoke-static {p1}, Lkotlinx/datetime/h;->b(Lkotlinx/datetime/YearMonth;)J

    .line 78
    .line 79
    .line 80
    move-result-wide v5

    .line 81
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->addExact(JJ)J

    .line 82
    .line 83
    .line 84
    move-result-wide v3

    .line 85
    invoke-static {v0, v3, v4}, Lkotlinx/datetime/h;->a(Llf8;J)Lkotlinx/datetime/YearMonth;

    .line 86
    .line 87
    .line 88
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    :goto_0
    new-instance v0, Lkotlinx/datetime/i;

    .line 90
    .line 91
    invoke-direct {v0, p0, p1}, Ltf8;-><init>(Lkotlinx/datetime/YearMonth;Lkotlinx/datetime/YearMonth;)V

    .line 92
    .line 93
    .line 94
    return-object v0

    .line 95
    :catch_0
    move-exception p0

    .line 96
    goto :goto_1

    .line 97
    :catch_1
    move-exception p0

    .line 98
    goto :goto_2

    .line 99
    :goto_1
    new-instance v0, Lkotlinx/datetime/DateTimeArithmeticException;

    .line 100
    .line 101
    new-instance v3, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v4, "Boundaries of YearMonth exceeded when adding -1 of "

    .line 104
    .line 105
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-direct {v0, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    throw v0

    .line 125
    :goto_2
    new-instance v0, Lkotlinx/datetime/DateTimeArithmeticException;

    .line 126
    .line 127
    new-instance v3, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    const-string v4, "Arithmetic overflow when adding -1 of "

    .line 130
    .line 131
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-direct {v0, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    throw v0
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lsf8;->a:Lz97;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz97;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lpc7;->s(Ljava/lang/Object;)Ljava/time/format/DateTimeFormatter;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object p0, p0, Lkotlinx/datetime/YearMonth;->value:Ljava/time/YearMonth;

    .line 12
    .line 13
    invoke-static {p0}, Lh08;->i(Ljava/lang/Object;)Ljava/time/temporal/TemporalAccessor;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {v0, p0}, Lh08;->c(Ljava/time/format/DateTimeFormatter;Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    return-object p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method
