.class public final Lw27;
.super La97;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public A:I

.field public synthetic B:Lfi2;

.field public synthetic C:I

.field public final synthetic D:Lx27;


# direct methods
.method public constructor <init>(Lx27;Lf61;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw27;->D:Lx27;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, La97;-><init>(ILf61;)V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
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
.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lw27;->D:Lx27;

    .line 4
    .line 5
    iget-wide v2, v1, Lx27;->b:J

    .line 6
    .line 7
    iget-object v4, v0, Lw27;->B:Lfi2;

    .line 8
    .line 9
    iget v5, v0, Lw27;->C:I

    .line 10
    .line 11
    iget v6, v0, Lw27;->A:I

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x5

    .line 15
    const/4 v9, 0x4

    .line 16
    const/4 v10, 0x3

    .line 17
    const/4 v11, 0x2

    .line 18
    const/4 v12, 0x1

    .line 19
    sget-object v13, Lp81;->w:Lp81;

    .line 20
    .line 21
    if-eqz v6, :cond_5

    .line 22
    .line 23
    if-eq v6, v12, :cond_4

    .line 24
    .line 25
    if-eq v6, v11, :cond_3

    .line 26
    .line 27
    if-eq v6, v10, :cond_2

    .line 28
    .line 29
    if-eq v6, v9, :cond_1

    .line 30
    .line 31
    if-ne v6, v8, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v7

    .line 40
    :cond_1
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_2
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_3
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_4
    :goto_0
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_5

    .line 56
    :cond_5
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    if-lez v5, :cond_6

    .line 60
    .line 61
    iput-object v7, v0, Lw27;->B:Lfi2;

    .line 62
    .line 63
    iput v5, v0, Lw27;->C:I

    .line 64
    .line 65
    iput v12, v0, Lw27;->A:I

    .line 66
    .line 67
    sget-object v1, Lhs6;->w:Lhs6;

    .line 68
    .line 69
    invoke-interface {v4, v1, v0}, Lfi2;->k(Ljava/lang/Object;Lf61;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-ne v0, v13, :cond_a

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_6
    iget-wide v14, v1, Lx27;->a:J

    .line 77
    .line 78
    iput-object v4, v0, Lw27;->B:Lfi2;

    .line 79
    .line 80
    iput v5, v0, Lw27;->C:I

    .line 81
    .line 82
    iput v11, v0, Lw27;->A:I

    .line 83
    .line 84
    invoke-static {v14, v15, v0}, Lt49;->G(JLf61;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-ne v1, v13, :cond_7

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_7
    :goto_1
    const-wide/16 v11, 0x0

    .line 92
    .line 93
    cmp-long v1, v2, v11

    .line 94
    .line 95
    if-lez v1, :cond_9

    .line 96
    .line 97
    iput-object v4, v0, Lw27;->B:Lfi2;

    .line 98
    .line 99
    iput v5, v0, Lw27;->C:I

    .line 100
    .line 101
    iput v10, v0, Lw27;->A:I

    .line 102
    .line 103
    sget-object v1, Lhs6;->x:Lhs6;

    .line 104
    .line 105
    invoke-interface {v4, v1, v0}, Lfi2;->k(Ljava/lang/Object;Lf61;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    if-ne v1, v13, :cond_8

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_8
    :goto_2
    iput-object v4, v0, Lw27;->B:Lfi2;

    .line 113
    .line 114
    iput v5, v0, Lw27;->C:I

    .line 115
    .line 116
    iput v9, v0, Lw27;->A:I

    .line 117
    .line 118
    invoke-static {v2, v3, v0}, Lt49;->G(JLf61;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-ne v1, v13, :cond_9

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_9
    :goto_3
    iput-object v7, v0, Lw27;->B:Lfi2;

    .line 126
    .line 127
    iput v5, v0, Lw27;->C:I

    .line 128
    .line 129
    iput v8, v0, Lw27;->A:I

    .line 130
    .line 131
    sget-object v1, Lhs6;->y:Lhs6;

    .line 132
    .line 133
    invoke-interface {v4, v1, v0}, Lfi2;->k(Ljava/lang/Object;Lf61;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    if-ne v0, v13, :cond_a

    .line 138
    .line 139
    :goto_4
    return-object v13

    .line 140
    :cond_a
    :goto_5
    sget-object v0, Lvs7;->a:Lvs7;

    .line 141
    .line 142
    return-object v0
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

.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lfi2;

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
    check-cast p3, Lf61;

    .line 10
    .line 11
    new-instance v0, Lw27;

    .line 12
    .line 13
    iget-object p0, p0, Lw27;->D:Lx27;

    .line 14
    .line 15
    invoke-direct {v0, p0, p3}, Lw27;-><init>(Lx27;Lf61;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, v0, Lw27;->B:Lfi2;

    .line 19
    .line 20
    iput p2, v0, Lw27;->C:I

    .line 21
    .line 22
    sget-object p0, Lvs7;->a:Lvs7;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Lw27;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
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
