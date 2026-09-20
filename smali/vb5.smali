.class public abstract Lvb5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public w:Lkb9;

.field public x:Llt0;

.field public y:F

.field public z:Ley3;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lvb5;->y:F

    .line 7
    .line 8
    sget-object v0, Ley3;->w:Ley3;

    .line 9
    .line 10
    iput-object v0, p0, Lvb5;->z:Ley3;

    .line 11
    .line 12
    return-void
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

.method public static synthetic h(Lvb5;Lwy3;J)V
    .locals 6

    .line 1
    const/4 v5, 0x0

    .line 2
    const/high16 v4, 0x3f800000    # 1.0f

    .line 3
    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p1

    .line 6
    move-wide v2, p2

    .line 7
    invoke-virtual/range {v0 .. v5}, Lvb5;->g(Lwy3;JFLlt0;)V

    .line 8
    .line 9
    .line 10
    return-void
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
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
.end method


# virtual methods
.method public abstract d(F)V
.end method

.method public abstract e(Llt0;)V
.end method

.method public f(Ley3;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final g(Lwy3;JFLlt0;)V
    .locals 6

    .line 1
    iget-object v0, p1, Lwy3;->w:Ltk0;

    .line 2
    .line 3
    iget v1, p0, Lvb5;->y:F

    .line 4
    .line 5
    cmpg-float v1, v1, p4

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0, p4}, Lvb5;->d(F)V

    .line 11
    .line 12
    .line 13
    iput p4, p0, Lvb5;->y:F

    .line 14
    .line 15
    :goto_0
    iget-object v1, p0, Lvb5;->x:Llt0;

    .line 16
    .line 17
    invoke-static {v1, p5}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, p5}, Lvb5;->e(Llt0;)V

    .line 24
    .line 25
    .line 26
    iput-object p5, p0, Lvb5;->x:Llt0;

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p1}, Lwy3;->getLayoutDirection()Ley3;

    .line 29
    .line 30
    .line 31
    move-result-object p5

    .line 32
    iget-object v1, p0, Lvb5;->z:Ley3;

    .line 33
    .line 34
    if-eq v1, p5, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0, p5}, Lvb5;->f(Ley3;)V

    .line 37
    .line 38
    .line 39
    iput-object p5, p0, Lvb5;->z:Ley3;

    .line 40
    .line 41
    :cond_2
    invoke-interface {v0}, Lhz1;->e()J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    const/16 p5, 0x20

    .line 46
    .line 47
    shr-long/2addr v1, p5

    .line 48
    long-to-int v1, v1

    .line 49
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    shr-long v2, p2, p5

    .line 54
    .line 55
    long-to-int p5, v2

    .line 56
    invoke-static {p5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    sub-float/2addr v1, v2

    .line 61
    invoke-interface {v0}, Lhz1;->e()J

    .line 62
    .line 63
    .line 64
    move-result-wide v2

    .line 65
    const-wide v4, 0xffffffffL

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    and-long/2addr v2, v4

    .line 71
    long-to-int v2, v2

    .line 72
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    and-long/2addr p2, v4

    .line 77
    long-to-int p2, p2

    .line 78
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    sub-float/2addr v2, p3

    .line 83
    iget-object p3, v0, Ltk0;->x:Lwr0;

    .line 84
    .line 85
    iget-object p3, p3, Lwr0;->x:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p3, Lji8;

    .line 88
    .line 89
    const/4 v3, 0x0

    .line 90
    invoke-virtual {p3, v3, v3, v1, v2}, Lji8;->y(FFFF)V

    .line 91
    .line 92
    .line 93
    cmpl-float p3, p4, v3

    .line 94
    .line 95
    const/high16 p4, -0x80000000

    .line 96
    .line 97
    if-lez p3, :cond_3

    .line 98
    .line 99
    :try_start_0
    invoke-static {p5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 100
    .line 101
    .line 102
    move-result p3

    .line 103
    cmpl-float p3, p3, v3

    .line 104
    .line 105
    if-lez p3, :cond_3

    .line 106
    .line 107
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    cmpl-float p2, p2, v3

    .line 112
    .line 113
    if-lez p2, :cond_3

    .line 114
    .line 115
    invoke-virtual {p0, p1}, Lvb5;->j(Lwy3;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :catchall_0
    move-exception p0

    .line 120
    iget-object p1, v0, Ltk0;->x:Lwr0;

    .line 121
    .line 122
    iget-object p1, p1, Lwr0;->x:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p1, Lji8;

    .line 125
    .line 126
    neg-float p2, v1

    .line 127
    neg-float p3, v2

    .line 128
    invoke-virtual {p1, p4, p4, p2, p3}, Lji8;->y(FFFF)V

    .line 129
    .line 130
    .line 131
    throw p0

    .line 132
    :cond_3
    :goto_1
    iget-object p0, v0, Ltk0;->x:Lwr0;

    .line 133
    .line 134
    iget-object p0, p0, Lwr0;->x:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p0, Lji8;

    .line 137
    .line 138
    neg-float p1, v1

    .line 139
    neg-float p2, v2

    .line 140
    invoke-virtual {p0, p4, p4, p1, p2}, Lji8;->y(FFFF)V

    .line 141
    .line 142
    .line 143
    return-void
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public abstract i()J
.end method

.method public abstract j(Lwy3;)V
.end method
