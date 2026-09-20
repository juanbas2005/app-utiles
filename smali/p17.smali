.class public final Lp17;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lis2;


# instance fields
.field public final synthetic w:Ljava/util/List;

.field public final synthetic x:Le17;

.field public final synthetic y:Lgs2;

.field public final synthetic z:Laq4;


# direct methods
.method public constructor <init>(Ljava/util/List;Le17;Lgs2;Laq4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp17;->w:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Lp17;->x:Le17;

    .line 7
    .line 8
    iput-object p3, p0, Lp17;->y:Lgs2;

    .line 9
    .line 10
    iput-object p4, p0, Lp17;->z:Laq4;

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


# virtual methods
.method public final C(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lr04;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    move-object v4, p3

    .line 10
    check-cast v4, Lyt2;

    .line 11
    .line 12
    check-cast p4, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    and-int/lit8 p4, p3, 0x6

    .line 19
    .line 20
    if-nez p4, :cond_1

    .line 21
    .line 22
    invoke-virtual {v4, p1}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    const/4 p1, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x2

    .line 31
    :goto_0
    or-int/2addr p1, p3

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move p1, p3

    .line 34
    :goto_1
    and-int/lit8 p3, p3, 0x30

    .line 35
    .line 36
    if-nez p3, :cond_3

    .line 37
    .line 38
    invoke-virtual {v4, p2}, Lyt2;->e(I)Z

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-eqz p3, :cond_2

    .line 43
    .line 44
    const/16 p3, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 p3, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr p1, p3

    .line 50
    :cond_3
    and-int/lit16 p3, p1, 0x93

    .line 51
    .line 52
    const/16 p4, 0x92

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v0, 0x1

    .line 56
    if-eq p3, p4, :cond_4

    .line 57
    .line 58
    move p3, v0

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move p3, v6

    .line 61
    :goto_3
    and-int/2addr p1, v0

    .line 62
    invoke-virtual {v4, p1, p3}, Lyt2;->V(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_9

    .line 67
    .line 68
    iget-object p1, p0, Lp17;->w:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Lo11;

    .line 75
    .line 76
    const p2, 0x5ac09117

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, p2}, Lyt2;->e0(I)V

    .line 80
    .line 81
    .line 82
    iget-boolean p2, p1, Lo11;->n:Z

    .line 83
    .line 84
    if-nez p2, :cond_6

    .line 85
    .line 86
    iget-object p2, p0, Lp17;->x:Le17;

    .line 87
    .line 88
    iget-boolean p2, p2, Le17;->e:Z

    .line 89
    .line 90
    if-eqz p2, :cond_5

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_5
    move v1, v6

    .line 94
    goto :goto_5

    .line 95
    :cond_6
    :goto_4
    move v1, v0

    .line 96
    :goto_5
    invoke-virtual {v4, p1}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    invoke-virtual {v4}, Lyt2;->Q()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    if-nez p2, :cond_7

    .line 105
    .line 106
    sget-object p2, Lay0;->a:Ld63;

    .line 107
    .line 108
    if-ne p3, p2, :cond_8

    .line 109
    .line 110
    :cond_7
    new-instance p3, Lp3;

    .line 111
    .line 112
    iget-object p2, p0, Lp17;->z:Laq4;

    .line 113
    .line 114
    const/16 p4, 0x1b

    .line 115
    .line 116
    invoke-direct {p3, p1, v6, p2, p4}, Lp3;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4, p3}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_8
    move-object v3, p3

    .line 123
    check-cast v3, Lsr2;

    .line 124
    .line 125
    const/4 v5, 0x0

    .line 126
    iget-object v2, p0, Lp17;->y:Lgs2;

    .line 127
    .line 128
    move-object v0, p1

    .line 129
    invoke-static/range {v0 .. v5}, Lq17;->b(Lo11;ZLgs2;Lsr2;Lyt2;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4, v6}, Lyt2;->r(Z)V

    .line 133
    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_9
    invoke-virtual {v4}, Lyt2;->Y()V

    .line 137
    .line 138
    .line 139
    :goto_6
    sget-object p0, Lvs7;->a:Lvs7;

    .line 140
    .line 141
    return-object p0
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
