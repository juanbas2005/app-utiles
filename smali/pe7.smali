.class public final Lpe7;
.super La97;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public A:I

.field public synthetic B:Lco5;

.field public synthetic C:J

.field public final synthetic D:Lo81;

.field public final synthetic E:Laq4;

.field public final synthetic F:Lap4;


# direct methods
.method public constructor <init>(Lo81;Laq4;Lap4;Lf61;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpe7;->D:Lo81;

    .line 2
    .line 3
    iput-object p2, p0, Lpe7;->E:Laq4;

    .line 4
    .line 5
    iput-object p3, p0, Lpe7;->F:Lap4;

    .line 6
    .line 7
    const/4 p1, 0x3

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


# virtual methods
.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lpe7;->A:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    iget-object v2, p0, Lpe7;->D:Lo81;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-ne v0, v4, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v3

    .line 22
    :cond_1
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lpe7;->B:Lco5;

    .line 26
    .line 27
    iget-wide v7, p0, Lpe7;->C:J

    .line 28
    .line 29
    new-instance v5, Lq0;

    .line 30
    .line 31
    const/4 v10, 0x0

    .line 32
    const/4 v11, 0x4

    .line 33
    iget-object v6, p0, Lpe7;->E:Laq4;

    .line 34
    .line 35
    iget-object v9, p0, Lpe7;->F:Lap4;

    .line 36
    .line 37
    invoke-direct/range {v5 .. v11}, Lq0;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lf61;I)V

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3, v3, v5, v1}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 41
    .line 42
    .line 43
    iput v4, p0, Lpe7;->A:I

    .line 44
    .line 45
    invoke-virtual {p1, p0}, Lco5;->f(Lh61;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    sget-object v0, Lp81;->w:Lp81;

    .line 50
    .line 51
    if-ne p1, v0, :cond_2

    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    new-instance v0, Lhv;

    .line 61
    .line 62
    iget-object v4, p0, Lpe7;->E:Laq4;

    .line 63
    .line 64
    iget-object p0, p0, Lpe7;->F:Lap4;

    .line 65
    .line 66
    invoke-direct {v0, v4, p1, p0, v3}, Lhv;-><init>(Laq4;ZLap4;Lf61;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v2, v3, v3, v0, v1}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 70
    .line 71
    .line 72
    sget-object p0, Lvs7;->a:Lvs7;

    .line 73
    .line 74
    return-object p0
    .line 75
    .line 76
.end method

.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lco5;

    .line 2
    .line 3
    check-cast p2, Ll35;

    .line 4
    .line 5
    iget-wide v0, p2, Ll35;->a:J

    .line 6
    .line 7
    check-cast p3, Lf61;

    .line 8
    .line 9
    new-instance p2, Lpe7;

    .line 10
    .line 11
    iget-object v2, p0, Lpe7;->E:Laq4;

    .line 12
    .line 13
    iget-object v3, p0, Lpe7;->F:Lap4;

    .line 14
    .line 15
    iget-object p0, p0, Lpe7;->D:Lo81;

    .line 16
    .line 17
    invoke-direct {p2, p0, v2, v3, p3}, Lpe7;-><init>(Lo81;Laq4;Lap4;Lf61;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p2, Lpe7;->B:Lco5;

    .line 21
    .line 22
    iput-wide v0, p2, Lpe7;->C:J

    .line 23
    .line 24
    sget-object p0, Lvs7;->a:Lvs7;

    .line 25
    .line 26
    invoke-virtual {p2, p0}, Lpe7;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
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
