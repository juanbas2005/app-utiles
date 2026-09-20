.class public final synthetic Lsg1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lhi1;

.field public final synthetic y:Lig1;


# direct methods
.method public synthetic constructor <init>(Lhi1;Lig1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lsg1;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lsg1;->x:Lhi1;

    .line 4
    .line 5
    iput-object p2, p0, Lsg1;->y:Lig1;

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
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lsg1;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    sget-object v2, Ljl4;->w:Ljl4;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, p0, Lsg1;->x:Lhi1;

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v11, p1

    .line 16
    check-cast v11, Lyt2;

    .line 17
    .line 18
    check-cast p2, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    and-int/lit8 p2, p1, 0x3

    .line 25
    .line 26
    if-eq p2, v3, :cond_0

    .line 27
    .line 28
    move p2, v4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move p2, v6

    .line 31
    :goto_0
    and-int/2addr p1, v4

    .line 32
    invoke-virtual {v11, p1, p2}, Lyt2;->V(IZ)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_3

    .line 37
    .line 38
    sget-object p1, Lgi1;->a:Lpa5;

    .line 39
    .line 40
    invoke-static {v2, p1}, Lx91;->J(Lml4;Lla5;)Lml4;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    invoke-virtual {v5}, Lhi1;->a()I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    invoke-virtual {v11, v5}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-virtual {v11}, Lyt2;->Q()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    if-nez p1, :cond_1

    .line 57
    .line 58
    sget-object p1, Lay0;->a:Ld63;

    .line 59
    .line 60
    if-ne p2, p1, :cond_2

    .line 61
    .line 62
    :cond_1
    new-instance p2, Lzh1;

    .line 63
    .line 64
    invoke-direct {p2, v5, v6}, Lzh1;-><init>(Lhi1;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v11, p2}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    move-object v9, p2

    .line 71
    check-cast v9, Lvr2;

    .line 72
    .line 73
    const/4 v12, 0x6

    .line 74
    iget-object v10, p0, Lsg1;->y:Lig1;

    .line 75
    .line 76
    invoke-static/range {v7 .. v12}, Lgi1;->f(Lml4;ILvr2;Lig1;Lyt2;I)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {v11}, Lyt2;->Y()V

    .line 81
    .line 82
    .line 83
    :goto_1
    return-object v1

    .line 84
    :pswitch_0
    move-object v7, p1

    .line 85
    check-cast v7, Lyt2;

    .line 86
    .line 87
    check-cast p2, Ljava/lang/Integer;

    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    and-int/lit8 p2, p1, 0x3

    .line 94
    .line 95
    if-eq p2, v3, :cond_4

    .line 96
    .line 97
    move v6, v4

    .line 98
    :cond_4
    and-int/2addr p1, v4

    .line 99
    invoke-virtual {v7, p1, v6}, Lyt2;->V(IZ)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_5

    .line 104
    .line 105
    move-object p1, v2

    .line 106
    sget-object v2, Llg1;->a:Llg1;

    .line 107
    .line 108
    invoke-virtual {v5}, Lhi1;->a()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    sget-object p2, Lgi1;->b:Lpa5;

    .line 113
    .line 114
    invoke-static {p1, p2}, Lx91;->J(Lml4;Lla5;)Lml4;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    iget-object p0, p0, Lsg1;->y:Lig1;

    .line 119
    .line 120
    iget-wide v5, p0, Lig1;->b:J

    .line 121
    .line 122
    const/16 v8, 0xc30

    .line 123
    .line 124
    invoke-virtual/range {v2 .. v8}, Llg1;->b(ILml4;JLyt2;I)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_5
    invoke-virtual {v7}, Lyt2;->Y()V

    .line 129
    .line 130
    .line 131
    :goto_2
    return-object v1

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
