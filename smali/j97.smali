.class public final Lj97;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lmk1;


# virtual methods
.method public final a(Lxy6;Lv75;)Lpk1;
    .locals 11

    .line 1
    iget-object p0, p1, Lxy6;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p1, Lxy6;->a:Lu83;

    .line 4
    .line 5
    const-string v0, "image/svg+xml"

    .line 6
    .line 7
    invoke-static {p0, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_5

    .line 12
    .line 13
    invoke-virtual {p1}, Lu83;->k()Led0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object p0, Li97;->b:Ldg0;

    .line 18
    .line 19
    const-wide/16 v1, 0x0

    .line 20
    .line 21
    invoke-interface {v0, v1, v2, p0}, Led0;->c0(JLdg0;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    const/4 v6, 0x0

    .line 26
    if-eqz p0, :cond_4

    .line 27
    .line 28
    sget-object p0, Li97;->a:Ldg0;

    .line 29
    .line 30
    iget-object v3, p0, Ldg0;->w:[B

    .line 31
    .line 32
    array-length v4, v3

    .line 33
    if-lez v4, :cond_3

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    aget-byte v4, v3, v4

    .line 37
    .line 38
    array-length v3, v3

    .line 39
    int-to-long v7, v3

    .line 40
    const-wide/16 v9, 0x400

    .line 41
    .line 42
    sub-long/2addr v9, v7

    .line 43
    move-wide v2, v1

    .line 44
    :goto_0
    cmp-long v1, v2, v9

    .line 45
    .line 46
    const-wide/16 v7, -0x1

    .line 47
    .line 48
    if-gez v1, :cond_1

    .line 49
    .line 50
    move v1, v4

    .line 51
    move-wide v4, v9

    .line 52
    invoke-interface/range {v0 .. v5}, Led0;->C(BJJ)J

    .line 53
    .line 54
    .line 55
    move-result-wide v2

    .line 56
    cmp-long v9, v2, v7

    .line 57
    .line 58
    if-eqz v9, :cond_2

    .line 59
    .line 60
    invoke-interface {v0, v2, v3, p0}, Led0;->c0(JLdg0;)Z

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    if-eqz v9, :cond_0

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_0
    const-wide/16 v7, 0x1

    .line 68
    .line 69
    add-long/2addr v2, v7

    .line 70
    move-wide v9, v4

    .line 71
    move v4, v1

    .line 72
    goto :goto_0

    .line 73
    :cond_1
    move-wide v2, v7

    .line 74
    :cond_2
    :goto_1
    cmp-long p0, v2, v7

    .line 75
    .line 76
    if-eqz p0, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    const-string p0, "bytes is empty"

    .line 80
    .line 81
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    return-object v6

    .line 85
    :cond_5
    :goto_2
    new-instance p0, Lk97;

    .line 86
    .line 87
    invoke-direct {p0, p1, p2}, Lk97;-><init>(Lu83;Lv75;)V

    .line 88
    .line 89
    .line 90
    return-object p0
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
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
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of p0, p1, Lj97;

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    return v0

    .line 10
    :cond_1
    const/4 p0, 0x0

    .line 11
    return p0
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

.method public final hashCode()I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
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
