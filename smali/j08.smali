.class public abstract Lj08;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lz97;

.field public static final b:Lz97;

.field public static final c:Lz97;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwi7;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lwi7;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lz97;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lz97;-><init>(Lsr2;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lj08;->a:Lz97;

    .line 14
    .line 15
    new-instance v0, Lwi7;

    .line 16
    .line 17
    const/16 v1, 0x14

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lwi7;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lz97;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lz97;-><init>(Lsr2;)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lj08;->b:Lz97;

    .line 28
    .line 29
    new-instance v0, Lwi7;

    .line 30
    .line 31
    const/16 v1, 0x12

    .line 32
    .line 33
    invoke-direct {v0, v1}, Lwi7;-><init>(I)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Lz97;

    .line 37
    .line 38
    invoke-direct {v1, v0}, Lz97;-><init>(Lsr2;)V

    .line 39
    .line 40
    .line 41
    sput-object v1, Lj08;->c:Lz97;

    .line 42
    .line 43
    return-void
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

.method public static final a(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lkotlinx/datetime/UtcOffset;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    :try_start_0
    new-instance v1, Lkotlinx/datetime/UtcOffset;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move p1, v0

    .line 18
    :goto_0
    if-eqz p2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    :cond_1
    invoke-static {p0, p1, v0}, Ljava/time/ZoneOffset;->ofHoursMinutesSeconds(III)Ljava/time/ZoneOffset;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, p0}, Lkotlinx/datetime/UtcOffset;-><init>(Ljava/time/ZoneOffset;)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_2
    if-eqz p1, :cond_4

    .line 36
    .line 37
    new-instance p0, Lkotlinx/datetime/UtcOffset;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    div-int/lit8 v1, v1, 0x3c

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    rem-int/lit8 p1, p1, 0x3c

    .line 50
    .line 51
    if-eqz p2, :cond_3

    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    :cond_3
    invoke-static {v1, p1, v0}, Ljava/time/ZoneOffset;->ofHoursMinutesSeconds(III)Ljava/time/ZoneOffset;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, p1}, Lkotlinx/datetime/UtcOffset;-><init>(Ljava/time/ZoneOffset;)V

    .line 65
    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_4
    new-instance p0, Lkotlinx/datetime/UtcOffset;

    .line 69
    .line 70
    if-eqz p2, :cond_5

    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    :cond_5
    invoke-static {v0}, Ljava/time/ZoneOffset;->ofTotalSeconds(I)Ljava/time/ZoneOffset;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-direct {p0, p1}, Lkotlinx/datetime/UtcOffset;-><init>(Ljava/time/ZoneOffset;)V
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 85
    .line 86
    return-object p0

    .line 87
    :catch_0
    move-exception p0

    .line 88
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 89
    .line 90
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    throw p1
    .line 94
.end method

.method public static final b(Ljava/lang/String;Ljava/time/format/DateTimeFormatter;)Lkotlinx/datetime/UtcOffset;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Li08;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p0, v0}, Ljava/time/format/DateTimeFormatter;->parse(Ljava/lang/CharSequence;Ljava/time/temporal/TemporalQuery;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/time/ZoneOffset;

    .line 11
    .line 12
    new-instance p1, Lkotlinx/datetime/UtcOffset;

    .line 13
    .line 14
    invoke-direct {p1, p0}, Lkotlinx/datetime/UtcOffset;-><init>(Ljava/time/ZoneOffset;)V
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :catch_0
    move-exception p0

    .line 19
    new-instance p1, Lkotlinx/datetime/DateTimeFormatException;

    .line 20
    .line 21
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw p1
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
.end method
