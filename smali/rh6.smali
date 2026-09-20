.class public final Lrh6;
.super La97;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic A:I

.field public B:I

.field public final synthetic C:Lth6;

.field public synthetic D:J


# direct methods
.method public synthetic constructor <init>(Lth6;JLf61;I)V
    .locals 0

    .line 1
    iput p5, p0, Lrh6;->A:I

    .line 2
    .line 3
    iput-object p1, p0, Lrh6;->C:Lth6;

    .line 4
    .line 5
    iput-wide p2, p0, Lrh6;->D:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, La97;-><init>(ILf61;)V

    .line 9
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

.method public constructor <init>(Lth6;Lf61;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lrh6;->A:I

    .line 12
    iput-object p1, p0, Lrh6;->C:Lth6;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La97;-><init>(ILf61;)V

    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lrh6;->A:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ll35;

    .line 9
    .line 10
    iget-wide v2, p1, Ll35;->a:J

    .line 11
    .line 12
    check-cast p2, Lf61;

    .line 13
    .line 14
    new-instance p1, Lrh6;

    .line 15
    .line 16
    iget-object p0, p0, Lrh6;->C:Lth6;

    .line 17
    .line 18
    invoke-direct {p1, p0, p2}, Lrh6;-><init>(Lth6;Lf61;)V

    .line 19
    .line 20
    .line 21
    iput-wide v2, p1, Lrh6;->D:J

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Lrh6;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_0
    check-cast p1, Lo81;

    .line 29
    .line 30
    check-cast p2, Lf61;

    .line 31
    .line 32
    invoke-virtual {p0, p2, p1}, Lrh6;->o(Lf61;Ljava/lang/Object;)Lf61;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Lrh6;

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lrh6;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, Lo81;

    .line 44
    .line 45
    check-cast p2, Lf61;

    .line 46
    .line 47
    invoke-virtual {p0, p2, p1}, Lrh6;->o(Lf61;Ljava/lang/Object;)Lf61;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Lrh6;

    .line 52
    .line 53
    invoke-virtual {p0, v1}, Lrh6;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :pswitch_2
    check-cast p1, Lo81;

    .line 59
    .line 60
    check-cast p2, Lf61;

    .line 61
    .line 62
    invoke-virtual {p0, p2, p1}, Lrh6;->o(Lf61;Ljava/lang/Object;)Lf61;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, Lrh6;

    .line 67
    .line 68
    invoke-virtual {p0, v1}, Lrh6;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final o(Lf61;Ljava/lang/Object;)Lf61;
    .locals 8

    .line 1
    iget v0, p0, Lrh6;->A:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lrh6;

    .line 7
    .line 8
    iget-object p0, p0, Lrh6;->C:Lth6;

    .line 9
    .line 10
    invoke-direct {v0, p0, p1}, Lrh6;-><init>(Lth6;Lf61;)V

    .line 11
    .line 12
    .line 13
    check-cast p2, Ll35;

    .line 14
    .line 15
    iget-wide p0, p2, Ll35;->a:J

    .line 16
    .line 17
    iput-wide p0, v0, Lrh6;->D:J

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    new-instance v1, Lrh6;

    .line 21
    .line 22
    iget-wide v3, p0, Lrh6;->D:J

    .line 23
    .line 24
    const/4 v6, 0x2

    .line 25
    iget-object v2, p0, Lrh6;->C:Lth6;

    .line 26
    .line 27
    move-object v5, p1

    .line 28
    invoke-direct/range {v1 .. v6}, Lrh6;-><init>(Lth6;JLf61;I)V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :pswitch_1
    move-object v6, p1

    .line 33
    new-instance v2, Lrh6;

    .line 34
    .line 35
    iget-wide v4, p0, Lrh6;->D:J

    .line 36
    .line 37
    const/4 v7, 0x1

    .line 38
    iget-object v3, p0, Lrh6;->C:Lth6;

    .line 39
    .line 40
    invoke-direct/range {v2 .. v7}, Lrh6;-><init>(Lth6;JLf61;I)V

    .line 41
    .line 42
    .line 43
    return-object v2

    .line 44
    :pswitch_2
    move-object v6, p1

    .line 45
    new-instance v2, Lrh6;

    .line 46
    .line 47
    iget-wide v4, p0, Lrh6;->D:J

    .line 48
    .line 49
    const/4 v7, 0x0

    .line 50
    iget-object v3, p0, Lrh6;->C:Lth6;

    .line 51
    .line 52
    invoke-direct/range {v2 .. v7}, Lrh6;-><init>(Lth6;JLf61;I)V

    .line 53
    .line 54
    .line 55
    return-object v2

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lrh6;->A:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lvs7;->a:Lvs7;

    .line 5
    .line 6
    iget-object v3, p0, Lrh6;->C:Lth6;

    .line 7
    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    sget-object v5, Lp81;->w:Lp81;

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget v0, p0, Lrh6;->B:I

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    if-ne v0, v6, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v4}, Lh;->s(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    move-object p1, v7

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-wide v0, p0, Lrh6;->D:J

    .line 36
    .line 37
    iget-object p1, v3, Lth6;->j0:Lzh6;

    .line 38
    .line 39
    iput v6, p0, Lrh6;->B:I

    .line 40
    .line 41
    invoke-static {p1, v0, v1, p0}, Lmh6;->a(Lzh6;JLh61;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v5, :cond_2

    .line 46
    .line 47
    move-object p1, v5

    .line 48
    :cond_2
    :goto_0
    return-object p1

    .line 49
    :pswitch_0
    iget v0, p0, Lrh6;->B:I

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    if-ne v0, v6, :cond_3

    .line 54
    .line 55
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-static {v4}, Lh;->s(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    move-object v2, v7

    .line 63
    goto :goto_1

    .line 64
    :cond_4
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, v3, Lth6;->j0:Lzh6;

    .line 68
    .line 69
    iget-wide v0, p0, Lrh6;->D:J

    .line 70
    .line 71
    iput v6, p0, Lrh6;->B:I

    .line 72
    .line 73
    invoke-virtual {p1, v0, v1, v6, p0}, Lzh6;->c(JZLa97;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-ne p0, v5, :cond_5

    .line 78
    .line 79
    move-object v2, v5

    .line 80
    :cond_5
    :goto_1
    return-object v2

    .line 81
    :pswitch_1
    iget v0, p0, Lrh6;->B:I

    .line 82
    .line 83
    if-eqz v0, :cond_7

    .line 84
    .line 85
    if-ne v0, v6, :cond_6

    .line 86
    .line 87
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_6
    invoke-static {v4}, Lh;->s(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    move-object v2, v7

    .line 95
    goto :goto_2

    .line 96
    :cond_7
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget-object p1, v3, Lth6;->j0:Lzh6;

    .line 100
    .line 101
    iget-wide v3, p0, Lrh6;->D:J

    .line 102
    .line 103
    iput v6, p0, Lrh6;->B:I

    .line 104
    .line 105
    invoke-virtual {p1, v3, v4, v1, p0}, Lzh6;->c(JZLa97;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    if-ne p0, v5, :cond_8

    .line 110
    .line 111
    move-object v2, v5

    .line 112
    :cond_8
    :goto_2
    return-object v2

    .line 113
    :pswitch_2
    iget v0, p0, Lrh6;->B:I

    .line 114
    .line 115
    if-eqz v0, :cond_a

    .line 116
    .line 117
    if-ne v0, v6, :cond_9

    .line 118
    .line 119
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_9
    invoke-static {v4}, Lh;->s(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    move-object v2, v7

    .line 127
    goto :goto_3

    .line 128
    :cond_a
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iget-object p1, v3, Lth6;->j0:Lzh6;

    .line 132
    .line 133
    new-instance v0, Lqh6;

    .line 134
    .line 135
    iget-wide v3, p0, Lrh6;->D:J

    .line 136
    .line 137
    invoke-direct {v0, v3, v4, v7, v1}, Lqh6;-><init>(JLf61;I)V

    .line 138
    .line 139
    .line 140
    iput v6, p0, Lrh6;->B:I

    .line 141
    .line 142
    sget-object v1, Lhq4;->x:Lhq4;

    .line 143
    .line 144
    invoke-virtual {p1, v1, v0, p0}, Lzh6;->g(Lhq4;Lgs2;Lh61;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    if-ne p0, v5, :cond_b

    .line 149
    .line 150
    move-object v2, v5

    .line 151
    :cond_b
    :goto_3
    return-object v2

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
