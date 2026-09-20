.class public final Lpj5;
.super Lnj5;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# virtual methods
.method public final a(JJ)V
    .locals 6

    .line 1
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lnj5;->a:Landroid/widget/Magnifier;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Landroid/widget/Magnifier;->setZoom(F)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const-wide v0, 0x7fffffff7fffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr v0, p3

    .line 20
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    iget-object p0, p0, Lnj5;->a:Landroid/widget/Magnifier;

    .line 28
    .line 29
    const-wide v1, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    const/16 v3, 0x20

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    shr-long v4, p1, v3

    .line 39
    .line 40
    long-to-int v0, v4

    .line 41
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    and-long/2addr p1, v1

    .line 46
    long-to-int p1, p1

    .line 47
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    shr-long v3, p3, v3

    .line 52
    .line 53
    long-to-int p2, v3

    .line 54
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    and-long/2addr p3, v1

    .line 59
    long-to-int p3, p3

    .line 60
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result p3

    .line 64
    invoke-virtual {p0, v0, p1, p2, p3}, Landroid/widget/Magnifier;->show(FFFF)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    shr-long p3, p1, v3

    .line 69
    .line 70
    long-to-int p3, p3

    .line 71
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    and-long/2addr p1, v1

    .line 76
    long-to-int p1, p1

    .line 77
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    invoke-virtual {p0, p3, p1}, Landroid/widget/Magnifier;->show(FF)V

    .line 82
    .line 83
    .line 84
    return-void
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
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
