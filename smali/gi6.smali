.class public final synthetic Lgi6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Loi6;


# direct methods
.method public synthetic constructor <init>(Loi6;I)V
    .locals 0

    .line 1
    iput p2, p0, Lgi6;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lgi6;->x:Loi6;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
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
.end method


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lgi6;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    iget-object p0, p0, Lgi6;->x:Loi6;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Long;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-wide v4, p0, Loi6;->I:J

    .line 17
    .line 18
    sub-long v4, v2, v4

    .line 19
    .line 20
    iput-wide v2, p0, Loi6;->I:J

    .line 21
    .line 22
    long-to-double v2, v4

    .line 23
    iget p1, p0, Loi6;->M:F

    .line 24
    .line 25
    float-to-double v4, p1

    .line 26
    div-double/2addr v2, v4

    .line 27
    invoke-static {v2, v3}, Ldh4;->D(D)J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    iget-object p1, p0, Loi6;->J:Llp4;

    .line 32
    .line 33
    invoke-virtual {p1}, Llp4;->i()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v4, 0x0

    .line 38
    if-eqz v0, :cond_4

    .line 39
    .line 40
    iget-object v0, p1, Llp4;->a:[Ljava/lang/Object;

    .line 41
    .line 42
    iget v5, p1, Llp4;->b:I

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    move v7, v6

    .line 46
    :goto_0
    if-ge v7, v5, :cond_0

    .line 47
    .line 48
    aget-object v8, v0, v7

    .line 49
    .line 50
    check-cast v8, Lhi6;

    .line 51
    .line 52
    invoke-static {v8, v2, v3}, Loi6;->k1(Lhi6;J)V

    .line 53
    .line 54
    .line 55
    const/4 v9, 0x1

    .line 56
    iput-boolean v9, v8, Lhi6;->c:Z

    .line 57
    .line 58
    add-int/lit8 v7, v7, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    iget-object v0, p0, Loi6;->A:Lmm7;

    .line 62
    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    invoke-virtual {v0}, Lmm7;->p()V

    .line 66
    .line 67
    .line 68
    :cond_1
    iget v0, p1, Llp4;->b:I

    .line 69
    .line 70
    iget-object v5, p1, Llp4;->a:[Ljava/lang/Object;

    .line 71
    .line 72
    invoke-static {v6, v0}, Lz65;->V(II)Lre3;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    iget v8, v7, Lpe3;->w:I

    .line 77
    .line 78
    iget v7, v7, Lpe3;->x:I

    .line 79
    .line 80
    if-gt v8, v7, :cond_3

    .line 81
    .line 82
    :goto_1
    sub-int v9, v8, v6

    .line 83
    .line 84
    aget-object v10, v5, v8

    .line 85
    .line 86
    aput-object v10, v5, v9

    .line 87
    .line 88
    aget-object v9, v5, v8

    .line 89
    .line 90
    check-cast v9, Lhi6;

    .line 91
    .line 92
    iget-boolean v9, v9, Lhi6;->c:Z

    .line 93
    .line 94
    if-eqz v9, :cond_2

    .line 95
    .line 96
    add-int/lit8 v6, v6, 0x1

    .line 97
    .line 98
    :cond_2
    if-eq v8, v7, :cond_3

    .line 99
    .line 100
    add-int/lit8 v8, v8, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    sub-int v7, v0, v6

    .line 104
    .line 105
    invoke-static {v7, v0, v4, v5}, Lqs;->S0(IILjava/lang/Object;[Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iget v0, p1, Llp4;->b:I

    .line 109
    .line 110
    sub-int/2addr v0, v6

    .line 111
    iput v0, p1, Llp4;->b:I

    .line 112
    .line 113
    :cond_4
    iget-object p1, p0, Loi6;->K:Lhi6;

    .line 114
    .line 115
    if-eqz p1, :cond_6

    .line 116
    .line 117
    iget-wide v5, p0, Loi6;->B:J

    .line 118
    .line 119
    iput-wide v5, p1, Lhi6;->g:J

    .line 120
    .line 121
    invoke-static {p1, v2, v3}, Loi6;->k1(Lhi6;J)V

    .line 122
    .line 123
    .line 124
    iget v0, p1, Lhi6;->d:F

    .line 125
    .line 126
    invoke-virtual {p0, v0}, Loi6;->n1(F)V

    .line 127
    .line 128
    .line 129
    iget p1, p1, Lhi6;->d:F

    .line 130
    .line 131
    const/high16 v0, 0x3f800000    # 1.0f

    .line 132
    .line 133
    cmpg-float p1, p1, v0

    .line 134
    .line 135
    if-nez p1, :cond_5

    .line 136
    .line 137
    iput-object v4, p0, Loi6;->K:Lhi6;

    .line 138
    .line 139
    :cond_5
    invoke-virtual {p0}, Loi6;->m1()V

    .line 140
    .line 141
    .line 142
    :cond_6
    return-object v1

    .line 143
    :pswitch_0
    iput-wide v2, p0, Loi6;->I:J

    .line 144
    .line 145
    return-object v1

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
