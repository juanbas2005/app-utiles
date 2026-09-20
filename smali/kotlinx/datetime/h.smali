.class public abstract Lkotlinx/datetime/h;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# direct methods
.method public static final a(Llf8;J)Lkotlinx/datetime/YearMonth;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0xc

    .line 5
    .line 6
    div-long v2, p1, v0

    .line 7
    .line 8
    xor-long v4, p1, v0

    .line 9
    .line 10
    const-wide/16 v6, 0x0

    .line 11
    .line 12
    cmp-long p0, v4, v6

    .line 13
    .line 14
    if-gez p0, :cond_0

    .line 15
    .line 16
    mul-long v4, v2, v0

    .line 17
    .line 18
    cmp-long p0, v4, p1

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    const-wide/16 v4, -0x1

    .line 23
    .line 24
    add-long/2addr v2, v4

    .line 25
    :cond_0
    sget-object p0, Lkotlinx/datetime/LocalDate;->Companion:Lr94;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lkotlinx/datetime/LocalDate;->access$getMIN$cp()Lkotlinx/datetime/LocalDate;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v4}, Lkotlinx/datetime/LocalDate;->getYear()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lkotlinx/datetime/LocalDate;->access$getMAX$cp()Lkotlinx/datetime/LocalDate;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v5}, Lkotlinx/datetime/LocalDate;->getYear()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    int-to-long v5, v5

    .line 50
    cmp-long v5, v2, v5

    .line 51
    .line 52
    if-gtz v5, :cond_1

    .line 53
    .line 54
    int-to-long v4, v4

    .line 55
    cmp-long v4, v4, v2

    .line 56
    .line 57
    if-gtz v4, :cond_1

    .line 58
    .line 59
    rem-long/2addr p1, v0

    .line 60
    xor-long v4, p1, v0

    .line 61
    .line 62
    neg-long v6, p1

    .line 63
    or-long/2addr v6, p1

    .line 64
    and-long/2addr v4, v6

    .line 65
    const/16 p0, 0x3f

    .line 66
    .line 67
    shr-long/2addr v4, p0

    .line 68
    and-long/2addr v0, v4

    .line 69
    add-long/2addr p1, v0

    .line 70
    long-to-int p0, p1

    .line 71
    add-int/lit8 p0, p0, 0x1

    .line 72
    .line 73
    new-instance p1, Lkotlinx/datetime/YearMonth;

    .line 74
    .line 75
    long-to-int p2, v2

    .line 76
    invoke-direct {p1, p2, p0}, Lkotlinx/datetime/YearMonth;-><init>(II)V

    .line 77
    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lkotlinx/datetime/LocalDate;->access$getMIN$cp()Lkotlinx/datetime/LocalDate;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1}, Lkotlinx/datetime/LocalDate;->getYear()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-static {}, Lkotlinx/datetime/LocalDate;->access$getMAX$cp()Lkotlinx/datetime/LocalDate;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0}, Lkotlinx/datetime/LocalDate;->getYear()I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    new-instance p2, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v0, "Year "

    .line 105
    .line 106
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v0, " is out of range: "

    .line 113
    .line 114
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string p1, ".."

    .line 121
    .line 122
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 133
    .line 134
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p1
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
.end method

.method public static final b(Lkotlinx/datetime/YearMonth;)J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lkotlinx/datetime/YearMonth;->getYear()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    const-wide/16 v2, 0xc

    .line 7
    .line 8
    mul-long/2addr v0, v2

    .line 9
    invoke-virtual {p0}, Lkotlinx/datetime/YearMonth;->getMonthNumber$kotlinx_datetime()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-int/lit8 p0, p0, -0x1

    .line 14
    .line 15
    int-to-long v2, p0

    .line 16
    add-long/2addr v0, v2

    .line 17
    return-wide v0
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
