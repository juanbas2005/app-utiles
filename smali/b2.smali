.class public final Lb2;
.super Lgl0;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Lan3;

.field public final synthetic G:Ljava/lang/String;

.field public final H:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lan3;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lb2;->E:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lb2;->F:Lan3;

    .line 8
    .line 9
    iput-object p2, p0, Lb2;->G:Ljava/lang/String;

    .line 10
    .line 11
    iget-object p1, p1, Lan3;->b:Lpl3;

    .line 12
    .line 13
    iget-object p1, p1, Lpl3;->b:Lz53;

    .line 14
    .line 15
    iput-object p1, p0, Lb2;->H:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
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

.method public constructor <init>(Lan3;Ljava/lang/String;Lll6;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb2;->E:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lb2;->F:Lan3;

    iput-object p2, p0, Lb2;->G:Ljava/lang/String;

    iput-object p3, p0, Lb2;->H:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public B(J)V
    .locals 10

    .line 1
    iget v0, p0, Lb2;->E:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lgl0;->B(J)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    cmp-long v2, p1, v0

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    const-string p1, "0"

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/16 v3, 0xa

    .line 20
    .line 21
    if-lez v2, :cond_1

    .line 22
    .line 23
    invoke-static {p1, p2, v3}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/16 v2, 0x40

    .line 29
    .line 30
    new-array v2, v2, [C

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    ushr-long v4, p1, v4

    .line 34
    .line 35
    const-wide/16 v6, 0x5

    .line 36
    .line 37
    div-long/2addr v4, v6

    .line 38
    const-wide/16 v6, 0xa

    .line 39
    .line 40
    mul-long v8, v4, v6

    .line 41
    .line 42
    sub-long/2addr p1, v8

    .line 43
    long-to-int p1, p1

    .line 44
    invoke-static {p1, v3}, Ljava/lang/Character;->forDigit(II)C

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    const/16 p2, 0x3f

    .line 49
    .line 50
    aput-char p1, v2, p2

    .line 51
    .line 52
    :goto_0
    cmp-long p1, v4, v0

    .line 53
    .line 54
    if-lez p1, :cond_2

    .line 55
    .line 56
    add-int/lit8 p2, p2, -0x1

    .line 57
    .line 58
    rem-long v8, v4, v6

    .line 59
    .line 60
    long-to-int p1, v8

    .line 61
    invoke-static {p1, v3}, Ljava/lang/Character;->forDigit(II)C

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    aput-char p1, v2, p2

    .line 66
    .line 67
    div-long/2addr v4, v6

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    new-instance p1, Ljava/lang/String;

    .line 70
    .line 71
    rsub-int/lit8 v0, p2, 0x40

    .line 72
    .line 73
    invoke-direct {p1, v2, p2, v0}, Ljava/lang/String;-><init>([CII)V

    .line 74
    .line 75
    .line 76
    :goto_1
    invoke-virtual {p0, p1}, Lb2;->j0(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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

.method public D(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget v0, p0, Lb2;->E:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lgl0;->D(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, Lnm3;

    .line 14
    .line 15
    iget-object v1, p0, Lb2;->H:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lll6;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v0, p1, v2, v1}, Lnm3;-><init>(Ljava/lang/Object;ZLll6;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lb2;->F:Lan3;

    .line 24
    .line 25
    iget-object p0, p0, Lb2;->G:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p1, p0, v0}, Lan3;->L(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final a()Lz53;
    .locals 1

    .line 1
    iget v0, p0, Lb2;->E:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lb2;->H:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lz53;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lb2;->F:Lan3;

    .line 12
    .line 13
    iget-object p0, p0, Lan3;->b:Lpl3;

    .line 14
    .line 15
    iget-object p0, p0, Lpl3;->b:Lz53;

    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 20
    .line 21
.end method

.method public i(S)V
    .locals 1

    .line 1
    iget v0, p0, Lb2;->E:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lgl0;->i(S)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    const v0, 0xffff

    .line 11
    .line 12
    .line 13
    and-int/2addr p1, v0

    .line 14
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1}, Lb2;->j0(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public j0(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lnm3;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, p1, v1, v2}, Lnm3;-><init>(Ljava/lang/Object;ZLll6;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lb2;->F:Lan3;

    .line 12
    .line 13
    iget-object p0, p0, Lb2;->G:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p1, p0, v0}, Lan3;->L(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    .line 16
    .line 17
    .line 18
    return-void
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

.method public k(B)V
    .locals 1

    .line 1
    iget v0, p0, Lb2;->E:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lgl0;->k(B)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    and-int/lit16 p1, p1, 0xff

    .line 11
    .line 12
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Lb2;->j0(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public z(I)V
    .locals 4

    .line 1
    iget v0, p0, Lb2;->E:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lgl0;->z(I)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    int-to-long v0, p1

    .line 11
    const-wide v2, 0xffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    and-long/2addr v0, v2

    .line 17
    const/16 p1, 0xa

    .line 18
    .line 19
    invoke-static {v0, v1, p1}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, Lb2;->j0(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
    .line 28
    .line 29
.end method
