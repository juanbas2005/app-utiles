.class public final synthetic Lrp0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Lgs2;


# direct methods
.method public synthetic constructor <init>(JLgs2;I)V
    .locals 0

    .line 1
    const/4 p4, 0x3

    .line 2
    iput p4, p0, Lrp0;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, Lrp0;->x:J

    .line 8
    .line 9
    iput-object p3, p0, Lrp0;->y:Lgs2;

    .line 10
    .line 11
    return-void
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

.method public synthetic constructor <init>(JLgs2;IB)V
    .locals 0

    .line 12
    iput p4, p0, Lrp0;->w:I

    iput-wide p1, p0, Lrp0;->x:J

    iput-object p3, p0, Lrp0;->y:Lgs2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lrp0;->w:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    sget-object v3, Lvs7;->a:Lvs7;

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, Lrp0;->y:Lgs2;

    .line 9
    .line 10
    iget-wide v6, p0, Lrp0;->x:J

    .line 11
    .line 12
    check-cast p1, Lyt2;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v4}, Lb85;->v(I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {v6, v7, v5, p1, p0}, Lg75;->e(JLgs2;Lyt2;I)V

    .line 27
    .line 28
    .line 29
    return-object v3

    .line 30
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    and-int/lit8 p2, p0, 0x3

    .line 35
    .line 36
    if-eq p2, v1, :cond_0

    .line 37
    .line 38
    move p2, v4

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move p2, v2

    .line 41
    :goto_0
    and-int/2addr p0, v4

    .line 42
    invoke-virtual {p1, p0, p2}, Lyt2;->V(IZ)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    invoke-static {v6, v7, v5, p1, v2}, Lg75;->e(JLgs2;Lyt2;I)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {p1}, Lyt2;->Y()V

    .line 53
    .line 54
    .line 55
    :goto_1
    return-object v3

    .line 56
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    and-int/lit8 p2, p0, 0x3

    .line 61
    .line 62
    if-eq p2, v1, :cond_2

    .line 63
    .line 64
    move p2, v4

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    move p2, v2

    .line 67
    :goto_2
    and-int/2addr p0, v4

    .line 68
    invoke-virtual {p1, p0, p2}, Lyt2;->V(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-eqz p0, :cond_3

    .line 73
    .line 74
    invoke-static {v6, v7, v5, p1, v2}, Lg75;->e(JLgs2;Lyt2;I)V

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    invoke-virtual {p1}, Lyt2;->Y()V

    .line 79
    .line 80
    .line 81
    :goto_3
    return-object v3

    .line 82
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    and-int/lit8 p2, p0, 0x3

    .line 87
    .line 88
    if-eq p2, v1, :cond_4

    .line 89
    .line 90
    move v2, v4

    .line 91
    :cond_4
    and-int/2addr p0, v4

    .line 92
    invoke-virtual {p1, p0, v2}, Lyt2;->V(IZ)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-eqz p0, :cond_5

    .line 97
    .line 98
    sget-object p0, Lj41;->a:Lyy0;

    .line 99
    .line 100
    invoke-static {v6, v7, p0}, Lb81;->g(JLyy0;)Lju5;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    const/16 p2, 0x8

    .line 105
    .line 106
    invoke-static {p0, v5, p1, p2}, Lt49;->c(Lju5;Lgs2;Lyt2;I)V

    .line 107
    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_5
    invoke-virtual {p1}, Lyt2;->Y()V

    .line 111
    .line 112
    .line 113
    :goto_4
    return-object v3

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
