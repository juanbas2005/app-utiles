.class public final synthetic Lgv4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ltp1;

.field public final synthetic y:Lbd5;


# direct methods
.method public synthetic constructor <init>(Ltp1;Lbd5;I)V
    .locals 0

    .line 1
    iput p3, p0, Lgv4;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lgv4;->x:Ltp1;

    .line 4
    .line 5
    iput-object p2, p0, Lgv4;->y:Lbd5;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final b()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lgv4;->w:I

    .line 2
    .line 3
    const/high16 v1, 0x41400000    # 12.0f

    .line 4
    .line 5
    const-wide v2, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const/16 v4, 0x20

    .line 11
    .line 12
    const/high16 v5, 0x40000000    # 2.0f

    .line 13
    .line 14
    iget-object v6, p0, Lgv4;->y:Lbd5;

    .line 15
    .line 16
    const/high16 v7, 0x42600000    # 56.0f

    .line 17
    .line 18
    iget-object p0, p0, Lgv4;->x:Ltp1;

    .line 19
    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v6}, Lbd5;->d()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-interface {p0, v7}, Ltp1;->r0(F)I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    sub-int/2addr v0, v6

    .line 32
    int-to-float v0, v0

    .line 33
    div-float/2addr v0, v5

    .line 34
    invoke-interface {p0, v1}, Ltp1;->e0(F)F

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    int-to-long v0, v0

    .line 43
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    int-to-long v5, p0

    .line 48
    shl-long/2addr v0, v4

    .line 49
    and-long/2addr v2, v5

    .line 50
    or-long/2addr v0, v2

    .line 51
    new-instance p0, Ll35;

    .line 52
    .line 53
    invoke-direct {p0, v0, v1}, Ll35;-><init>(J)V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_0
    invoke-virtual {v6}, Lbd5;->d()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-interface {p0, v7}, Ltp1;->r0(F)I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    sub-int/2addr v0, v6

    .line 66
    int-to-float v0, v0

    .line 67
    div-float/2addr v0, v5

    .line 68
    invoke-interface {p0, v1}, Ltp1;->e0(F)F

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    int-to-long v0, v0

    .line 77
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    int-to-long v5, p0

    .line 82
    shl-long/2addr v0, v4

    .line 83
    and-long/2addr v2, v5

    .line 84
    or-long/2addr v0, v2

    .line 85
    new-instance p0, Ll35;

    .line 86
    .line 87
    invoke-direct {p0, v0, v1}, Ll35;-><init>(J)V

    .line 88
    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_1
    invoke-interface {p0, v7}, Ltp1;->r0(F)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-virtual {v6}, Lbd5;->d()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    sub-int/2addr v1, v0

    .line 100
    int-to-float v0, v1

    .line 101
    div-float/2addr v0, v5

    .line 102
    sget v1, Lhv4;->f:F

    .line 103
    .line 104
    invoke-interface {p0, v1}, Ltp1;->e0(F)F

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    int-to-long v0, v0

    .line 113
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    int-to-long v5, p0

    .line 118
    shl-long/2addr v0, v4

    .line 119
    and-long/2addr v2, v5

    .line 120
    or-long/2addr v0, v2

    .line 121
    new-instance p0, Ll35;

    .line 122
    .line 123
    invoke-direct {p0, v0, v1}, Ll35;-><init>(J)V

    .line 124
    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
