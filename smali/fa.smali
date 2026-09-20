.class public final Lfa;
.super La97;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic A:I

.field public B:I

.field public synthetic C:Lyg5;

.field public synthetic D:Ljava/lang/Object;

.field public final synthetic E:Lhs2;


# direct methods
.method public synthetic constructor <init>(Lhs2;Lf61;I)V
    .locals 0

    .line 1
    iput p3, p0, Lfa;->A:I

    .line 2
    .line 3
    iput-object p1, p0, Lfa;->E:Lhs2;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p2}, La97;-><init>(ILf61;)V

    .line 7
    .line 8
    .line 9
    return-void
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
.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lfa;->A:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    iget-object v2, p0, Lfa;->E:Lhs2;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    sget-object v4, Lp81;->w:Lp81;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lfa;->C:Lyg5;

    .line 18
    .line 19
    iget-object v8, p0, Lfa;->D:Ljava/lang/Object;

    .line 20
    .line 21
    iget v9, p0, Lfa;->B:I

    .line 22
    .line 23
    if-eqz v9, :cond_2

    .line 24
    .line 25
    if-eq v9, v5, :cond_1

    .line 26
    .line 27
    if-ne v9, v6, :cond_0

    .line 28
    .line 29
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    invoke-static {v3}, Lh;->s(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    move-object v1, v7

    .line 37
    goto :goto_2

    .line 38
    :cond_1
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, v0, Lyg5;->w:Ljava/lang/Object;

    .line 46
    .line 47
    iput-object v0, p0, Lfa;->C:Lyg5;

    .line 48
    .line 49
    iput-object v7, p0, Lfa;->D:Ljava/lang/Object;

    .line 50
    .line 51
    iput v5, p0, Lfa;->B:I

    .line 52
    .line 53
    invoke-interface {v2, p1, v8, p0}, Lhs2;->u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v4, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    :goto_0
    check-cast p1, Lj85;

    .line 61
    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    iput-object v7, p0, Lfa;->C:Lyg5;

    .line 65
    .line 66
    iput-object v7, p0, Lfa;->D:Ljava/lang/Object;

    .line 67
    .line 68
    iput v6, p0, Lfa;->B:I

    .line 69
    .line 70
    invoke-virtual {v0, p0, p1}, Lyg5;->d(Lf61;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-ne p0, v4, :cond_4

    .line 75
    .line 76
    :goto_1
    move-object v1, v4

    .line 77
    :cond_4
    :goto_2
    return-object v1

    .line 78
    :pswitch_0
    iget-object v0, p0, Lfa;->C:Lyg5;

    .line 79
    .line 80
    iget-object v8, p0, Lfa;->D:Ljava/lang/Object;

    .line 81
    .line 82
    iget v9, p0, Lfa;->B:I

    .line 83
    .line 84
    if-eqz v9, :cond_7

    .line 85
    .line 86
    if-eq v9, v5, :cond_6

    .line 87
    .line 88
    if-ne v9, v6, :cond_5

    .line 89
    .line 90
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_5
    invoke-static {v3}, Lh;->s(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    move-object v1, v7

    .line 98
    goto :goto_5

    .line 99
    :cond_6
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_7
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    instance-of p1, v8, Lj85;

    .line 107
    .line 108
    if-nez p1, :cond_8

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_8
    iget-object p1, v0, Lyg5;->w:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v0, p0, Lfa;->C:Lyg5;

    .line 114
    .line 115
    iput-object v7, p0, Lfa;->D:Ljava/lang/Object;

    .line 116
    .line 117
    iput v5, p0, Lfa;->B:I

    .line 118
    .line 119
    invoke-interface {v2, p1, v8, p0}, Lhs2;->u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    if-ne p1, v4, :cond_9

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_9
    :goto_3
    check-cast p1, Lj85;

    .line 127
    .line 128
    if-nez p1, :cond_a

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_a
    iput-object v7, p0, Lfa;->C:Lyg5;

    .line 132
    .line 133
    iput-object v7, p0, Lfa;->D:Ljava/lang/Object;

    .line 134
    .line 135
    iput v6, p0, Lfa;->B:I

    .line 136
    .line 137
    invoke-virtual {v0, p0, p1}, Lyg5;->d(Lf61;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    if-ne p0, v4, :cond_b

    .line 142
    .line 143
    :goto_4
    move-object v1, v4

    .line 144
    :cond_b
    :goto_5
    return-object v1

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lfa;->A:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    iget-object p0, p0, Lfa;->E:Lhs2;

    .line 6
    .line 7
    check-cast p1, Lyg5;

    .line 8
    .line 9
    check-cast p3, Lf61;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v0, Lfa;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v0, p0, p3, v2}, Lfa;-><init>(Lhs2;Lf61;I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, Lfa;->C:Lyg5;

    .line 21
    .line 22
    iput-object p2, v0, Lfa;->D:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lfa;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    new-instance v0, Lfa;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-direct {v0, p0, p3, v2}, Lfa;-><init>(Lhs2;Lf61;I)V

    .line 33
    .line 34
    .line 35
    iput-object p1, v0, Lfa;->C:Lyg5;

    .line 36
    .line 37
    iput-object p2, v0, Lfa;->D:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lfa;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
