.class public final synthetic Lcf7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ltp1;

.field public final synthetic y:Laq4;


# direct methods
.method public synthetic constructor <init>(ILtp1;Laq4;)V
    .locals 0

    .line 1
    iput p1, p0, Lcf7;->w:I

    .line 2
    .line 3
    iput-object p2, p0, Lcf7;->x:Ltp1;

    .line 4
    .line 5
    iput-object p3, p0, Lcf7;->y:Laq4;

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
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lcf7;->w:I

    .line 2
    .line 3
    iget-object v1, p0, Lcf7;->y:Laq4;

    .line 4
    .line 5
    iget-object p0, p0, Lcf7;->x:Ltp1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lpx1;

    .line 11
    .line 12
    iget-wide v2, p1, Lpx1;->a:J

    .line 13
    .line 14
    invoke-static {v2, v3}, Lpx1;->b(J)F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-interface {p0, v0}, Ltp1;->r0(F)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p1, Lpx1;->a:J

    .line 23
    .line 24
    invoke-static {v2, v3}, Lpx1;->a(J)F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-interface {p0, p1}, Ltp1;->r0(F)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    int-to-long v2, v0

    .line 33
    const/16 p1, 0x20

    .line 34
    .line 35
    shl-long/2addr v2, p1

    .line 36
    int-to-long p0, p0

    .line 37
    const-wide v4, 0xffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    and-long/2addr p0, v4

    .line 43
    or-long/2addr p0, v2

    .line 44
    new-instance v0, Lwe3;

    .line 45
    .line 46
    invoke-direct {v0, p0, p1}, Lwe3;-><init>(J)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v1, v0}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lvs7;->a:Lvs7;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_0
    check-cast p1, Lsr2;

    .line 56
    .line 57
    new-instance v0, Lsn;

    .line 58
    .line 59
    const/4 v2, 0x7

    .line 60
    invoke-direct {v0, v2, p1}, Lsn;-><init>(ILsr2;)V

    .line 61
    .line 62
    .line 63
    new-instance p1, Lcf7;

    .line 64
    .line 65
    const/4 v2, 0x1

    .line 66
    invoke-direct {p1, v2, p0, v1}, Lcf7;-><init>(ILtp1;Laq4;)V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lsd4;->a()Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_2

    .line 74
    .line 75
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 76
    .line 77
    const/16 v1, 0x1c

    .line 78
    .line 79
    if-ne p0, v1, :cond_0

    .line 80
    .line 81
    sget-object p0, Loj5;->b:Loj5;

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    sget-object p0, Loj5;->c:Loj5;

    .line 85
    .line 86
    :goto_0
    invoke-static {}, Lsd4;->a()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_1

    .line 91
    .line 92
    new-instance v1, Lpd4;

    .line 93
    .line 94
    invoke-direct {v1, v0, p1, p0}, Lpd4;-><init>(Lsn;Lcf7;Lmj5;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_1
    sget-object v1, Ljl4;->w:Ljl4;

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    const-string p0, "Magnifier is only supported on API level 28 and higher."

    .line 102
    .line 103
    invoke-static {p0}, Lkj6;->n(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const/4 v1, 0x0

    .line 107
    :goto_1
    return-object v1

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
