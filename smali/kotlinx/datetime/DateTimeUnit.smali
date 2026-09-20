.class public abstract Lkotlinx/datetime/DateTimeUnit;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/datetime/DateTimeUnit$DateBased;,
        Lkotlinx/datetime/DateTimeUnit$DayBased;,
        Lkotlinx/datetime/DateTimeUnit$MonthBased;,
        Lkotlinx/datetime/DateTimeUnit$TimeBased;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u000f2\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u00a6\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000e\u0082\u0001\u0002\u0015\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lkotlinx/datetime/DateTimeUnit;",
        "",
        "<init>",
        "()V",
        "",
        "scalar",
        "times",
        "(I)Lkotlinx/datetime/DateTimeUnit;",
        "value",
        "",
        "unit",
        "formatToString",
        "(ILjava/lang/String;)Ljava/lang/String;",
        "",
        "(JLjava/lang/String;)Ljava/lang/String;",
        "Companion",
        "TimeBased",
        "DateBased",
        "DayBased",
        "MonthBased",
        "kotlinx/datetime/a",
        "Lkotlinx/datetime/DateTimeUnit$DateBased;",
        "Lkotlinx/datetime/DateTimeUnit$TimeBased;",
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
    with = Lzi1;
.end annotation


# static fields
.field private static final CENTURY:Lkotlinx/datetime/DateTimeUnit$MonthBased;

.field public static final Companion:Lkotlinx/datetime/a;

.field private static final DAY:Lkotlinx/datetime/DateTimeUnit$DayBased;

.field private static final HOUR:Lkotlinx/datetime/DateTimeUnit$TimeBased;

.field private static final MICROSECOND:Lkotlinx/datetime/DateTimeUnit$TimeBased;

.field private static final MILLISECOND:Lkotlinx/datetime/DateTimeUnit$TimeBased;

.field private static final MINUTE:Lkotlinx/datetime/DateTimeUnit$TimeBased;

.field private static final MONTH:Lkotlinx/datetime/DateTimeUnit$MonthBased;

.field private static final NANOSECOND:Lkotlinx/datetime/DateTimeUnit$TimeBased;

.field private static final QUARTER:Lkotlinx/datetime/DateTimeUnit$MonthBased;

.field private static final SECOND:Lkotlinx/datetime/DateTimeUnit$TimeBased;

.field private static final WEEK:Lkotlinx/datetime/DateTimeUnit$DayBased;

.field private static final YEAR:Lkotlinx/datetime/DateTimeUnit$MonthBased;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lkotlinx/datetime/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlinx/datetime/DateTimeUnit;->Companion:Lkotlinx/datetime/a;

    .line 7
    .line 8
    new-instance v0, Lkotlinx/datetime/DateTimeUnit$TimeBased;

    .line 9
    .line 10
    const-wide/16 v1, 0x1

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Lkotlinx/datetime/DateTimeUnit$TimeBased;-><init>(J)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lkotlinx/datetime/DateTimeUnit;->NANOSECOND:Lkotlinx/datetime/DateTimeUnit$TimeBased;

    .line 16
    .line 17
    const/16 v1, 0x3e8

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lkotlinx/datetime/DateTimeUnit$TimeBased;->times(I)Lkotlinx/datetime/DateTimeUnit$TimeBased;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lkotlinx/datetime/DateTimeUnit;->MICROSECOND:Lkotlinx/datetime/DateTimeUnit$TimeBased;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lkotlinx/datetime/DateTimeUnit$TimeBased;->times(I)Lkotlinx/datetime/DateTimeUnit$TimeBased;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lkotlinx/datetime/DateTimeUnit;->MILLISECOND:Lkotlinx/datetime/DateTimeUnit$TimeBased;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lkotlinx/datetime/DateTimeUnit$TimeBased;->times(I)Lkotlinx/datetime/DateTimeUnit$TimeBased;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lkotlinx/datetime/DateTimeUnit;->SECOND:Lkotlinx/datetime/DateTimeUnit$TimeBased;

    .line 36
    .line 37
    const/16 v1, 0x3c

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lkotlinx/datetime/DateTimeUnit$TimeBased;->times(I)Lkotlinx/datetime/DateTimeUnit$TimeBased;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lkotlinx/datetime/DateTimeUnit;->MINUTE:Lkotlinx/datetime/DateTimeUnit$TimeBased;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lkotlinx/datetime/DateTimeUnit$TimeBased;->times(I)Lkotlinx/datetime/DateTimeUnit$TimeBased;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lkotlinx/datetime/DateTimeUnit;->HOUR:Lkotlinx/datetime/DateTimeUnit$TimeBased;

    .line 50
    .line 51
    new-instance v0, Lkotlinx/datetime/DateTimeUnit$DayBased;

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    invoke-direct {v0, v1}, Lkotlinx/datetime/DateTimeUnit$DayBased;-><init>(I)V

    .line 55
    .line 56
    .line 57
    sput-object v0, Lkotlinx/datetime/DateTimeUnit;->DAY:Lkotlinx/datetime/DateTimeUnit$DayBased;

    .line 58
    .line 59
    const/4 v2, 0x7

    .line 60
    invoke-virtual {v0, v2}, Lkotlinx/datetime/DateTimeUnit$DayBased;->times(I)Lkotlinx/datetime/DateTimeUnit$DayBased;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sput-object v0, Lkotlinx/datetime/DateTimeUnit;->WEEK:Lkotlinx/datetime/DateTimeUnit$DayBased;

    .line 65
    .line 66
    new-instance v0, Lkotlinx/datetime/DateTimeUnit$MonthBased;

    .line 67
    .line 68
    invoke-direct {v0, v1}, Lkotlinx/datetime/DateTimeUnit$MonthBased;-><init>(I)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lkotlinx/datetime/DateTimeUnit;->MONTH:Lkotlinx/datetime/DateTimeUnit$MonthBased;

    .line 72
    .line 73
    const/4 v1, 0x3

    .line 74
    invoke-virtual {v0, v1}, Lkotlinx/datetime/DateTimeUnit$MonthBased;->times(I)Lkotlinx/datetime/DateTimeUnit$MonthBased;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    sput-object v1, Lkotlinx/datetime/DateTimeUnit;->QUARTER:Lkotlinx/datetime/DateTimeUnit$MonthBased;

    .line 79
    .line 80
    const/16 v1, 0xc

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Lkotlinx/datetime/DateTimeUnit$MonthBased;->times(I)Lkotlinx/datetime/DateTimeUnit$MonthBased;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sput-object v0, Lkotlinx/datetime/DateTimeUnit;->YEAR:Lkotlinx/datetime/DateTimeUnit$MonthBased;

    .line 87
    .line 88
    const/16 v1, 0x64

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Lkotlinx/datetime/DateTimeUnit$MonthBased;->times(I)Lkotlinx/datetime/DateTimeUnit$MonthBased;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    sput-object v0, Lkotlinx/datetime/DateTimeUnit;->CENTURY:Lkotlinx/datetime/DateTimeUnit$MonthBased;

    .line 95
    .line 96
    return-void
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lhl1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlinx/datetime/DateTimeUnit;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static final synthetic access$getCENTURY$cp()Lkotlinx/datetime/DateTimeUnit$MonthBased;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/datetime/DateTimeUnit;->CENTURY:Lkotlinx/datetime/DateTimeUnit$MonthBased;

    .line 2
    .line 3
    return-object v0
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

.method public static final synthetic access$getDAY$cp()Lkotlinx/datetime/DateTimeUnit$DayBased;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/datetime/DateTimeUnit;->DAY:Lkotlinx/datetime/DateTimeUnit$DayBased;

    .line 2
    .line 3
    return-object v0
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

.method public static final synthetic access$getHOUR$cp()Lkotlinx/datetime/DateTimeUnit$TimeBased;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/datetime/DateTimeUnit;->HOUR:Lkotlinx/datetime/DateTimeUnit$TimeBased;

    .line 2
    .line 3
    return-object v0
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

.method public static final synthetic access$getMICROSECOND$cp()Lkotlinx/datetime/DateTimeUnit$TimeBased;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/datetime/DateTimeUnit;->MICROSECOND:Lkotlinx/datetime/DateTimeUnit$TimeBased;

    .line 2
    .line 3
    return-object v0
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

.method public static final synthetic access$getMILLISECOND$cp()Lkotlinx/datetime/DateTimeUnit$TimeBased;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/datetime/DateTimeUnit;->MILLISECOND:Lkotlinx/datetime/DateTimeUnit$TimeBased;

    .line 2
    .line 3
    return-object v0
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

.method public static final synthetic access$getMINUTE$cp()Lkotlinx/datetime/DateTimeUnit$TimeBased;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/datetime/DateTimeUnit;->MINUTE:Lkotlinx/datetime/DateTimeUnit$TimeBased;

    .line 2
    .line 3
    return-object v0
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

.method public static final synthetic access$getMONTH$cp()Lkotlinx/datetime/DateTimeUnit$MonthBased;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/datetime/DateTimeUnit;->MONTH:Lkotlinx/datetime/DateTimeUnit$MonthBased;

    .line 2
    .line 3
    return-object v0
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

.method public static final synthetic access$getNANOSECOND$cp()Lkotlinx/datetime/DateTimeUnit$TimeBased;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/datetime/DateTimeUnit;->NANOSECOND:Lkotlinx/datetime/DateTimeUnit$TimeBased;

    .line 2
    .line 3
    return-object v0
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

.method public static final synthetic access$getQUARTER$cp()Lkotlinx/datetime/DateTimeUnit$MonthBased;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/datetime/DateTimeUnit;->QUARTER:Lkotlinx/datetime/DateTimeUnit$MonthBased;

    .line 2
    .line 3
    return-object v0
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

.method public static final synthetic access$getSECOND$cp()Lkotlinx/datetime/DateTimeUnit$TimeBased;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/datetime/DateTimeUnit;->SECOND:Lkotlinx/datetime/DateTimeUnit$TimeBased;

    .line 2
    .line 3
    return-object v0
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

.method public static final synthetic access$getWEEK$cp()Lkotlinx/datetime/DateTimeUnit$DayBased;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/datetime/DateTimeUnit;->WEEK:Lkotlinx/datetime/DateTimeUnit$DayBased;

    .line 2
    .line 3
    return-object v0
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

.method public static final synthetic access$getYEAR$cp()Lkotlinx/datetime/DateTimeUnit$MonthBased;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/datetime/DateTimeUnit;->YEAR:Lkotlinx/datetime/DateTimeUnit$MonthBased;

    .line 2
    .line 3
    return-object v0
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


# virtual methods
.method public final formatToString(ILjava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x1

    if-ne p1, p0, :cond_0

    return-object p2

    .line 32
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x2d

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final formatToString(JLjava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x1

    .line 5
    .line 6
    cmp-long p0, p1, v0

    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-object p3

    .line 11
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/16 p1, 0x2d

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
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

.method public abstract times(I)Lkotlinx/datetime/DateTimeUnit;
.end method
